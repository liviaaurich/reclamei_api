package br.com.cidadao.service.domain;

import br.com.cidadao.service.domain.id.AbrangenciaId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Getter
@Setter
@IdClass(AbrangenciaId.class)
public class Abrangencia {

    @Id
    private Long idCidade;

    @Id
    private Long idOrgao;

    @Id
    private Long idTipoServico;

}