package programmerzamannow.validation.constraint;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import programmerzamannow.validation.Register;

public class CheckPasswordValidator implements ConstraintValidator<CheckPassword, Register> {

  private String messageTemplate;

  @Override
  public void initialize(CheckPassword constraintAnnotation) {
    messageTemplate = constraintAnnotation.message();
  }

  @Override
  public boolean isValid(Register value, ConstraintValidatorContext context) {
    if (value.getPassword() == null || value.getRetypePassword() == null) {
      return true; // skip validation
    }

    boolean isValid = value.getPassword().equals(value.getRetypePassword());

    if(!isValid){
      context.disableDefaultConstraintViolation();

      context.buildConstraintViolationWithTemplate(messageTemplate)
          .addPropertyNode("password")
          .addConstraintViolation();

      context.buildConstraintViolationWithTemplate(messageTemplate)
          .addPropertyNode("retypePassword")
          .addConstraintViolation();
    }

    return isValid;
  }
}
