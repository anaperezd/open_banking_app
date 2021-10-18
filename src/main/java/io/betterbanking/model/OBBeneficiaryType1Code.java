package io.betterbanking.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the Beneficiary Type.
 */
public enum OBBeneficiaryType1Code {
  
  TRUSTED("Trusted"),
  
  ORDINARY("Ordinary");

  private String value;

  OBBeneficiaryType1Code(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBBeneficiaryType1Code fromValue(String value) {
    for (OBBeneficiaryType1Code b : OBBeneficiaryType1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

