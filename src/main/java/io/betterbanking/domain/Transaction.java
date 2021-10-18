package io.betterbanking.domain;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Transaction {

  // todo, all strings, should some be sth else, e.g. number or date?
  // todo, should they be final
  private String type;
  private OffsetDateTime date;
  private String accountNumber;
  private String currency;
  private BigDecimal amount;
  private String merchantName;
  private String merchantLogo;
}
