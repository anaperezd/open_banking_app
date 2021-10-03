package live.project.open_banking_app.controller;

import java.util.List;
import live.project.open_banking_app.domain.Transaction;
import live.project.open_banking_app.service.TransactionService;
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
