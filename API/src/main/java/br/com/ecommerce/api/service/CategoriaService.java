package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Categoria;
import br.com.ecommerce.api.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;


    public CategoriaService(CategoriaRepository repo) {
        categoriaRepository = repo;
    }

    public List<Categoria> listarCategorias(){
        return categoriaRepository.findAll();
    }
}
