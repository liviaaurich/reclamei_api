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
public class Orgao {

    @Id
    @GeneratedValue(generator = "orgao_generator", strategy = SEQUENCE)
    @SequenceGenerator(allocationSize = 1, name = "orgao_generator", sequenceName = "seq_orgao")
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 14, nullable = false, unique = true)
    private String cnpj;

    @Column(length = 511, nullable = false)
    private String descricao;

    @Column(length = 11, nullable = false)
    private String celular;

    @Column(length = 10, nullable = false)
    private String telefoneSac;

}