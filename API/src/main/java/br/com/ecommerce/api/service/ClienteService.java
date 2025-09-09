package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    //Injeção de dependência
    private final ClienteRepository clienteRepository;

    //Construtor
    public ClienteService(ClienteRepository repo) {
        clienteRepository = repo;
    }

    //Lista todos os clientes
    public List<Cliente> listarClientes(){
        // findAll vem do JpaRepository -  buscar tudo
        return clienteRepository.findAll();
    }

    public Cliente cadastrarCliente(Cliente cliente){
        //Save = Insert into
        return clienteRepository.save(cliente);
    }

    public Cliente buscarClientePorId(Integer id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if(cliente.isEmpty()) {
            return null;
        }
        return cliente.get();
        // return produtoRepository.findById(id).orElse(null);
    }
}
