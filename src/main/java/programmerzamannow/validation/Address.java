package programmerzamannow.validation;

import jakarta.validation.constraints.NotBlank;

public class Address {

  @NotBlank(message = "street can not blank")
  private String street;

  @NotBlank(message = "city can not blank")
  private String city;

  @NotBlank(message = "country can not blank")
  private String country;

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    return "Address{" +
        "street='" + street + '\'' +
        ", city='" + city + '\'' +
        ", country='" + country + '\'' +
        '}';
  }
}
