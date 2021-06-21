package br.com.cidadao.service.security;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// TODO: Alterar depois para a validação de uma ou mais roles com um nome legal
@PreAuthorize("hasAnyAuthority(ROLE_ADMIN, ROLE_USUARIO_PESSOA, ROLE_USUARIO_EMPRESA)") // Anotar os métodos com essa nova annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Teste {
}
