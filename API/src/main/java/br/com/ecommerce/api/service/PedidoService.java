package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Pedido;
import br.com.ecommerce.api.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository repo) {

        pedidoRepository = repo;
    }

    public List<Pedido> listarPedido(){
        return pedidoRepository.findAll();
    }

    public Pedido cadastrarPedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    public Pedido buscarPedidoPorId(int id){
        return pedidoRepository.findById(id).orElse(null);
    }

    public Pedido atualizarPedido(int id, Pedido pedidoAtualizado){
        Pedido pedidoExistente = buscarPedidoPorId(id);
        if(pedidoExistente != null){
            return null;
        }
        pedidoAtualizado.setStatus(pedidoExistente.getStatus());
        return pedidoRepository.save(pedidoAtualizado);
    }

    public Pedido deletarPedido(int id){
        Pedido pedidoExistente = buscarPedidoPorId(id);
        if(pedidoExistente == null){
            return null;
        }
        pedidoRepository.delete(pedidoExistente);
        return pedidoExistente;

    }
}
