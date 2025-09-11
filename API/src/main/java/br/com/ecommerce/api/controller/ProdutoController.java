package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.model.Produto;
import br.com.ecommerce.api.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    public final ProdutoService produtoService;

    public ProdutoController(ProdutoService service) {
        produtoService = service;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listarProdutos() {
        List<Produto> produtos = produtoService.listarProdutos();
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarProdutoPorId(@PathVariable int id) {
        Produto produto = produtoService.buscarProdutoPorId(id);
        return ResponseEntity.ok(produto);
    }

    @PostMapping
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto){
        Produto novoProduto = produtoService.cadastrarProduto(produto);
        return ResponseEntity.ok(novoProduto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizarProduto(@PathVariable Integer id, @RequestBody Produto produtoAtualizado){
        Produto produtoExistente = produtoService.atualizarProduto(id, produtoAtualizado);
        if (produtoExistente == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(produtoExistente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarProduto(@PathVariable Integer id){
        Produto produtoDeletado = produtoService.deletarProduto(id);
        if (produtoDeletado == null){
            return ResponseEntity.badRequest().body("Produto nao encontrado");
        }
        return  ResponseEntity.ok(produtoDeletado);
    }
}
