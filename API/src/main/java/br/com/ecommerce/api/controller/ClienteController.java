package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes") //Link do Controller
public class ClienteController {

    // Injeção de dependência
    private final ClienteService clienteService;

    public ClienteController(ClienteService service) {
        clienteService = service;
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listarClientes() {
        // ResponseEntity - Tipo especial para site
        List<Cliente> clientes = clienteService.listarClientes();
        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> ConsultarPeloId(@PathVariable Integer id) {
        //Variavel precisa ser identica a informação do caminho
        // 1- Procurar o valor
        Cliente cliente = clienteService.buscarClientePorId(id);
        // 2 - Senão encontrar, retornar o erro
        if (cliente == null) {
            return ResponseEntity.notFound().build();
            //retorno com mais detalhes
            //return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente " + id + " não encontrado");
        }
        // 3 - Se encontrar, retornar o resultado
        return ResponseEntity.ok(cliente);
    }

    @PostMapping
    public ResponseEntity<Cliente> cadastrarClientes(@RequestBody Cliente clientes) {
        Cliente novoCliente = clienteService.cadastrarCliente(clientes);
        return ResponseEntity.ok(novoCliente); // Retorno 200
        //return ResponseEntity.status(HttpStatus.CREATED).body(novoCliente); // Retorno 201
    }
    //@RequestBody vai receber informação no corpo da requisição
    //@PathVariable recebe a informação no link da requisição

    // 1- Procurar o valor
    // 2 - Senão encontrar, retornar o erro
    // 3 - Se encontrar, retornar o resultado

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable Integer id, @RequestBody Cliente cliente) {
        Cliente clienteAtualizado = clienteService.atualizarCliente(id, cliente);
        if (clienteAtualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(clienteAtualizado);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarClientes(@PathVariable Integer id) {
        Cliente clienteDeletado = clienteService.deletarClientePorId(id);
        if (clienteDeletado == null) {
            return ResponseEntity.badRequest().body("Cliente não encontrado");
        }
        return ResponseEntity.noContent().build();
    }

}