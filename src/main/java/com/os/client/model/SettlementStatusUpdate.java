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
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * SettlementStatusUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-05T14:31:33.159170711Z[GMT]")

public class SettlementStatusUpdate implements Serializable, LoansLoanIdBody, ReturnsReturnIdBody {
  private static final long serialVersionUID = 1L;
  @SerializedName("settlementStatus")
  private SettlementStatus settlementStatus = null;

  public SettlementStatusUpdate settlementStatus(SettlementStatus settlementStatus) {
    this.settlementStatus = settlementStatus;
    return this;
  }

   /**
   * Get settlementStatus
   * @return settlementStatus
  **/
  @Schema(required = true, description = "")
  public SettlementStatus getSettlementStatus() {
    return settlementStatus;
  }

  public void setSettlementStatus(SettlementStatus settlementStatus) {
    this.settlementStatus = settlementStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementStatusUpdate settlementStatusUpdate = (SettlementStatusUpdate) o;
    return Objects.equals(this.settlementStatus, settlementStatusUpdate.settlementStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlementStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementStatusUpdate {\n");
    
    sb.append("    settlementStatus: ").append(toIndentedString(settlementStatus)).append("\n");
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
