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
 * ReturnAcknowledgement
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-29T18:55:08.725971332Z[GMT]")

public class ReturnAcknowledgement implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("acknowledgementType")
  private AcknowledgementType acknowledgementType = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("settlement")
  private PartySettlementInstruction settlement = null;

  public ReturnAcknowledgement acknowledgementType(AcknowledgementType acknowledgementType) {
    this.acknowledgementType = acknowledgementType;
    return this;
  }

   /**
   * Get acknowledgementType
   * @return acknowledgementType
  **/
  @Schema(required = true, description = "")
  public AcknowledgementType getAcknowledgementType() {
    return acknowledgementType;
  }

  public void setAcknowledgementType(AcknowledgementType acknowledgementType) {
    this.acknowledgementType = acknowledgementType;
  }

  public ReturnAcknowledgement description(String description) {
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

  public ReturnAcknowledgement settlement(PartySettlementInstruction settlement) {
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
    ReturnAcknowledgement returnAcknowledgement = (ReturnAcknowledgement) o;
    return Objects.equals(this.acknowledgementType, returnAcknowledgement.acknowledgementType) &&
        Objects.equals(this.description, returnAcknowledgement.description) &&
        Objects.equals(this.settlement, returnAcknowledgement.settlement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acknowledgementType, description, settlement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnAcknowledgement {\n");
    
    sb.append("    acknowledgementType: ").append(toIndentedString(acknowledgementType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
