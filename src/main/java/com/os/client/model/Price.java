/*
 * 1Source Ledger API
 * 1Source Ledger API provides client access to the 1Source Ledger. You can find out more about 1Source at [https://equilend.com](https://equilend.com).  This specification is work in progress. The design is meant to model the securities lending life cycle in as clean a way as possible while being robust enough to easily translate to ISLA CDM workflows and data model.  API specification is the intellectual property of EquiLend LLC and should not be copied or disseminated in any way. 
 *
 * OpenAPI spec version: 1.2.1
 * Contact: 1source_help@equilend.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.os.client.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Price is ignored for trade agreements and loan proposals
 */
@Schema(description = "Price is ignored for trade agreements and loan proposals")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-29T18:55:08.725971332Z[GMT]")

public class Price implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("value")
  private Double value = null;

  @SerializedName("currency")
  private CurrencyCd currency = null;

  @SerializedName("priceBasis")
  private PriceBasis priceBasis = null;

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
  @Schema(required = true, description = "")
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
  @Schema(required = true, description = "")
  public CurrencyCd getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCd currency) {
    this.currency = currency;
  }

  public Price priceBasis(PriceBasis priceBasis) {
    this.priceBasis = priceBasis;
    return this;
  }

   /**
   * Get priceBasis
   * @return priceBasis
  **/
  @Schema(description = "")
  public PriceBasis getPriceBasis() {
    return priceBasis;
  }

  public void setPriceBasis(PriceBasis priceBasis) {
    this.priceBasis = priceBasis;
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
        Objects.equals(this.priceBasis, price.priceBasis) &&
        Objects.equals(this.valueDate, price.valueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currency, priceBasis, valueDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    priceBasis: ").append(toIndentedString(priceBasis)).append("\n");
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
