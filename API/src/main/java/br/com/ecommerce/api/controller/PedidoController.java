package br.com.ecommerce.api.controller;

import br.com.ecommerce.api.model.Pedido;
import br.com.ecommerce.api.service.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService service) {
        pedidoService = service;
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> listarPedidos(){
        List<Pedido> pedidos = pedidoService.listarPedido();
        return ResponseEntity.ok(pedidos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPedidoPorId(@PathVariable int id){
        Pedido pedido = pedidoService.buscarPedidoPorId(id);
        return ResponseEntity.ok(pedido);
    }

    @PostMapping
    public ResponseEntity<Pedido> salvarPedido(@RequestBody Pedido pedido){
        Pedido novoPedido = pedidoService.cadastrarPedido(pedido);
        return ResponseEntity.ok(novoPedido);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarPedido(@PathVariable Integer id, @RequestBody Pedido pedidoAtualizado){
        Pedido pedidoExistente = pedidoService.atualizarPedido(id, pedidoAtualizado);
        if (pedidoExistente == null){
            return ResponseEntity.badRequest().body("Pedido não Encontrado");

        }
        pedidoAtualizado.setId(pedidoExistente.getId());
        return ResponseEntity.ok(pedidoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarPedidoPorId(@PathVariable int id){
        Pedido pedidoExistente = pedidoService.deletarPedido(id);
        if  (pedidoExistente == null){
            return ResponseEntity.badRequest().body("Pedido Não Encontrado");
        }
        return ResponseEntity.ok(pedidoExistente);
    }
}
