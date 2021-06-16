package br.com.cidadao.service.domain.id;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;

@Getter
@Setter
public class AbrangenciaId implements Serializable {

    private Long idCidade;
    private Long idOrgao;
    private Long idTipoServico;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof AbrangenciaId)) {
            return false;
        }

        AbrangenciaId that = (AbrangenciaId) o;

        return new EqualsBuilder().append(getIdCidade(), that.getIdCidade()).append(getIdOrgao(), that.getIdOrgao()).append(getIdTipoServico(), that.getIdTipoServico()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getIdCidade()).append(getIdOrgao()).append(getIdTipoServico()).toHashCode();
    }
}
