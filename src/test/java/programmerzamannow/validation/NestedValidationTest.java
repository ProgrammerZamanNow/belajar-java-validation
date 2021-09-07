package programmerzamannow.validation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class NestedValidationTest {

  private Validator validator;

  @BeforeEach
  void setUp() {
    validator = Validation.buildDefaultValidatorFactory().getValidator();
  }

  @Test
  void testNested() {
    Person person = new Person();
    person.setFirstName("Eko");
    person.setLastName("Kurniawan");

    Address address = new Address();
    person.setAddress(address);

    Set<ConstraintViolation<Person>> violations = validator.validate(person);
    for (ConstraintViolation<Person> violation : violations) {
      System.out.println(violation.getMessage());
      System.out.println(violation.getPropertyPath());
      System.out.println("==============");
    }
  }
}
