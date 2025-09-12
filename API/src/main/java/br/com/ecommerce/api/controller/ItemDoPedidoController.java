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

    @GetMapping("/{id}")
    public ResponseEntity<ItemDoPedido> buscarItemPedidoPorId(@PathVariable Integer id){
        ItemDoPedido itemDoPedido = itemDoPedidoService.buscarItemDoPedidoPorId(id);
        if (itemDoPedido == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(itemDoPedido);
    }

    @PostMapping
    public ResponseEntity <ItemDoPedido> cadastrarItemDoPedido(@RequestBody ItemDoPedido itemDoPedido){
        ItemDoPedido novoItem = itemDoPedidoService.cadastrarItemDoPedido(itemDoPedido);
        return ResponseEntity.ok(novoItem);
    }

    @PutMapping("/{id}")
    public ResponseEntity <?> atualizarItemDoPedido(@PathVariable Integer id, @RequestBody ItemDoPedido itemDoPedidoAtualizado){
        ItemDoPedido itemDoPedido = itemDoPedidoService.atualizarItemDoPedido(id, itemDoPedidoAtualizado);
        if (itemDoPedido == null){
            return ResponseEntity.badRequest().body("Item com id: " + id + "não Encontrado");
        }
        return ResponseEntity.ok(itemDoPedido);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarItemDoPedido(@PathVariable Integer id){
        ItemDoPedido itemDoPedidoDeletado = itemDoPedidoService.deletarItemDoPedido(id);
        if (itemDoPedidoDeletado == null){
            return ResponseEntity.badRequest().body("Item com id: " + id + "não Encontrado");
        }
        return ResponseEntity.ok(itemDoPedidoDeletado);
    }
}
