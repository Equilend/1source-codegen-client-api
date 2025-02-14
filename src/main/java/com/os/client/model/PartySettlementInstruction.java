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
 * PartySettlementInstruction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-02-14T16:23:32.309873479Z[GMT]")

public class PartySettlementInstruction implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("partyRole")
  private PartyRole partyRole = null;

  @SerializedName("settlementStatus")
  private SettlementStatus settlementStatus = null;

  @SerializedName("internalAccountCode")
  private String internalAccountCode = null;

  @SerializedName("instruction")
  private SettlementInstruction instruction = null;

  public PartySettlementInstruction partyRole(PartyRole partyRole) {
    this.partyRole = partyRole;
    return this;
  }

   /**
   * Get partyRole
   * @return partyRole
  **/
  @Schema(required = true, description = "")
  public PartyRole getPartyRole() {
    return partyRole;
  }

  public void setPartyRole(PartyRole partyRole) {
    this.partyRole = partyRole;
  }

  public PartySettlementInstruction settlementStatus(SettlementStatus settlementStatus) {
    this.settlementStatus = settlementStatus;
    return this;
  }

   /**
   * Get settlementStatus
   * @return settlementStatus
  **/
  @Schema(description = "")
  public SettlementStatus getSettlementStatus() {
    return settlementStatus;
  }

  public void setSettlementStatus(SettlementStatus settlementStatus) {
    this.settlementStatus = settlementStatus;
  }

  public PartySettlementInstruction internalAccountCode(String internalAccountCode) {
    this.internalAccountCode = internalAccountCode;
    return this;
  }

   /**
   * Get internalAccountCode
   * @return internalAccountCode
  **/
  @Schema(description = "")
  public String getInternalAccountCode() {
    return internalAccountCode;
  }

  public void setInternalAccountCode(String internalAccountCode) {
    this.internalAccountCode = internalAccountCode;
  }

  public PartySettlementInstruction instruction(SettlementInstruction instruction) {
    this.instruction = instruction;
    return this;
  }

   /**
   * Get instruction
   * @return instruction
  **/
  @Schema(required = true, description = "")
  public SettlementInstruction getInstruction() {
    return instruction;
  }

  public void setInstruction(SettlementInstruction instruction) {
    this.instruction = instruction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartySettlementInstruction partySettlementInstruction = (PartySettlementInstruction) o;
    return Objects.equals(this.partyRole, partySettlementInstruction.partyRole) &&
        Objects.equals(this.settlementStatus, partySettlementInstruction.settlementStatus) &&
        Objects.equals(this.internalAccountCode, partySettlementInstruction.internalAccountCode) &&
        Objects.equals(this.instruction, partySettlementInstruction.instruction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyRole, settlementStatus, internalAccountCode, instruction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartySettlementInstruction {\n");
    
    sb.append("    partyRole: ").append(toIndentedString(partyRole)).append("\n");
    sb.append("    settlementStatus: ").append(toIndentedString(settlementStatus)).append("\n");
    sb.append("    internalAccountCode: ").append(toIndentedString(internalAccountCode)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
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
