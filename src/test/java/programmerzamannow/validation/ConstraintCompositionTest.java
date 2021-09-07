package programmerzamannow.validation;

import org.junit.jupiter.api.Test;
import programmerzamannow.validation.group.CreditCardPaymentGroup;

public class ConstraintCompositionTest extends AbstractValidatorTest{

  @Test
  void testComposition() {

    Payment payment = new Payment();
    payment.setOrderId("29852309850238529589akjkjdsak");

    validateWithGroups(payment, CreditCardPaymentGroup.class);

  }
}
