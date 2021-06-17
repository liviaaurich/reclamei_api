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
        return (o instanceof AbrangenciaId) && new EqualsBuilder()
                .append(getIdCidade(), ((AbrangenciaId) o).getIdCidade())
                .append(getIdOrgao(), ((AbrangenciaId) o).getIdOrgao())
                .append(getIdTipoServico(), ((AbrangenciaId) o).getIdTipoServico())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getIdCidade())
                .append(getIdOrgao())
                .append(getIdTipoServico())
                .toHashCode();
    }
}
