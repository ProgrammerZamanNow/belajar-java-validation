package programmerzamannow.validation;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import programmerzamannow.validation.container.Data;

public class SampleData {

  @NotNull
  private Data<@NotBlank @Size(min = 10) String> data;

  public Data<String> getData() {
    return data;
  }

  public void setData(Data<String> data) {
    this.data = data;
  }
}
