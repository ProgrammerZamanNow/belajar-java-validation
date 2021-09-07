package programmerzamannow.validation;

import org.junit.jupiter.api.Test;
import programmerzamannow.validation.group.CreditCardPaymentGroup;

public class GroupConvertTest extends AbstractValidatorTest{

  @Test
  void testGroupConvert() {

    Payment payment = new Payment();
    payment.setOrderId("001");
    payment.setAmount(20_000L);
    payment.setCreditCard("4111111111111111");
    payment.setCustomer(new Customer());

    validateWithGroups(payment, CreditCardPaymentGroup.class);

  }
}
