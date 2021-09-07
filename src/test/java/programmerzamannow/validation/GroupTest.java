package programmerzamannow.validation;

import org.junit.jupiter.api.Test;
import programmerzamannow.validation.group.CreditCardPaymentGroup;
import programmerzamannow.validation.group.VirtualAccountPaymentGroup;

public class GroupTest extends AbstractValidatorTest{

  @Test
  void testCreditCardGroup() {

    Payment payment = new Payment();
    payment.setOrderId("0111");
    payment.setAmount(20_000L);
    payment.setCreditCard("123");

    validateWithGroups(payment, CreditCardPaymentGroup.class);

  }

  @Test
  void testVirtualAccount() {

    Payment payment = new Payment();
    payment.setOrderId("0111");
    payment.setAmount(20_000L);
    payment.setVirtualAccount("");

    validateWithGroups(payment, VirtualAccountPaymentGroup.class);

  }
}
