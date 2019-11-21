package br.com.palerique.algafood.service;

import br.com.palerique.algafood.model.Customer;
import br.com.palerique.algafood.model.Product;
import br.com.palerique.algafood.notifier.Notifier;

public class InvoiceIssueService {

  private Notifier notifier;

  public InvoiceIssueService(Notifier notifier) {
    this.notifier = notifier;
  }

  public void issue(Customer customer, Product product) {
    // TODO emite a nota fiscal aqui...
    this.notifier.notify(customer, "Nota fiscal do product "
        + product.getName() + " foi emitida!");
  }
}
