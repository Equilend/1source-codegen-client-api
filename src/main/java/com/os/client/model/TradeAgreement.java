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
import com.os.client.model.Collateral;
import com.os.client.model.CurrencyCd;
import com.os.client.model.Instrument;
import com.os.client.model.Rate;
import com.os.client.model.SettlementType;
import com.os.client.model.TermType;
import com.os.client.model.TransactingParties;
import com.os.client.model.Venues;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.LocalDate;
import java.io.Serializable;
/**
 * TradeAgreement
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-25T16:59:29.530075741Z[GMT]")

public class TradeAgreement implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("venues")
  private Venues venues = null;

  @SerializedName("instrument")
  private Instrument instrument = null;

  @SerializedName("rate")
  private Rate rate = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("openQuantity")
  private Integer openQuantity = null;

  @SerializedName("billingCurrency")
  private CurrencyCd billingCurrency = null;

  @SerializedName("dividendRatePct")
  private Double dividendRatePct = null;

  @SerializedName("tradeDate")
  private LocalDate tradeDate = null;

  @SerializedName("termType")
  private TermType termType = null;

  @SerializedName("termDate")
  private LocalDate termDate = null;

  @SerializedName("settlementDate")
  private LocalDate settlementDate = null;

  @SerializedName("settlementType")
  private SettlementType settlementType = null;

  @SerializedName("collateral")
  private Collateral collateral = null;

  @SerializedName("transactingParties")
  private TransactingParties transactingParties = null;

  public TradeAgreement venues(Venues venues) {
    this.venues = venues;
    return this;
  }

   /**
   * Get venues
   * @return venues
  **/
  @Schema(description = "")
  public Venues getVenues() {
    return venues;
  }

  public void setVenues(Venues venues) {
    this.venues = venues;
  }

  public TradeAgreement instrument(Instrument instrument) {
    this.instrument = instrument;
    return this;
  }

   /**
   * Get instrument
   * @return instrument
  **/
  @Schema(required = true, description = "")
  public Instrument getInstrument() {
    return instrument;
  }

  public void setInstrument(Instrument instrument) {
    this.instrument = instrument;
  }

  public TradeAgreement rate(Rate rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @Schema(required = true, description = "")
  public Rate getRate() {
    return rate;
  }

  public void setRate(Rate rate) {
    this.rate = rate;
  }

  public TradeAgreement quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @Schema(required = true, description = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public TradeAgreement openQuantity(Integer openQuantity) {
    this.openQuantity = openQuantity;
    return this;
  }

   /**
   * Get openQuantity
   * @return openQuantity
  **/
  @Schema(description = "")
  public Integer getOpenQuantity() {
    return openQuantity;
  }

  public void setOpenQuantity(Integer openQuantity) {
    this.openQuantity = openQuantity;
  }

  public TradeAgreement billingCurrency(CurrencyCd billingCurrency) {
    this.billingCurrency = billingCurrency;
    return this;
  }

   /**
   * Get billingCurrency
   * @return billingCurrency
  **/
  @Schema(description = "")
  public CurrencyCd getBillingCurrency() {
    return billingCurrency;
  }

  public void setBillingCurrency(CurrencyCd billingCurrency) {
    this.billingCurrency = billingCurrency;
  }

  public TradeAgreement dividendRatePct(Double dividendRatePct) {
    this.dividendRatePct = dividendRatePct;
    return this;
  }

   /**
   * Get dividendRatePct
   * @return dividendRatePct
  **/
  @Schema(description = "")
  public Double getDividendRatePct() {
    return dividendRatePct;
  }

  public void setDividendRatePct(Double dividendRatePct) {
    this.dividendRatePct = dividendRatePct;
  }

  public TradeAgreement tradeDate(LocalDate tradeDate) {
    this.tradeDate = tradeDate;
    return this;
  }

   /**
   * Get tradeDate
   * @return tradeDate
  **/
  @Schema(required = true, description = "")
  public LocalDate getTradeDate() {
    return tradeDate;
  }

  public void setTradeDate(LocalDate tradeDate) {
    this.tradeDate = tradeDate;
  }

  public TradeAgreement termType(TermType termType) {
    this.termType = termType;
    return this;
  }

   /**
   * Get termType
   * @return termType
  **/
  @Schema(description = "")
  public TermType getTermType() {
    return termType;
  }

  public void setTermType(TermType termType) {
    this.termType = termType;
  }

  public TradeAgreement termDate(LocalDate termDate) {
    this.termDate = termDate;
    return this;
  }

   /**
   * Get termDate
   * @return termDate
  **/
  @Schema(description = "")
  public LocalDate getTermDate() {
    return termDate;
  }

  public void setTermDate(LocalDate termDate) {
    this.termDate = termDate;
  }

  public TradeAgreement settlementDate(LocalDate settlementDate) {
    this.settlementDate = settlementDate;
    return this;
  }

   /**
   * Get settlementDate
   * @return settlementDate
  **/
  @Schema(description = "")
  public LocalDate getSettlementDate() {
    return settlementDate;
  }

  public void setSettlementDate(LocalDate settlementDate) {
    this.settlementDate = settlementDate;
  }

  public TradeAgreement settlementType(SettlementType settlementType) {
    this.settlementType = settlementType;
    return this;
  }

   /**
   * Get settlementType
   * @return settlementType
  **/
  @Schema(description = "")
  public SettlementType getSettlementType() {
    return settlementType;
  }

  public void setSettlementType(SettlementType settlementType) {
    this.settlementType = settlementType;
  }

  public TradeAgreement collateral(Collateral collateral) {
    this.collateral = collateral;
    return this;
  }

   /**
   * Get collateral
   * @return collateral
  **/
  @Schema(required = true, description = "")
  public Collateral getCollateral() {
    return collateral;
  }

  public void setCollateral(Collateral collateral) {
    this.collateral = collateral;
  }

  public TradeAgreement transactingParties(TransactingParties transactingParties) {
    this.transactingParties = transactingParties;
    return this;
  }

   /**
   * Get transactingParties
   * @return transactingParties
  **/
  @Schema(required = true, description = "")
  public TransactingParties getTransactingParties() {
    return transactingParties;
  }

  public void setTransactingParties(TransactingParties transactingParties) {
    this.transactingParties = transactingParties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeAgreement tradeAgreement = (TradeAgreement) o;
    return Objects.equals(this.venues, tradeAgreement.venues) &&
        Objects.equals(this.instrument, tradeAgreement.instrument) &&
        Objects.equals(this.rate, tradeAgreement.rate) &&
        Objects.equals(this.quantity, tradeAgreement.quantity) &&
        Objects.equals(this.openQuantity, tradeAgreement.openQuantity) &&
        Objects.equals(this.billingCurrency, tradeAgreement.billingCurrency) &&
        Objects.equals(this.dividendRatePct, tradeAgreement.dividendRatePct) &&
        Objects.equals(this.tradeDate, tradeAgreement.tradeDate) &&
        Objects.equals(this.termType, tradeAgreement.termType) &&
        Objects.equals(this.termDate, tradeAgreement.termDate) &&
        Objects.equals(this.settlementDate, tradeAgreement.settlementDate) &&
        Objects.equals(this.settlementType, tradeAgreement.settlementType) &&
        Objects.equals(this.collateral, tradeAgreement.collateral) &&
        Objects.equals(this.transactingParties, tradeAgreement.transactingParties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(venues, instrument, rate, quantity, openQuantity, billingCurrency, dividendRatePct, tradeDate, termType, termDate, settlementDate, settlementType, collateral, transactingParties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeAgreement {\n");
    
    sb.append("    venues: ").append(toIndentedString(venues)).append("\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    openQuantity: ").append(toIndentedString(openQuantity)).append("\n");
    sb.append("    billingCurrency: ").append(toIndentedString(billingCurrency)).append("\n");
    sb.append("    dividendRatePct: ").append(toIndentedString(dividendRatePct)).append("\n");
    sb.append("    tradeDate: ").append(toIndentedString(tradeDate)).append("\n");
    sb.append("    termType: ").append(toIndentedString(termType)).append("\n");
    sb.append("    termDate: ").append(toIndentedString(termDate)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    settlementType: ").append(toIndentedString(settlementType)).append("\n");
    sb.append("    collateral: ").append(toIndentedString(collateral)).append("\n");
    sb.append("    transactingParties: ").append(toIndentedString(transactingParties)).append("\n");
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
