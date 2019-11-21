package br.com.palerique.algafood.notifier;

import br.com.palerique.algafood.model.Customer;

public class SmsNotifier implements Notifier {

  @Override
  public void notify(Customer customer, String message) {
    System.out.printf("Notificando %s por SMS através do telefone %s: %s\n",
        customer.getName(), customer.getPhone(), message);
  }
}
