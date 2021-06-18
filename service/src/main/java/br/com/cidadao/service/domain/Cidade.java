package br.com.cidadao.service.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Getter
@Setter
public class Cidade {

    @Id
    @GeneratedValue(generator = "cidade_generator", strategy = SEQUENCE)
    @SequenceGenerator(allocationSize = 1, name = "cidade_generator", sequenceName = "seq_cidade")
    private Long id;

    @Column(nullable = false)
    private String nome;

}