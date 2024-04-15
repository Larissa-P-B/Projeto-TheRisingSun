package br.com.fiap.therisingsun.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TipoCadastroValidator.class)
public @interface TipoCadastro {

    String message() default "{cadastro.tipo.invalido}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

   
}


