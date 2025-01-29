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
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Instrument
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-29T18:00:54.218085062Z[GMT]")

public class Instrument implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("cusip")
  private String cusip = null;

  @SerializedName("isin")
  private String isin = null;

  @SerializedName("sedol")
  private String sedol = null;

  @SerializedName("quick")
  private String quick = null;

  @SerializedName("figi")
  private String figi = null;

  @SerializedName("marketCode")
  private String marketCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("price")
  private Price price = null;

  public Instrument ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * Get ticker
   * @return ticker
  **/
  @Schema(description = "")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public Instrument cusip(String cusip) {
    this.cusip = cusip;
    return this;
  }

   /**
   * Get cusip
   * @return cusip
  **/
  @Schema(description = "")
  public String getCusip() {
    return cusip;
  }

  public void setCusip(String cusip) {
    this.cusip = cusip;
  }

  public Instrument isin(String isin) {
    this.isin = isin;
    return this;
  }

   /**
   * Get isin
   * @return isin
  **/
  @Schema(description = "")
  public String getIsin() {
    return isin;
  }

  public void setIsin(String isin) {
    this.isin = isin;
  }

  public Instrument sedol(String sedol) {
    this.sedol = sedol;
    return this;
  }

   /**
   * Get sedol
   * @return sedol
  **/
  @Schema(description = "")
  public String getSedol() {
    return sedol;
  }

  public void setSedol(String sedol) {
    this.sedol = sedol;
  }

  public Instrument quick(String quick) {
    this.quick = quick;
    return this;
  }

   /**
   * Get quick
   * @return quick
  **/
  @Schema(description = "")
  public String getQuick() {
    return quick;
  }

  public void setQuick(String quick) {
    this.quick = quick;
  }

  public Instrument figi(String figi) {
    this.figi = figi;
    return this;
  }

   /**
   * Get figi
   * @return figi
  **/
  @Schema(required = true, description = "")
  public String getFigi() {
    return figi;
  }

  public void setFigi(String figi) {
    this.figi = figi;
  }

  public Instrument marketCode(String marketCode) {
    this.marketCode = marketCode;
    return this;
  }

   /**
   * Get marketCode
   * @return marketCode
  **/
  @Schema(description = "")
  public String getMarketCode() {
    return marketCode;
  }

  public void setMarketCode(String marketCode) {
    this.marketCode = marketCode;
  }

  public Instrument description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Instrument price(Price price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(description = "")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instrument instrument = (Instrument) o;
    return Objects.equals(this.ticker, instrument.ticker) &&
        Objects.equals(this.cusip, instrument.cusip) &&
        Objects.equals(this.isin, instrument.isin) &&
        Objects.equals(this.sedol, instrument.sedol) &&
        Objects.equals(this.quick, instrument.quick) &&
        Objects.equals(this.figi, instrument.figi) &&
        Objects.equals(this.marketCode, instrument.marketCode) &&
        Objects.equals(this.description, instrument.description) &&
        Objects.equals(this.price, instrument.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticker, cusip, isin, sedol, quick, figi, marketCode, description, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instrument {\n");
    
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    sedol: ").append(toIndentedString(sedol)).append("\n");
    sb.append("    quick: ").append(toIndentedString(quick)).append("\n");
    sb.append("    figi: ").append(toIndentedString(figi)).append("\n");
    sb.append("    marketCode: ").append(toIndentedString(marketCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
