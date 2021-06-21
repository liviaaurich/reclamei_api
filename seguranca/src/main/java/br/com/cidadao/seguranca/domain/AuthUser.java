package br.com.cidadao.seguranca.domain;

import lombok.Getter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Getter
public class AuthUser extends User {

    private Long id;

    private String email;

    public AuthUser(Usuario usuario, Collection<? extends GrantedAuthority> authorities) {
        super(usuario.getUsername(), usuario.getPassword(), authorities);
        this.id = usuario.getId();
        this.email = usuario.getEmail();
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof AuthUser) && new EqualsBuilder()
                .append(getId(), ((AuthUser) o).getId())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getId())
                .toHashCode();
    }
}
