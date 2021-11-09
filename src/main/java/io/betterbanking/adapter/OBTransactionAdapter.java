package io.betterbanking.adapter;

import io.betterbanking.domain.Transaction;
import io.betterbanking.model.OBTransaction6;
import java.math.BigDecimal;

public class OBTransactionAdapter {

  public Transaction mapTransaction(OBTransaction6 obTransaction6) {
    String type = obTransaction6.getCreditDebitIndicator() == null ? null : obTransaction6.getCreditDebitIndicator().getValue();
    String merchantName = obTransaction6.getMerchantDetails() == null ? null : obTransaction6.getMerchantDetails().getMerchantName();
    return Transaction.builder()
        .accountNumber(obTransaction6.getAccountId())
        .type(type)
        .currency(obTransaction6.getCurrencyExchange().getUnitCurrency())
        .amount(
            obTransaction6
                .getCurrencyExchange()
                .getExchangeRate()
                .multiply(new BigDecimal(obTransaction6.getAmount().getAmount())))
        .merchantName(merchantName)
        .date(obTransaction6.getValueDateTime())
        .build();
  }
}
