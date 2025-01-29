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
 * LoanSplitProposalLot
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-29T18:00:54.218085062Z[GMT]")

public class LoanSplitProposalLot implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("internalReference")
  private String internalReference = null;

  @SerializedName("settlement")
  private PartySettlementInstruction settlement = null;

  public LoanSplitProposalLot quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @Schema(description = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public LoanSplitProposalLot internalReference(String internalReference) {
    this.internalReference = internalReference;
    return this;
  }

   /**
   * Get internalReference
   * @return internalReference
  **/
  @Schema(description = "")
  public String getInternalReference() {
    return internalReference;
  }

  public void setInternalReference(String internalReference) {
    this.internalReference = internalReference;
  }

  public LoanSplitProposalLot settlement(PartySettlementInstruction settlement) {
    this.settlement = settlement;
    return this;
  }

   /**
   * Get settlement
   * @return settlement
  **/
  @Schema(description = "")
  public PartySettlementInstruction getSettlement() {
    return settlement;
  }

  public void setSettlement(PartySettlementInstruction settlement) {
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
    LoanSplitProposalLot loanSplitProposalLot = (LoanSplitProposalLot) o;
    return Objects.equals(this.quantity, loanSplitProposalLot.quantity) &&
        Objects.equals(this.internalReference, loanSplitProposalLot.internalReference) &&
        Objects.equals(this.settlement, loanSplitProposalLot.settlement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, internalReference, settlement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanSplitProposalLot {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    internalReference: ").append(toIndentedString(internalReference)).append("\n");
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
