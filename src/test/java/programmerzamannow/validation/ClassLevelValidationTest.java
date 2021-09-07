package programmerzamannow.validation;

import org.junit.jupiter.api.Test;

public class ClassLevelValidationTest extends AbstractValidatorTest{

  @Test
  void testClassLevel() {

    Register register = new Register();
    register.setUsername("eko");
    register.setPassword("rahasia");
    register.setRetypePassword("rahasia123");

    validate(register);

  }
}
