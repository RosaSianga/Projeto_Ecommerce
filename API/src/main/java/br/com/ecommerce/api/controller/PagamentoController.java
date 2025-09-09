package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Pagamento;
import br.com.ecommerce.api.service.PagamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagamentos")
public class PagamentoController {

    private final PagamentoService pagamentoService;


    public PagamentoController(PagamentoService service) {
        pagamentoService = service;
    }

    @GetMapping
    public ResponseEntity<List<Pagamento>> listarPagamentos(){
        List<Pagamento> pagamentos = pagamentoService.listarPagamentos();
        return ResponseEntity.ok(pagamentos);
    }

    @PostMapping
    public ResponseEntity<Pagamento> cadastrarPagamento(@RequestBody Pagamento pagamento){
        Pagamento novoPagamento = pagamentoService.cadastrarPagamento(pagamento);
        return ResponseEntity.ok(novoPagamento);
    }
}
