package programmerzamannow.validation;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.groups.ConvertGroup;
import jakarta.validation.groups.Default;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.LuhnCheck;
import org.hibernate.validator.constraints.Range;
import programmerzamannow.validation.constraint.CheckCase;
import programmerzamannow.validation.constraint.CheckOrderId;
import programmerzamannow.validation.enums.CaseMode;
import programmerzamannow.validation.group.CreditCardPaymentGroup;
import programmerzamannow.validation.group.VirtualAccountPaymentGroup;
import programmerzamannow.validation.payload.EmailErrorPayload;

public class Payment {

  @CheckOrderId(groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class},
      message = "{order.id.invalid}")
  private String orderId;

  @Range(groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class},
      min = 10_000L, max = 100_000_000L, message = "{order.amount.range}")
  @NotNull(groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class},
      message = "amount can not null")
  private Long amount;

  @LuhnCheck(groups = {CreditCardPaymentGroup.class}, message = "invalid credit card number",
      payload = {EmailErrorPayload.class})
  @NotBlank(groups = {CreditCardPaymentGroup.class}, message = "credit card can not blank")
  private String creditCard;

  @NotBlank(groups = {VirtualAccountPaymentGroup.class}, message = "virtual account can not blank")
  private String virtualAccount;

  @Valid
  @NotNull(groups = {VirtualAccountPaymentGroup.class, CreditCardPaymentGroup.class},
      message = "customer can not null")
  @ConvertGroup(from = VirtualAccountPaymentGroup.class, to = Default.class)
  @ConvertGroup(from = CreditCardPaymentGroup.class, to = Default.class)
  private Customer customer;

  @Override
  public String toString() {
    return "Payment{" +
        "orderId='" + orderId + '\'' +
        ", amount=" + amount +
        ", creditCard='" + creditCard + '\'' +
        ", virtualAccount='" + virtualAccount + '\'' +
        ", customer=" + customer +
        '}';
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public String getVirtualAccount() {
    return virtualAccount;
  }

  public void setVirtualAccount(String virtualAccount) {
    this.virtualAccount = virtualAccount;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public String getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(String creditCard) {
    this.creditCard = creditCard;
  }
}
