package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.ItemDoPedido;
import br.com.ecommerce.api.service.ItemDoPedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/itens")
public class ItemDoPedidoController {

    private final ItemDoPedidoService itemDoPedidoService;

    public ItemDoPedidoController(ItemDoPedidoService service) {
        itemDoPedidoService = service;
    }

    @GetMapping
    public ResponseEntity<List<ItemDoPedido>> listarItens(){
        List<ItemDoPedido> itemPedido = itemDoPedidoService.listarItens();
        return ResponseEntity.ok(itemPedido);
    }

    @PostMapping
    public ResponseEntity <ItemDoPedido> cadastrarItemDoPedido(@RequestBody ItemDoPedido itemDoPedido){
        ItemDoPedido novoItem = itemDoPedidoService.cadastrarItemDoPedido(itemDoPedido);
        return ResponseEntity.ok(novoItem);
    }
}
