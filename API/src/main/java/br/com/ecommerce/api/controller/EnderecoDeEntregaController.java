package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.EnderecoDeEntrega;
import br.com.ecommerce.api.service.EnderecoDeEntregaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoDeEntregaController {

    private final EnderecoDeEntregaService enderecoDeEntregaService;

    public EnderecoDeEntregaController(EnderecoDeEntregaService service) {
        enderecoDeEntregaService = service;
    }

    @GetMapping
    public ResponseEntity<List<EnderecoDeEntrega>> listarEnderecos(){
        List<EnderecoDeEntrega> enderecos = enderecoDeEntregaService.listarEnderecos();
        return ResponseEntity.ok(enderecos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?>  buscarEnderecoPorId(@PathVariable Integer id){
        EnderecoDeEntrega enderecoDeEntrega = enderecoDeEntregaService.buscarEnderecoPorId(id);
        if(enderecoDeEntrega == null){
            return ResponseEntity.badRequest().body("Endereço não encontrado");
        }
        return ResponseEntity.ok(enderecoDeEntrega);
    }

    @PostMapping
    public ResponseEntity <EnderecoDeEntrega> cadastrarEnderco(@RequestBody EnderecoDeEntrega enderecoDeEntrega){
        EnderecoDeEntrega novoEndereco = enderecoDeEntregaService.cadastrarEndereco(enderecoDeEntrega);
        return ResponseEntity.ok(novoEndereco);
    }

    @PutMapping("/{id}")
    public ResponseEntity <?> atualizarEndereco(@PathVariable Integer id,  @RequestBody EnderecoDeEntrega enderecoDeEntregaAtualizado){
        EnderecoDeEntrega enderecoExistente = enderecoDeEntregaService.atualizarEndereco(id, enderecoDeEntregaAtualizado);
        if (enderecoExistente == null){
            return ResponseEntity.badRequest().body("Endereço não encontrado");
        }
        return ResponseEntity.ok(enderecoDeEntregaAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <?> deletarEndereco(@PathVariable Integer id){
        EnderecoDeEntrega enderecoDeletado = enderecoDeEntregaService.deletarEndereco(id);
        if (enderecoDeletado == null){
            return ResponseEntity.badRequest().body("Endereço não encontrado");
        }
        return ResponseEntity.ok(enderecoDeletado);
    }
}
