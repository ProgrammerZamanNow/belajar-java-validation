package programmerzamannow.validation;

import org.junit.jupiter.api.Test;
import programmerzamannow.validation.group.CreditCardPaymentGroup;

public class CustomConstraintTest extends AbstractValidatorTest{

  @Test
  void testCustomConstraint() {

    Payment payment = new Payment();
    payment.setOrderId("eko");

    validateWithGroups(payment, CreditCardPaymentGroup.class);

  }
}
