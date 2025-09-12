package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Cliente;
import br.com.ecommerce.api.repository.ClienteRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
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
    public List<Cliente> listarClientes() {
        // findAll vem do JpaRepository -  buscar tudo
        return clienteRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    public Cliente cadastrarCliente(Cliente cliente) {
        //Save = Insert into
        cliente.setDataCadastro(OffsetDateTime.now());
        return clienteRepository.save(cliente);
    }

    public Cliente buscarClientePorId(Integer id) {
//        Optional<Cliente> cliente = clienteRepository.findById(id);
//        if(cliente.isEmpty()) {
//            return null;
//        }
//        return cliente.get();
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente atualizarCliente(Integer id, Cliente novocliente) {
        Cliente clienteExistente = buscarClientePorId(id);

        if (clienteExistente == null) {
            return null;
        }

        clienteExistente.setNomeCompleto(novocliente.getNomeCompleto());
        clienteExistente.setEmail(novocliente.getEmail());
        clienteExistente.setSenha(novocliente.getSenha());
        clienteExistente.setTelefone(novocliente.getTelefone());
        clienteExistente.setDataCadastro(OffsetDateTime.now());

        return clienteRepository.save(clienteExistente);
    }

    public Cliente deletarClientePorId(Integer id) {
        Cliente cliente = buscarClientePorId(id);

        if (cliente == null) {
            return null;
        }
        clienteRepository.delete(cliente);
        return cliente;
    }
}
