package io.betterbanking.service;

import io.betterbanking.domain.Transaction;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
  public List<Transaction> findAllByAccountNumber() {
    return List.of(Transaction.builder().build(), Transaction.builder().build());
  }
}
