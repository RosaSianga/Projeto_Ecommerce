package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/clientes")
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

    @PostMapping
    public ResponseEntity<Cliente> cadastrarClientes(@RequestBody Cliente clientes) {
        Cliente novoCliente = clienteService.cadastrarCliente(clientes);
        return ResponseEntity.ok(novoCliente); // Retorno 200
        //return ResponseEntity.status(HttpStatus.CREATED).body(novoCliente); // Retorno 201
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> ConsultarPeloId(@PathVariable Integer id) {
        Cliente cliente = clienteService.buscarClientePorId(id);
        if(cliente == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cliente);
    }

}