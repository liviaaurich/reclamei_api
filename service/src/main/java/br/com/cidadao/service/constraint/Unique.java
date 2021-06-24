package br.com.cidadao.service.constraint;

import br.com.cidadao.service.constraint.validator.UniqueValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = {UniqueValidator.class})
@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
@Documented
public @interface Unique {

    /**
     * Nome da classe anotada com @Entity
     */
    String entity();

    /**
     * Nome do atributo da classe anotada com @Entity
     */
    String field();

    Class<?>[] groups() default {};

    String message() default "";

    Class<? extends Payload>[] payload() default {};

    String value() default "";

}
