package br.com.palerique.algafood.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@AllArgsConstructor
@Value
@Builder
public class Product {

  private String name;
  private BigDecimal total;
}
