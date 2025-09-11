package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Categoria;
import br.com.ecommerce.api.service.CategoriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService service) {
        categoriaService = service;
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> listarCategorias(){
        List<Categoria> categorias = categoriaService.listarCategorias();
        return ResponseEntity.ok(categorias);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscarCategoriaPorId(@PathVariable Integer id){
        Categoria categoria = categoriaService.pesquisarPorId(id);
        return ResponseEntity.ok(categoria);
    }

    @PostMapping
    public ResponseEntity<Categoria> cadastrarCategoria(@RequestBody Categoria categoria){
        Categoria novacategoria = categoriaService.cadastrarCategoria(categoria);
        return ResponseEntity.ok(categoria);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?>  atualizarCategoria(@PathVariable Integer id, @RequestBody Categoria categoriaAtualizada){
        Categoria categoriaExistente = categoriaService.atualizarCategoria(id, categoriaAtualizada);
        if(categoriaExistente == null){
            return ResponseEntity.badRequest().body("Categoria não encontrada");
        }
        return ResponseEntity.ok(categoriaAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarCategoria(@PathVariable Integer id){
        Categoria categoriaDeletado = categoriaService.pesquisarPorId(id);
        if(categoriaDeletado == null){
            return ResponseEntity.badRequest().body("Categoria não encontrada");
        }
        return ResponseEntity.ok(categoriaDeletado);
    }

}
