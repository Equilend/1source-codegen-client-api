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
import com.os.client.model.Venue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.LocalDate;
import java.io.Serializable;
/**
 * RecallProposal
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-07-02T14:22:48.657322733Z[GMT]")

public class RecallProposal implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("executionVenue")
  private Venue executionVenue = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("recallDate")
  private LocalDate recallDate = null;

  @SerializedName("recallDueDate")
  private LocalDate recallDueDate = null;

  public RecallProposal executionVenue(Venue executionVenue) {
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

  public RecallProposal quantity(Integer quantity) {
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

  public RecallProposal recallDate(LocalDate recallDate) {
    this.recallDate = recallDate;
    return this;
  }

   /**
   * description: The effective date of the recall. The securities are expected to be returned on the recallDate. - format: YYYY-MM-DD 
   * @return recallDate
  **/
  @Schema(required = true, description = "description: The effective date of the recall. The securities are expected to be returned on the recallDate. - format: YYYY-MM-DD ")
  public LocalDate getRecallDate() {
    return recallDate;
  }

  public void setRecallDate(LocalDate recallDate) {
    this.recallDate = recallDate;
  }

  public RecallProposal recallDueDate(LocalDate recallDueDate) {
    this.recallDueDate = recallDueDate;
    return this;
  }

   /**
   * Get recallDueDate
   * @return recallDueDate
  **/
  @Schema(description = "")
  public LocalDate getRecallDueDate() {
    return recallDueDate;
  }

  public void setRecallDueDate(LocalDate recallDueDate) {
    this.recallDueDate = recallDueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecallProposal recallProposal = (RecallProposal) o;
    return Objects.equals(this.executionVenue, recallProposal.executionVenue) &&
        Objects.equals(this.quantity, recallProposal.quantity) &&
        Objects.equals(this.recallDate, recallProposal.recallDate) &&
        Objects.equals(this.recallDueDate, recallProposal.recallDueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionVenue, quantity, recallDate, recallDueDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecallProposal {\n");
    
    sb.append("    executionVenue: ").append(toIndentedString(executionVenue)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    recallDate: ").append(toIndentedString(recallDate)).append("\n");
    sb.append("    recallDueDate: ").append(toIndentedString(recallDueDate)).append("\n");
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
