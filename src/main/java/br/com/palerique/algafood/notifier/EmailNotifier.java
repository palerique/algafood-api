package br.com.palerique.algafood.notifier;

import br.com.palerique.algafood.model.Customer;
import java.util.Locale;

public class EmailNotifier implements Notifier {

  private final String smtpHost;
  private boolean upperCase;

  public EmailNotifier(String smtpHost) {
    this.smtpHost = smtpHost;
    System.out.printf("SMTP host: %s%n", smtpHost);
  }

  @Override
  public void notify(Customer customer, String message) {

    if (upperCase) {
      message = message.toUpperCase(Locale.ENGLISH);
    }

    System.out.printf("Notificando %s através do e-mail %s: %s%n",
        customer.getName(), customer.getEmail(), message);
  }

  public void setUpperCase(boolean upperCase) {
    this.upperCase = upperCase;
  }
}
