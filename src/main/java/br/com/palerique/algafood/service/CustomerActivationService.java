package br.com.palerique.algafood.service;

import br.com.palerique.algafood.model.Customer;
import br.com.palerique.algafood.notifier.Notifier;

public class CustomerActivationService {

  private Notifier notifier;

  public CustomerActivationService(Notifier notifier) {
    this.notifier = notifier;
  }

  public void activate(Customer customer) {
    customer.activate();

    this.notifier.notify(customer, "Seu cadastro no sistema está ativo!");
  }
}
