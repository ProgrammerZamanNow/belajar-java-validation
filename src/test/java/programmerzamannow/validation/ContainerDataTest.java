package programmerzamannow.validation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ContainerDataTest extends AbstractValidatorTest{

  @Test
  void testContainerData() {

    Person person = new Person();
    person.setFirstName("Eko");
    person.setLastName("Eko");
    person.setAddress(new Address());
    person.getAddress().setCity("Subang");
    person.getAddress().setCountry("Indonesia");
    person.getAddress().setStreet("Bla bla bla");

    person.setHobbies(new ArrayList<>());
    person.getHobbies().add("");
    person.getHobbies().add("   ");
    person.getHobbies().add("Gaming");

    validate(person);

  }
}
