package br.com.palerique.algafood.config;

import br.com.palerique.algafood.notifier.EmailNotifier;
import br.com.palerique.algafood.service.CustomerActivationService;
import org.springframework.context.annotation.Bean;

//@Configuration
public class AlgaConfig {

  @Bean
  public CustomerActivationService customerActivationService(EmailNotifier notifier) {
    return new CustomerActivationService(notifier);
  }

  @Bean
  public EmailNotifier emailNotifier() {
    EmailNotifier emailNotifier = new EmailNotifier("smtp.algamail.com.br");
    emailNotifier.setUpperCase(true);
    return emailNotifier;
  }
}
