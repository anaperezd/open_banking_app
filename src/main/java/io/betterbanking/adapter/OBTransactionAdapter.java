package io.betterbanking.adapter;

import io.betterbanking.domain.Transaction;
import io.betterbanking.model.OBTransaction6;
import java.math.BigDecimal;

public class OBTransactionAdapter {

  public Transaction mapTransaction(OBTransaction6 obTransaction6) {
    return Transaction.builder()
        .accountNumber(obTransaction6.getAccountId())
        .type(obTransaction6.getCreditDebitIndicator().getValue())
        .currency(obTransaction6.getCurrencyExchange().getUnitCurrency())
        .amount(
            obTransaction6
                .getCurrencyExchange()
                .getExchangeRate()
                .multiply(new BigDecimal(obTransaction6.getAmount().getAmount())))
        .merchantName(obTransaction6.getMerchantDetails().getMerchantName())
        .date(obTransaction6.getValueDateTime())
        .build();
  }
}
