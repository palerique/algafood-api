package br.com.palerique.algafood.notifier;

import br.com.palerique.algafood.model.Customer;

public interface Notifier {

  void notify(Customer customer, String message);
}
