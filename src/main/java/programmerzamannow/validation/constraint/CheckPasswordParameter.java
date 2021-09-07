package programmerzamannow.validation.constraint;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {CheckPasswordParameterValidator.class})
@Target({FIELD, ANNOTATION_TYPE, TYPE, METHOD})
@Retention(RUNTIME)
public @interface CheckPasswordParameter {

  int passwordParam();

  int retypePasswordParam();

  String message() default "password and retype password must same";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

}
