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

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ReturnProposal
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-05T14:31:33.159170711Z[GMT]")

public class ReturnProposal implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("executionVenue")
  private Venue executionVenue = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("returnDate")
  private LocalDate returnDate = null;

  @SerializedName("returnSettlementDate")
  private LocalDate returnSettlementDate = null;

  @SerializedName("collateralValue")
  private Double collateralValue = null;

  @SerializedName("settlementType")
  private SettlementType settlementType = null;

  @SerializedName("settlement")
  private List<PartySettlementInstruction> settlement = null;

  public ReturnProposal executionVenue(Venue executionVenue) {
    this.executionVenue = executionVenue;
    return this;
  }

   /**
   * Get executionVenue
   * @return executionVenue
  **/
  @Schema(required = true, description = "")
  public Venue getExecutionVenue() {
    return executionVenue;
  }

  public void setExecutionVenue(Venue executionVenue) {
    this.executionVenue = executionVenue;
  }

  public ReturnProposal quantity(Integer quantity) {
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

  public ReturnProposal returnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
    return this;
  }

   /**
   * Get returnDate
   * @return returnDate
  **/
  @Schema(required = true, description = "")
  public LocalDate getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
  }

  public ReturnProposal returnSettlementDate(LocalDate returnSettlementDate) {
    this.returnSettlementDate = returnSettlementDate;
    return this;
  }

   /**
   * Get returnSettlementDate
   * @return returnSettlementDate
  **/
  @Schema(required = true, description = "")
  public LocalDate getReturnSettlementDate() {
    return returnSettlementDate;
  }

  public void setReturnSettlementDate(LocalDate returnSettlementDate) {
    this.returnSettlementDate = returnSettlementDate;
  }

  public ReturnProposal collateralValue(Double collateralValue) {
    this.collateralValue = collateralValue;
    return this;
  }

   /**
   * The collateral value of the shares being returned, in the collateral currency on the loan loan.
   * @return collateralValue
  **/
  @Schema(required = true, description = "The collateral value of the shares being returned, in the collateral currency on the loan loan.")
  public Double getCollateralValue() {
    return collateralValue;
  }

  public void setCollateralValue(Double collateralValue) {
    this.collateralValue = collateralValue;
  }

  public ReturnProposal settlementType(SettlementType settlementType) {
    this.settlementType = settlementType;
    return this;
  }

   /**
   * Get settlementType
   * @return settlementType
  **/
  @Schema(required = true, description = "")
  public SettlementType getSettlementType() {
    return settlementType;
  }

  public void setSettlementType(SettlementType settlementType) {
    this.settlementType = settlementType;
  }

  public ReturnProposal settlement(List<PartySettlementInstruction> settlement) {
    this.settlement = settlement;
    return this;
  }

  public ReturnProposal addSettlementItem(PartySettlementInstruction settlementItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnProposal returnProposal = (ReturnProposal) o;
    return Objects.equals(this.executionVenue, returnProposal.executionVenue) &&
        Objects.equals(this.quantity, returnProposal.quantity) &&
        Objects.equals(this.returnDate, returnProposal.returnDate) &&
        Objects.equals(this.returnSettlementDate, returnProposal.returnSettlementDate) &&
        Objects.equals(this.collateralValue, returnProposal.collateralValue) &&
        Objects.equals(this.settlementType, returnProposal.settlementType) &&
        Objects.equals(this.settlement, returnProposal.settlement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionVenue, quantity, returnDate, returnSettlementDate, collateralValue, settlementType, settlement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnProposal {\n");
    
    sb.append("    executionVenue: ").append(toIndentedString(executionVenue)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    returnDate: ").append(toIndentedString(returnDate)).append("\n");
    sb.append("    returnSettlementDate: ").append(toIndentedString(returnSettlementDate)).append("\n");
    sb.append("    collateralValue: ").append(toIndentedString(collateralValue)).append("\n");
    sb.append("    settlementType: ").append(toIndentedString(settlementType)).append("\n");
    sb.append("    settlement: ").append(toIndentedString(settlement)).append("\n");
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
