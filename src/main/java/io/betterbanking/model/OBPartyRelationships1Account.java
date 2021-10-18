package io.betterbanking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Relationship to the Account resource.
 */
@ApiModel(description = "Relationship to the Account resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-10-17T20:39:13.607076+02:00[Europe/Madrid]")
public class OBPartyRelationships1Account   {
  @JsonProperty("Related")
  private URI related;

  @JsonProperty("Id")
  private String id;

  public OBPartyRelationships1Account related(URI related) {
    this.related = related;
    return this;
  }

  /**
   * Absolute URI to the related resource.
   * @return related
  */
  @ApiModelProperty(required = true, value = "Absolute URI to the related resource.")
  @NotNull

  @Valid

  public URI getRelated() {
    return related;
  }

  public void setRelated(URI related) {
    this.related = related;
  }

  public OBPartyRelationships1Account id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identification as assigned by the ASPSP to uniquely identify the related resource.
   * @return id
  */
  @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the related resource.")
  @NotNull

@Size(min=1,max=40) 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPartyRelationships1Account obPartyRelationships1Account = (OBPartyRelationships1Account) o;
    return Objects.equals(this.related, obPartyRelationships1Account.related) &&
        Objects.equals(this.id, obPartyRelationships1Account.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(related, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPartyRelationships1Account {\n");
    
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

