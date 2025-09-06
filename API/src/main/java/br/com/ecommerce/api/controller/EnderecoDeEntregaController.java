package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.EnderecoDeEntrega;
import br.com.ecommerce.api.service.EnderecoDeEntregaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
