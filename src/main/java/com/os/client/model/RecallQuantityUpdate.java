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
 * RecallQuantityUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-23T15:43:02.135640846Z[GMT]")

public class RecallQuantityUpdate implements Serializable, RecallsRecallIdBody {
  private static final long serialVersionUID = 1L;
  @SerializedName("quantity")
  private Integer quantity = null;

  public RecallQuantityUpdate quantity(Integer quantity) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecallQuantityUpdate recallQuantityUpdate = (RecallQuantityUpdate) o;
    return Objects.equals(this.quantity, recallQuantityUpdate.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecallQuantityUpdate {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
