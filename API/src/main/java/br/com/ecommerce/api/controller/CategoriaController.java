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

    @PostMapping
    public ResponseEntity<Categoria> cadastrarCategoria(@RequestBody Categoria categoria){
        Categoria novacategoria = categoriaService.cadastrarCategoria(categoria);
        return ResponseEntity.ok(categoria);
    }

}
