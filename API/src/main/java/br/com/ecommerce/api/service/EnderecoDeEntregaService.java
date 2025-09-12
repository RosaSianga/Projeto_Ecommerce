package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.EnderecoDeEntrega;
import br.com.ecommerce.api.repository.EnderecoDeEntregaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EnderecoDeEntregaService {

    private final EnderecoDeEntregaRepository enderecoDeEntregaRepository;


    public EnderecoDeEntregaService(EnderecoDeEntregaRepository repo) {
        enderecoDeEntregaRepository = repo;
    }

    public List<EnderecoDeEntrega> listarEnderecos(){
        return enderecoDeEntregaRepository.findAll();
    }

    public EnderecoDeEntrega cadastrarEndereco(@RequestBody EnderecoDeEntrega enderecoDeEntrega){
        return enderecoDeEntregaRepository.save(enderecoDeEntrega);
    }

    public EnderecoDeEntrega buscarEnderecoPorId(Integer id){
        return enderecoDeEntregaRepository.findById(id).orElse(null);
    }

    public EnderecoDeEntrega atualizarEndereco(Integer id, EnderecoDeEntrega novoEndereco){
        EnderecoDeEntrega enderecoExistente = buscarEnderecoPorId(id);
        if (enderecoExistente == null) {
            return null;
        }

        enderecoExistente.setLogradouro(novoEndereco.getLogradouro());
        enderecoExistente.setNumero(novoEndereco.getNumero());
        if  (enderecoExistente.getComplemento() == null) {
            enderecoExistente.setComplemento(novoEndereco.getComplemento());
        }
        enderecoExistente.setBairro(novoEndereco.getBairro());
        enderecoExistente.setCidade(novoEndereco.getCidade());
        enderecoExistente.setEstado(novoEndereco.getEstado());

        return enderecoDeEntregaRepository.save(enderecoExistente);
    }

    public EnderecoDeEntrega deletarEndereco (Integer id){
        EnderecoDeEntrega enderecoExistente = buscarEnderecoPorId(id);
        if (enderecoExistente == null) {
            return null;
        }
        enderecoDeEntregaRepository.delete(enderecoExistente);
        return enderecoExistente;
    }
}
