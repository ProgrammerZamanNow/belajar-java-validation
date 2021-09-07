package programmerzamannow.validation;

import jakarta.validation.Validator;
import org.junit.jupiter.api.Test;

public class HibernateValidatorConstraintTest extends AbstractValidatorTest{

  @Test
  void testHibernateValidatorConstraintInvalid() {

    Payment payment = new Payment();
    payment.setAmount(1000L);
    payment.setOrderId("0001");
    payment.setCreditCard("433");

    validate(payment);

  }

  @Test
  void testHibernateValidatorConstraintValid() {

    Payment payment = new Payment();
    payment.setAmount(10_000_000L);
    payment.setOrderId("0001");
    payment.setCreditCard("4111111111111111");

    validate(payment);

  }
}
