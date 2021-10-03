package live.project.open_banking_app.service;

import java.util.List;
import live.project.open_banking_app.domain.Transaction;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
  public List<Transaction> findAllByAccountNumber() {
    return List.of(Transaction.builder().build(), Transaction.builder().build());
  }
}
