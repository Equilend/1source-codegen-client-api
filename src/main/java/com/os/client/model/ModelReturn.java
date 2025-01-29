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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ModelReturn
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-29T16:47:49.918644102Z[GMT]")

public class ModelReturn implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("returnId")
  private String returnId = null;

  @SerializedName("loanId")
  private String loanId = null;

  @SerializedName("status")
  private ReturnStatus status = null;

  @SerializedName("executionVenue")
  private Venue executionVenue = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("collateral")
  private Collateral collateral = null;

  @SerializedName("settlementType")
  private SettlementType settlementType = null;

  @SerializedName("returnDate")
  private LocalDate returnDate = null;

  @SerializedName("returnSettlementDate")
  private LocalDate returnSettlementDate = null;

  @SerializedName("acknowledgementType")
  private AcknowledgementType acknowledgementType = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("settlement")
  private List<PartySettlementInstruction> settlement = null;

  @SerializedName("lastUpdateDatetime")
  private OffsetDateTime lastUpdateDatetime = null;

  public ModelReturn returnId(String returnId) {
    this.returnId = returnId;
    return this;
  }

   /**
   * Get returnId
   * @return returnId
  **/
  @Schema(description = "")
  public String getReturnId() {
    return returnId;
  }

  public void setReturnId(String returnId) {
    this.returnId = returnId;
  }

  public ModelReturn loanId(String loanId) {
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

  public ModelReturn status(ReturnStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public ReturnStatus getStatus() {
    return status;
  }

  public void setStatus(ReturnStatus status) {
    this.status = status;
  }

  public ModelReturn executionVenue(Venue executionVenue) {
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

  public ModelReturn quantity(Integer quantity) {
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

  public ModelReturn collateral(Collateral collateral) {
    this.collateral = collateral;
    return this;
  }

   /**
   * Get collateral
   * @return collateral
  **/
  @Schema(description = "")
  public Collateral getCollateral() {
    return collateral;
  }

  public void setCollateral(Collateral collateral) {
    this.collateral = collateral;
  }

  public ModelReturn settlementType(SettlementType settlementType) {
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

  public ModelReturn returnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
    return this;
  }

   /**
   * Get returnDate
   * @return returnDate
  **/
  @Schema(description = "")
  public LocalDate getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
  }

  public ModelReturn returnSettlementDate(LocalDate returnSettlementDate) {
    this.returnSettlementDate = returnSettlementDate;
    return this;
  }

   /**
   * Get returnSettlementDate
   * @return returnSettlementDate
  **/
  @Schema(description = "")
  public LocalDate getReturnSettlementDate() {
    return returnSettlementDate;
  }

  public void setReturnSettlementDate(LocalDate returnSettlementDate) {
    this.returnSettlementDate = returnSettlementDate;
  }

  public ModelReturn acknowledgementType(AcknowledgementType acknowledgementType) {
    this.acknowledgementType = acknowledgementType;
    return this;
  }

   /**
   * Get acknowledgementType
   * @return acknowledgementType
  **/
  @Schema(description = "")
  public AcknowledgementType getAcknowledgementType() {
    return acknowledgementType;
  }

  public void setAcknowledgementType(AcknowledgementType acknowledgementType) {
    this.acknowledgementType = acknowledgementType;
  }

  public ModelReturn description(String description) {
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

  public ModelReturn settlement(List<PartySettlementInstruction> settlement) {
    this.settlement = settlement;
    return this;
  }

  public ModelReturn addSettlementItem(PartySettlementInstruction settlementItem) {
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

  public ModelReturn lastUpdateDatetime(OffsetDateTime lastUpdateDatetime) {
    this.lastUpdateDatetime = lastUpdateDatetime;
    return this;
  }

   /**
   * Get lastUpdateDatetime
   * @return lastUpdateDatetime
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getLastUpdateDatetime() {
    return lastUpdateDatetime;
  }

  public void setLastUpdateDatetime(OffsetDateTime lastUpdateDatetime) {
    this.lastUpdateDatetime = lastUpdateDatetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelReturn _return = (ModelReturn) o;
    return Objects.equals(this.returnId, _return.returnId) &&
        Objects.equals(this.loanId, _return.loanId) &&
        Objects.equals(this.status, _return.status) &&
        Objects.equals(this.executionVenue, _return.executionVenue) &&
        Objects.equals(this.quantity, _return.quantity) &&
        Objects.equals(this.collateral, _return.collateral) &&
        Objects.equals(this.settlementType, _return.settlementType) &&
        Objects.equals(this.returnDate, _return.returnDate) &&
        Objects.equals(this.returnSettlementDate, _return.returnSettlementDate) &&
        Objects.equals(this.acknowledgementType, _return.acknowledgementType) &&
        Objects.equals(this.description, _return.description) &&
        Objects.equals(this.settlement, _return.settlement) &&
        Objects.equals(this.lastUpdateDatetime, _return.lastUpdateDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnId, loanId, status, executionVenue, quantity, collateral, settlementType, returnDate, returnSettlementDate, acknowledgementType, description, settlement, lastUpdateDatetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelReturn {\n");
    
    sb.append("    returnId: ").append(toIndentedString(returnId)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    executionVenue: ").append(toIndentedString(executionVenue)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    collateral: ").append(toIndentedString(collateral)).append("\n");
    sb.append("    settlementType: ").append(toIndentedString(settlementType)).append("\n");
    sb.append("    returnDate: ").append(toIndentedString(returnDate)).append("\n");
    sb.append("    returnSettlementDate: ").append(toIndentedString(returnSettlementDate)).append("\n");
    sb.append("    acknowledgementType: ").append(toIndentedString(acknowledgementType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    settlement: ").append(toIndentedString(settlement)).append("\n");
    sb.append("    lastUpdateDatetime: ").append(toIndentedString(lastUpdateDatetime)).append("\n");
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
