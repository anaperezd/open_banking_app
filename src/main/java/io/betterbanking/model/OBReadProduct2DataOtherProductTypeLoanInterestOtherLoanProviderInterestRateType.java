package io.betterbanking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Other loan interest rate types which are not available in the standard code list
 */
@ApiModel(description = "Other loan interest rate types which are not available in the standard code list")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-10-17T20:39:13.607076+02:00[Europe/Madrid]")
public class OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType   {
  @JsonProperty("Code")
  private String code;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("Description")
  private String description;

  public OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The four letter Mnemonic used within an XML file to identify a code
   * @return code
  */
  @ApiModelProperty(value = "The four letter Mnemonic used within an XML file to identify a code")

@Pattern(regexp="^\\\\w{0,4}$") 
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Long name associated with the code
   * @return name
  */
  @ApiModelProperty(required = true, value = "Long name associated with the code")
  @NotNull

@Size(min=1,max=70) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description to describe the purpose of the code
   * @return description
  */
  @ApiModelProperty(required = true, value = "Description to describe the purpose of the code")
  @NotNull

@Size(min=1,max=350) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType obReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType = (OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType) o;
    return Objects.equals(this.code, obReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType.code) &&
        Objects.equals(this.name, obReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType.name) &&
        Objects.equals(this.description, obReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

