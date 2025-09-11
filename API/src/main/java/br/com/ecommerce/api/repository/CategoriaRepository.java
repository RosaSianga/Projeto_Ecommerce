package br.com.ecommerce.api.repository;

import br.com.ecommerce.api.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
// JPQL
//    @Query("")
//    public List<Categoria> listarPorX(String nome);
}
