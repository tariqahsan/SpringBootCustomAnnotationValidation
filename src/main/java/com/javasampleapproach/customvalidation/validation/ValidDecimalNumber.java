package com.javasampleapproach.customvalidation.validation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = com.javasampleapproach.customvalidation.validation.ValidDecimalNumberValidator.class)
@Documented
public @interface ValidDecimalNumber {
	
	String message() default "Not a valid decimal number";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	int min() default 3;
}
