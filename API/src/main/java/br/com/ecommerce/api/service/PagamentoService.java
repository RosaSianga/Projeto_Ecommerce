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

    public Pagamento buscarPagamentoPorId(Integer id){
        return pagamentoRepository.findById(id).orElse(null);
    }

    public Pagamento atualizarPagamento(Integer id, Pagamento pagamentoNovo){
        Pagamento pagamentoExistente = buscarPagamentoPorId(id);
        if (pagamentoExistente == null){
            return null;
        }

        pagamentoExistente.setFormaPagamento(pagamentoNovo.getFormaPagamento());
        pagamentoExistente.setDataPagamento(pagamentoNovo.getDataPagamento());

        pagamentoRepository.save(pagamentoExistente);
        return pagamentoExistente;
    }

    public Pagamento deletarPagamento (Integer id){
        Pagamento pagamentoExistente = buscarPagamentoPorId(id);
        if (pagamentoExistente == null){
            return null;
        }
        pagamentoRepository.delete(pagamentoExistente);
        return pagamentoExistente;
    }
}
