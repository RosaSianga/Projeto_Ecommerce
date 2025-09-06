package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
