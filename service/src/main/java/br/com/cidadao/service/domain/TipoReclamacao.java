package br.com.cidadao.service.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Getter
@Setter
public class TipoReclamacao {

    @Id
    @GeneratedValue(generator = "tipo_reclamacao_generator", strategy = SEQUENCE)
    @SequenceGenerator(allocationSize = 1, name = "tipo_reclamacao_generator", sequenceName = "seq_tipo_reclamacao")
    private Long id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne(fetch = LAZY)
    private TipoServico tipoServico;

}