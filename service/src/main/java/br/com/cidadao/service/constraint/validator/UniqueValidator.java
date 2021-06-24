package br.com.cidadao.service.constraint.validator;


import br.com.cidadao.service.constraint.Unique;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueValidator implements ConstraintValidator<Unique, String> {

    private String field;
    private String entity;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void initialize(Unique constraintAnnotation) {
        field = constraintAnnotation.field();
        entity = constraintAnnotation.entity();
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Query query = entityManager.createQuery("select 1 from " + entity + " where " + field + " =: value");
        return query.setParameter("value", value).getResultList().isEmpty();
    }
}
