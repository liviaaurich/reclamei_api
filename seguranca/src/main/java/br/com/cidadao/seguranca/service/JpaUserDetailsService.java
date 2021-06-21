package br.com.cidadao.seguranca.service;

import br.com.cidadao.seguranca.domain.AuthUser;
import br.com.cidadao.seguranca.domain.Usuario;
import br.com.cidadao.seguranca.repository.UsuarioRepository;
import br.com.cidadao.seguranca.service.util.ConstantsUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Collections;

@Service
@RequiredArgsConstructor
public class JpaUserDetailsService implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String s) {
        var usuario = usuarioRepository.findByUsername(s)
                .orElseThrow(() -> new UsernameNotFoundException(ConstantsUtil.ERRO_USUARIO_NAO_ENCONTRADO));
        return new AuthUser(usuario, getAuthorities(usuario));
    }

    private Collection<GrantedAuthority> getAuthorities(Usuario usuario) {
        return Collections.singleton(new SimpleGrantedAuthority(usuario.getPermissao().getNome().toUpperCase()));
    }
}
