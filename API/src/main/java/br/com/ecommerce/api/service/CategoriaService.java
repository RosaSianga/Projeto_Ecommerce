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

    public Categoria cadastrarCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public Categoria pesquisarPorId(Integer id){
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria atualizarCategoria(Integer id, Categoria categoriaAtualizada){
        Categoria categoriaExstente = pesquisarPorId(id);
        if(categoriaExstente == null){
            return null;
        }
        categoriaAtualizada.setNomeCategoria(categoriaExstente.getNomeCategoria());
        categoriaAtualizada.setDescricao(categoriaExstente.getDescricao());

        return categoriaRepository.save(categoriaAtualizada);
    }

    public Categoria deletarCategoria(Integer id){
        Categoria categoriaExistente = pesquisarPorId(id);
        if(categoriaExistente == null){
            return null;
        }
        categoriaRepository.delete(categoriaExistente);
        return categoriaExistente;
    }

}
