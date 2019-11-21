package br.com.palerique.algafood.notifier;

import br.com.palerique.algafood.model.Customer;

public class EmailNotifier implements Notifier {

  private final String smtpHost;
  private boolean upperCase;

  public EmailNotifier(String smtpHost) {
    this.smtpHost = smtpHost;
  }

  @Override
  public void notify(Customer customer, String message) {

    if (upperCase) {
      message = message.toUpperCase();
    }

    System.out.printf("Notificando %s através do e-mail %s: %s\n",
        customer.getName(), customer.getEmail(), message);
  }

  public void setUpperCase(boolean upperCase) {
    this.upperCase = upperCase;
  }
}
