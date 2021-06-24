package br.com.cidadao.service.service.dto;

import org.hibernate.validator.constraints.br.CNPJ;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class OrgaoCadastroDTO {

    private Long id;

    @NotBlank
    private String nome;

    @Email
    @NotBlank
    private String email;

    @CNPJ
    @NotBlank
    private String cnpj;

    @NotBlank
    private String descricao;

    @Pattern(regexp = "\\d{11}")
    @NotBlank
    private String celular;

    @Pattern(regexp = "\\d{10}")
    @NotBlank
    private String telefoneSac;

}
