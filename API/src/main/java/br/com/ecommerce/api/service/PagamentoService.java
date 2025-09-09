package br.com.ecommerce.api.service;

import br.com.ecommerce.api.model.Pagamento;
import br.com.ecommerce.api.repository.ItemDoPedidoRepository;
import br.com.ecommerce.api.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagamentoService {

    private final PagamentoRepository pagamentoRepository;
    private final ItemDoPedidoRepository itemDoPedidoRepository;

    public PagamentoService(PagamentoRepository repo, ItemDoPedidoRepository itemDoPedidoRepository) {

        pagamentoRepository = repo;
        this.itemDoPedidoRepository = itemDoPedidoRepository;
    }

    public List<Pagamento> listarPagamentos(){

        return pagamentoRepository.findAll();
    }

    public Pagamento cadastrarPagamento(Pagamento pagamento){
        return pagamentoRepository.save(pagamento);
    }
}
