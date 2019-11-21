package br.com.palerique.algafood.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Customer {

  private String name;
  private String email;
  private String phone;
  private boolean active;

  public void activate() {
    this.active = true;
  }
}
