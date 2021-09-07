package programmerzamannow.validation;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class Customer {

  @Email(message = "email must valid format")
  @NotBlank(message = "email can not blank")
  private String email;

  @NotBlank(message = "name can not blank")
  private String name;

  @Override
  public String toString() {
    return "Customer{" +
        "email='" + email + '\'' +
        ", name='" + name + '\'' +
        '}';
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
