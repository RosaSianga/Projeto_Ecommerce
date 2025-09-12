package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.ItemDoPedido;
import br.com.ecommerce.api.repository.ItemDoPedidoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ItemDoPedidoService {

    private final ItemDoPedidoRepository itemDoPedidoRepository;


    public ItemDoPedidoService(ItemDoPedidoRepository repo) {
        itemDoPedidoRepository = repo;
    }

    public List<ItemDoPedido> listarItens() {
        return itemDoPedidoRepository.findAll();
    }

    public ItemDoPedido cadastrarItemDoPedido(ItemDoPedido itemDoPedido){
        return itemDoPedidoRepository.save(itemDoPedido);
    }

    public ItemDoPedido buscarItemDoPedidoPorId(Integer id){
        return itemDoPedidoRepository.findById(id).orElse(null);
    }

    public ItemDoPedido atualizarItemDoPedido(Integer id, ItemDoPedido itemPedidoNovo){
        ItemDoPedido itemPedidoExistente = buscarItemDoPedidoPorId(id);
        if (itemPedidoExistente == null) {
            return null;
        }

        itemPedidoExistente.setPedido(itemPedidoNovo.getPedido());
        itemPedidoExistente.setProduto(itemPedidoNovo.getProduto());
        itemPedidoExistente.setQuantidade(itemPedidoNovo.getQuantidade());

        itemDoPedidoRepository.save(itemPedidoExistente);
        return itemPedidoExistente;
    }

    public ItemDoPedido deletarItemDoPedido(Integer id){
        ItemDoPedido itemPedidoExistente = buscarItemDoPedidoPorId(id);
        if (itemPedidoExistente == null) {
            return null;
        }
        itemDoPedidoRepository.delete(itemPedidoExistente);
        return itemPedidoExistente;
    }

}
