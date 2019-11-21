package br.com.palerique.algafood;

import br.com.palerique.algafood.model.Customer;
import br.com.palerique.algafood.service.CustomerActivationService;
import java.time.Instant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {

  private CustomerActivationService customerActivationService;

  public MyFirstController(CustomerActivationService customerActivationService) {
    this.customerActivationService = customerActivationService;
    System.out.println("MeuPrimeiroController: " + customerActivationService);
  }

  @GetMapping("/hello")
  @ResponseBody
  public String hello() {
    Customer joao = Customer.builder().name("João").email("joao@xyz.com").phone("3499998888").build();
    customerActivationService.activate(joao);
    return "Hello world " + Instant.now();
  }
}
