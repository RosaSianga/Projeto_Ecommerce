package br.com.ecommerce.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "endereco_de_entrega", schema = "ecommerce")
public class EnderecoDeEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "endereco_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @Column(name = "logradouro", nullable = false, length = Integer.MAX_VALUE)
    private String logradouro;

    @Column(name = "numero", nullable = false, length = 10)
    private String numero;

    @Column(name = "complemento", length = Integer.MAX_VALUE)
    private String complemento;

    @Column(name = "bairro", nullable = false, length = Integer.MAX_VALUE)
    private String bairro;

    @Column(name = "cidade", nullable = false, length = Integer.MAX_VALUE)
    private String cidade;

    @Column(name = "estado", nullable = false, length = 2)
    private String estado;

    @Column(name = "cep", nullable = false, length = Integer.MAX_VALUE)
    private String cep;

}