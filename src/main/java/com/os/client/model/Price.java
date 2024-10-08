/*
 * 1Source Ledger API
 * 1Source Ledger API provides client access to the 1Source Ledger. You can find out more about 1Source at [https://equilend.com](https://equilend.com).  This specification is work in progress. The design is meant to model the securities lending life cycle in as clean a way as possible while being robust enough to easily translate to ISLA CDM workflows and data model.  API specification is the intellectual property of EquiLend LLC and should not be copied or disseminated in any way. 
 *
 * OpenAPI spec version: 1.1.0
 * Contact: 1source_help@equilend.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.os.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.os.client.model.CurrencyCd;
import com.os.client.model.PriceUnit;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.LocalDate;
import java.io.Serializable;
/**
 * Price is ignored for trade agreements and loan proposals
 */
@Schema(description = "Price is ignored for trade agreements and loan proposals")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-25T16:59:29.530075741Z[GMT]")

public class Price implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("value")
  private Double value = null;

  @SerializedName("currency")
  private CurrencyCd currency = null;

  @SerializedName("unit")
  private PriceUnit unit = null;

  @SerializedName("valueDate")
  private LocalDate valueDate = null;

  public Price value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public Price currency(CurrencyCd currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(description = "")
  public CurrencyCd getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCd currency) {
    this.currency = currency;
  }

  public Price unit(PriceUnit unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @Schema(description = "")
  public PriceUnit getUnit() {
    return unit;
  }

  public void setUnit(PriceUnit unit) {
    this.unit = unit;
  }

  public Price valueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
    return this;
  }

   /**
   * Get valueDate
   * @return valueDate
  **/
  @Schema(description = "")
  public LocalDate getValueDate() {
    return valueDate;
  }

  public void setValueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.value, price.value) &&
        Objects.equals(this.currency, price.currency) &&
        Objects.equals(this.unit, price.unit) &&
        Objects.equals(this.valueDate, price.valueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currency, unit, valueDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
