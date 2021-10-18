package io.betterbanking.controller;

import io.betterbanking.domain.Transaction;
import io.betterbanking.service.TransactionService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TransactionController {

  private final TransactionService transactionService;

  // todo, add accountNumber path parameter
  @GetMapping("/transactions")
  public List<Transaction> getTransactionsByAccountNumber() {
    return transactionService.findAllByAccountNumber();
  }
}
