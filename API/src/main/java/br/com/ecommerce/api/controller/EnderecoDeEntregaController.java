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

    @PostMapping
    public ResponseEntity <EnderecoDeEntrega> cadastrarEnderco(@RequestBody EnderecoDeEntrega enderecoDeEntrega){
        EnderecoDeEntrega novoEndereco = enderecoDeEntregaService.cadastrarEndereco(enderecoDeEntrega);
        return ResponseEntity.ok(novoEndereco);
    }
}
