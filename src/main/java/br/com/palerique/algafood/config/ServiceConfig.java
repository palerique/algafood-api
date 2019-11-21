package br.com.palerique.algafood.config;

import br.com.palerique.algafood.notifier.Notifier;
import br.com.palerique.algafood.service.CustomerActivationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

  @Bean
  public CustomerActivationService customerActivationService(Notifier notifier) {
    return new CustomerActivationService(notifier);
  }
}
