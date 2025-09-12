package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Produto;
import br.com.ecommerce.api.repository.ProdutoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    // Injeção de Dependência
    private final ProdutoRepository produtoRepository;

    //Construtor
    public ProdutoService(ProdutoRepository repo){
        produtoRepository = repo;
    }

    //Pesquisar todos
    public List<Produto> listarProdutos(){

        return produtoRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    //Cadastrar
    public Produto cadastrarProduto(Produto produto){

        return produtoRepository.save(produto);
    }

    //Pesquisa por ID
    public Produto buscarProdutoPorId(int id){
        return produtoRepository.findById(id).orElse(null);
    }

    //Atualizar
    public Produto atualizarProduto(Integer id, Produto produtonovo){
        Produto produtoExistente = buscarProdutoPorId(id);
        if (produtoExistente == null) {
            return null;
        }
        produtoExistente.setNomeProduto(produtonovo.getNomeProduto());
        return produtoRepository.save(produtoExistente);
    }

    //Deletar
    public Produto deletarProduto(Integer id){
        Produto produtoExistente = buscarProdutoPorId(id);

        if (produtoExistente == null) {
            return null;
        }
        produtoRepository.delete(produtoExistente);
        return produtoExistente;

    }
}
