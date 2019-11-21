package br.com.palerique.algafood.config;

import br.com.palerique.algafood.notifier.EmailNotifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotifierConfig {

  @Bean
  public EmailNotifier emailNotifier() {
    EmailNotifier notifier = new EmailNotifier("smtp.algamail.com.br");
    notifier.setUpperCase(true);
    return notifier;
  }
}
