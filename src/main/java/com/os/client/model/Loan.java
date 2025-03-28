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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Loan
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-27T18:38:07.529904023Z[GMT]")

public class Loan implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("loanId")
  private String loanId = null;

  @SerializedName("lastEvent")
  private Event lastEvent = null;

  @SerializedName("loanStatus")
  private LoanStatus loanStatus = null;

  @SerializedName("loanStatusReason")
  private OneOfLoanLoanStatusReason loanStatusReason = null;

  @SerializedName("lastUpdatePartyId")
  private String lastUpdatePartyId = null;

  @SerializedName("lastUpdateDateTime")
  private OffsetDateTime lastUpdateDateTime = null;

  @SerializedName("isInitiator")
  private Boolean isInitiator = null;

  @SerializedName("trade")
  private TradeAgreement trade = null;

  @SerializedName("settlement")
  private List<PartySettlementInstruction> settlement = null;

  @SerializedName("parentLoanId")
  private String parentLoanId = null;

  @SerializedName("loanCorrelationId")
  private String loanCorrelationId = null;

  public Loan loanId(String loanId) {
    this.loanId = loanId;
    return this;
  }

   /**
   * Get loanId
   * @return loanId
  **/
  @Schema(required = true, description = "")
  public String getLoanId() {
    return loanId;
  }

  public void setLoanId(String loanId) {
    this.loanId = loanId;
  }

  public Loan lastEvent(Event lastEvent) {
    this.lastEvent = lastEvent;
    return this;
  }

   /**
   * Get lastEvent
   * @return lastEvent
  **/
  @Schema(description = "")
  public Event getLastEvent() {
    return lastEvent;
  }

  public void setLastEvent(Event lastEvent) {
    this.lastEvent = lastEvent;
  }

  public Loan loanStatus(LoanStatus loanStatus) {
    this.loanStatus = loanStatus;
    return this;
  }

   /**
   * Get loanStatus
   * @return loanStatus
  **/
  @Schema(required = true, description = "")
  public LoanStatus getLoanStatus() {
    return loanStatus;
  }

  public void setLoanStatus(LoanStatus loanStatus) {
    this.loanStatus = loanStatus;
  }

  public Loan loanStatusReason(OneOfLoanLoanStatusReason loanStatusReason) {
    this.loanStatusReason = loanStatusReason;
    return this;
  }

   /**
   * Get loanStatusReason
   * @return loanStatusReason
  **/
  @Schema(description = "")
  public OneOfLoanLoanStatusReason getLoanStatusReason() {
    return loanStatusReason;
  }

  public void setLoanStatusReason(OneOfLoanLoanStatusReason loanStatusReason) {
    this.loanStatusReason = loanStatusReason;
  }

  public Loan lastUpdatePartyId(String lastUpdatePartyId) {
    this.lastUpdatePartyId = lastUpdatePartyId;
    return this;
  }

   /**
   * Get lastUpdatePartyId
   * @return lastUpdatePartyId
  **/
  @Schema(description = "")
  public String getLastUpdatePartyId() {
    return lastUpdatePartyId;
  }

  public void setLastUpdatePartyId(String lastUpdatePartyId) {
    this.lastUpdatePartyId = lastUpdatePartyId;
  }

  public Loan lastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
    return this;
  }

   /**
   * Get lastUpdateDateTime
   * @return lastUpdateDateTime
  **/
  @Schema(description = "")
  public OffsetDateTime getLastUpdateDateTime() {
    return lastUpdateDateTime;
  }

  public void setLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
  }

  public Loan isInitiator(Boolean isInitiator) {
    this.isInitiator = isInitiator;
    return this;
  }

   /**
   * Get isInitiator
   * @return isInitiator
  **/
  @Schema(description = "")
  public Boolean isIsInitiator() {
    return isInitiator;
  }

  public void setIsInitiator(Boolean isInitiator) {
    this.isInitiator = isInitiator;
  }

  public Loan trade(TradeAgreement trade) {
    this.trade = trade;
    return this;
  }

   /**
   * Get trade
   * @return trade
  **/
  @Schema(description = "")
  public TradeAgreement getTrade() {
    return trade;
  }

  public void setTrade(TradeAgreement trade) {
    this.trade = trade;
  }

  public Loan settlement(List<PartySettlementInstruction> settlement) {
    this.settlement = settlement;
    return this;
  }

  public Loan addSettlementItem(PartySettlementInstruction settlementItem) {
    if (this.settlement == null) {
      this.settlement = new ArrayList<>();
    }
    this.settlement.add(settlementItem);
    return this;
  }

   /**
   * Get settlement
   * @return settlement
  **/
  @Schema(description = "")
  public List<PartySettlementInstruction> getSettlement() {
    return settlement;
  }

  public void setSettlement(List<PartySettlementInstruction> settlement) {
    this.settlement = settlement;
  }

  public Loan parentLoanId(String parentLoanId) {
    this.parentLoanId = parentLoanId;
    return this;
  }

   /**
   * Get parentLoanId
   * @return parentLoanId
  **/
  @Schema(description = "")
  public String getParentLoanId() {
    return parentLoanId;
  }

  public void setParentLoanId(String parentLoanId) {
    this.parentLoanId = parentLoanId;
  }

  public Loan loanCorrelationId(String loanCorrelationId) {
    this.loanCorrelationId = loanCorrelationId;
    return this;
  }

   /**
   * Get loanCorrelationId
   * @return loanCorrelationId
  **/
  @Schema(description = "")
  public String getLoanCorrelationId() {
    return loanCorrelationId;
  }

  public void setLoanCorrelationId(String loanCorrelationId) {
    this.loanCorrelationId = loanCorrelationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Loan loan = (Loan) o;
    return Objects.equals(this.loanId, loan.loanId) &&
        Objects.equals(this.lastEvent, loan.lastEvent) &&
        Objects.equals(this.loanStatus, loan.loanStatus) &&
        Objects.equals(this.loanStatusReason, loan.loanStatusReason) &&
        Objects.equals(this.lastUpdatePartyId, loan.lastUpdatePartyId) &&
        Objects.equals(this.lastUpdateDateTime, loan.lastUpdateDateTime) &&
        Objects.equals(this.isInitiator, loan.isInitiator) &&
        Objects.equals(this.trade, loan.trade) &&
        Objects.equals(this.settlement, loan.settlement) &&
        Objects.equals(this.parentLoanId, loan.parentLoanId) &&
        Objects.equals(this.loanCorrelationId, loan.loanCorrelationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanId, lastEvent, loanStatus, loanStatusReason, lastUpdatePartyId, lastUpdateDateTime, isInitiator, trade, settlement, parentLoanId, loanCorrelationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Loan {\n");
    
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    lastEvent: ").append(toIndentedString(lastEvent)).append("\n");
    sb.append("    loanStatus: ").append(toIndentedString(loanStatus)).append("\n");
    sb.append("    loanStatusReason: ").append(toIndentedString(loanStatusReason)).append("\n");
    sb.append("    lastUpdatePartyId: ").append(toIndentedString(lastUpdatePartyId)).append("\n");
    sb.append("    lastUpdateDateTime: ").append(toIndentedString(lastUpdateDateTime)).append("\n");
    sb.append("    isInitiator: ").append(toIndentedString(isInitiator)).append("\n");
    sb.append("    trade: ").append(toIndentedString(trade)).append("\n");
    sb.append("    settlement: ").append(toIndentedString(settlement)).append("\n");
    sb.append("    parentLoanId: ").append(toIndentedString(parentLoanId)).append("\n");
    sb.append("    loanCorrelationId: ").append(toIndentedString(loanCorrelationId)).append("\n");
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
