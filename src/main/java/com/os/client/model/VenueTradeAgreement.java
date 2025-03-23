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
 * VenueTradeAgreement
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-23T15:43:02.135640846Z[GMT]")

public class VenueTradeAgreement implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("executionVenue")
  private Venue executionVenue = null;

  @SerializedName("instrument")
  private Instrument instrument = null;

  @SerializedName("rate")
  private Rate rate = null;

  @SerializedName("quantity")
  private Integer quantity = null;

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

  public VenueTradeAgreement executionVenue(Venue executionVenue) {
    this.executionVenue = executionVenue;
    return this;
  }

   /**
   * Get executionVenue
   * @return executionVenue
  **/
  @Schema(description = "")
  public Venue getExecutionVenue() {
    return executionVenue;
  }

  public void setExecutionVenue(Venue executionVenue) {
    this.executionVenue = executionVenue;
  }

  public VenueTradeAgreement instrument(Instrument instrument) {
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

  public VenueTradeAgreement rate(Rate rate) {
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

  public VenueTradeAgreement quantity(Integer quantity) {
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

  public VenueTradeAgreement billingCurrency(CurrencyCd billingCurrency) {
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

  public VenueTradeAgreement dividendRatePct(Double dividendRatePct) {
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

  public VenueTradeAgreement tradeDate(LocalDate tradeDate) {
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

  public VenueTradeAgreement termType(TermType termType) {
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

  public VenueTradeAgreement termDate(LocalDate termDate) {
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

  public VenueTradeAgreement settlementDate(LocalDate settlementDate) {
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

  public VenueTradeAgreement settlementType(SettlementType settlementType) {
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

  public VenueTradeAgreement collateral(Collateral collateral) {
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

  public VenueTradeAgreement transactingParties(TransactingParties transactingParties) {
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
    VenueTradeAgreement venueTradeAgreement = (VenueTradeAgreement) o;
    return Objects.equals(this.executionVenue, venueTradeAgreement.executionVenue) &&
        Objects.equals(this.instrument, venueTradeAgreement.instrument) &&
        Objects.equals(this.rate, venueTradeAgreement.rate) &&
        Objects.equals(this.quantity, venueTradeAgreement.quantity) &&
        Objects.equals(this.billingCurrency, venueTradeAgreement.billingCurrency) &&
        Objects.equals(this.dividendRatePct, venueTradeAgreement.dividendRatePct) &&
        Objects.equals(this.tradeDate, venueTradeAgreement.tradeDate) &&
        Objects.equals(this.termType, venueTradeAgreement.termType) &&
        Objects.equals(this.termDate, venueTradeAgreement.termDate) &&
        Objects.equals(this.settlementDate, venueTradeAgreement.settlementDate) &&
        Objects.equals(this.settlementType, venueTradeAgreement.settlementType) &&
        Objects.equals(this.collateral, venueTradeAgreement.collateral) &&
        Objects.equals(this.transactingParties, venueTradeAgreement.transactingParties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionVenue, instrument, rate, quantity, billingCurrency, dividendRatePct, tradeDate, termType, termDate, settlementDate, settlementType, collateral, transactingParties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VenueTradeAgreement {\n");
    
    sb.append("    executionVenue: ").append(toIndentedString(executionVenue)).append("\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
