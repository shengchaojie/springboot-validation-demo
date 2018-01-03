package com.scj.springbootdemo.custom;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { HandsomeBoyValidator.class})
public @interface HandsomeBoy {

    String message() default "盛超杰最帅";

    String name();

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default {};
}
