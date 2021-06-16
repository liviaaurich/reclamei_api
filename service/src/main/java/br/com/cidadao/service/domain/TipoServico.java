package br.com.cidadao.service.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Getter
@Setter
public class TipoServico {

    @Id
    @GeneratedValue(generator = "tipo_servico_generator", strategy = SEQUENCE)
    @SequenceGenerator(allocationSize = 1, name = "tipo_servico_generator", sequenceName = "seq_tipo_servico")
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(length = 511, nullable = false)
    private String descricao;

    @OneToMany(mappedBy = "tipoServico", orphanRemoval = true)
    private List<TipoReclamacao> tiposReclamacao;

}