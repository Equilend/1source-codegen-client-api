/*
 * 1Source Ledger API
 * 1Source Ledger API provides client access to the 1Source Ledger. You can find out more about 1Source at [https://equilend.com](https://equilend.com).  This specification is work in progress. The design is meant to model the securities lending life cycle in as clean a way as possible while being robust enough to easily translate to ISLA CDM workflows and data model.  API specification is the intellectual property of EquiLend LLC and should not be copied or disseminated in any way. 
 *
 * OpenAPI spec version: 1.0.5
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
import com.os.client.model.InternalReference;
import com.os.client.model.PartySettlementInstruction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.io.Serializable;
/**
 * ContractSplitLot
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-07-02T14:22:48.657322733Z[GMT]")

public class ContractSplitLot implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("contractId")
  private String contractId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("internalRef")
  private InternalReference internalRef = null;

  @SerializedName("settlement")
  private PartySettlementInstruction settlement = null;

  public ContractSplitLot contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * Get contractId
   * @return contractId
  **/
  @Schema(description = "")
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  public ContractSplitLot quantity(Integer quantity) {
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

  public ContractSplitLot internalRef(InternalReference internalRef) {
    this.internalRef = internalRef;
    return this;
  }

   /**
   * Get internalRef
   * @return internalRef
  **/
  @Schema(required = true, description = "")
  public InternalReference getInternalRef() {
    return internalRef;
  }

  public void setInternalRef(InternalReference internalRef) {
    this.internalRef = internalRef;
  }

  public ContractSplitLot settlement(PartySettlementInstruction settlement) {
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
    ContractSplitLot contractSplitLot = (ContractSplitLot) o;
    return Objects.equals(this.contractId, contractSplitLot.contractId) &&
        Objects.equals(this.quantity, contractSplitLot.quantity) &&
        Objects.equals(this.internalRef, contractSplitLot.internalRef) &&
        Objects.equals(this.settlement, contractSplitLot.settlement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, quantity, internalRef, settlement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractSplitLot {\n");
    
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    internalRef: ").append(toIndentedString(internalRef)).append("\n");
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
