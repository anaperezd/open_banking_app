package io.betterbanking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TransactionServiceTest {
  private final TransactionService transactionService = new TransactionService();

  @Test
  void shouldReturnANonEmptyList() {
    assertEquals(2, transactionService.findAllByAccountNumber().size());
  }
}
