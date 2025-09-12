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

    @GetMapping("/{id}")
    public ResponseEntity<Pagamento> buscarPagamentoPorId(@PathVariable Integer id){
        return ResponseEntity.ok(pagamentoService.buscarPagamentoPorId(id));
    }

    @PostMapping
    public ResponseEntity<Pagamento> cadastrarPagamento(@RequestBody Pagamento pagamento){
        Pagamento novoPagamento = pagamentoService.cadastrarPagamento(pagamento);
        return ResponseEntity.ok(novoPagamento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarPagamento(@PathVariable Integer id, @RequestBody Pagamento pagamentoAtualizado){
        Pagamento pagamento = pagamentoService.atualizarPagamento(id, pagamentoAtualizado);
        if (pagamento == null){
            return ResponseEntity.badRequest().body("Pagamento não localizado. ID: " + id);
        }
        return ResponseEntity.ok(pagamento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarPagamento(@PathVariable Integer id){
        Pagamento pagamento = pagamentoService.deletarPagamento(id);
        if (pagamento == null){
            return ResponseEntity.badRequest().body("Pagamento não localizado. ID: " + id);
        }
        return ResponseEntity.ok(pagamento);
    }
}
