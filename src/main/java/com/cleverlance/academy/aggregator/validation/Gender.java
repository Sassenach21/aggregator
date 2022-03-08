package com.cleverlance.academy.aggregator.validation;

import javax.validation.Constraint;

@Constraint(validatedBy = GenderValidation.class)
public @interface Gender {
    String message() default "Invalid gender value ";
}
