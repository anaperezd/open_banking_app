package io.betterbanking.adapter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.betterbanking.domain.Transaction;
import io.betterbanking.model.OBActiveOrHistoricCurrencyAndAmount9;
import io.betterbanking.model.OBCreditDebitCode1;
import io.betterbanking.model.OBCurrencyExchange5;
import io.betterbanking.model.OBMerchantDetails1;
import io.betterbanking.model.OBTransaction6;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OBTransactionAdapterTest {

  OBTransactionAdapter obTransactionAdapter = new OBTransactionAdapter();

  OBTransaction6 obTransaction6 = new OBTransaction6();
  OffsetDateTime offsetDateTime = OffsetDateTime.of(2021, 10, 18, 0, 0, 0, 0, ZoneOffset.UTC);
  OBCurrencyExchange5 obCurrencyExchange5 = new OBCurrencyExchange5();
  OBActiveOrHistoricCurrencyAndAmount9 obActiveOrHistoricCurrencyAndAmount9 =
      new OBActiveOrHistoricCurrencyAndAmount9();

  @BeforeEach
  void setUp() {
    obTransaction6.setAccountId("account-id");
    obTransaction6.setCreditDebitIndicator(OBCreditDebitCode1.CREDIT);
    obCurrencyExchange5.setUnitCurrency("EUR");
    // todo tests when can't calculate amount, behaviour not specified
    obCurrencyExchange5.setExchangeRate(new BigDecimal("1.1")); // can't multiply
    obTransaction6.setCurrencyExchange(obCurrencyExchange5); // uno
    obActiveOrHistoricCurrencyAndAmount9.amount("1000"); // can't multiply
    obTransaction6.setAmount(obActiveOrHistoricCurrencyAndAmount9); // dos
    OBMerchantDetails1 obMerchantDetails1 = new OBMerchantDetails1();
    obMerchantDetails1.setMerchantName("a-merchant-name");
    obTransaction6.setMerchantDetails(obMerchantDetails1);
    obTransaction6.setValueDateTime(offsetDateTime);
  }

  @Test
  void shouldRecoverFromNonCriticalNullValues() {
    obTransaction6.setCreditDebitIndicator(null);
    obTransaction6.setMerchantDetails(null);

    Transaction expectedTransaction =
        Transaction.builder()
            .accountNumber("account-id")
            .currency("EUR")
            .amount(new BigDecimal("1100.0"))
            .date(offsetDateTime)
            .build();
    
    Transaction result = obTransactionAdapter.mapTransaction(obTransaction6);
    
    assertEquals(expectedTransaction, result);
  }
  
  @Test
  void shouldMapOBTransactionToTransaction() {
    Transaction expectedTransaction =
        Transaction.builder()
            .accountNumber("account-id")
            .type(OBCreditDebitCode1.CREDIT.getValue())
            .currency("EUR")
            .amount(new BigDecimal("1100.0"))
            .merchantName("a-merchant-name")
            .date(offsetDateTime)
            .build();

    Transaction result = obTransactionAdapter.mapTransaction(obTransaction6);

    assertEquals(expectedTransaction, result);
  }
}
