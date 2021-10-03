package io.betterbanking.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Transaction {

  // todo, all strings, should some be sth else, e.g. number or date?
  // todo, should they be final
  private String type;
  private String date;
  private String accountNumber;
  private String currency;
  private String amount;
  private String merchantName;
  private String merchantLogo;
}
