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
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Recall
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-19T18:59:50.954293492Z[GMT]")

public class Recall implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("recallId")
  private String recallId = null;

  @SerializedName("loanId")
  private String loanId = null;

  @SerializedName("status")
  private RecallStatus status = null;

  @SerializedName("executionVenue")
  private Venue executionVenue = null;

  @SerializedName("openQuantity")
  private Integer openQuantity = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("recallDate")
  private LocalDate recallDate = null;

  @SerializedName("recallDueDate")
  private LocalDate recallDueDate = null;

  @SerializedName("acknowledgementType")
  private AcknowledgementType acknowledgementType = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("lastUpdateDatetime")
  private OffsetDateTime lastUpdateDatetime = null;

  public Recall recallId(String recallId) {
    this.recallId = recallId;
    return this;
  }

   /**
   * Get recallId
   * @return recallId
  **/
  @Schema(required = true, description = "")
  public String getRecallId() {
    return recallId;
  }

  public void setRecallId(String recallId) {
    this.recallId = recallId;
  }

  public Recall loanId(String loanId) {
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

  public Recall status(RecallStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public RecallStatus getStatus() {
    return status;
  }

  public void setStatus(RecallStatus status) {
    this.status = status;
  }

  public Recall executionVenue(Venue executionVenue) {
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

  public Recall openQuantity(Integer openQuantity) {
    this.openQuantity = openQuantity;
    return this;
  }

   /**
   * Get openQuantity
   * @return openQuantity
  **/
  @Schema(description = "")
  public Integer getOpenQuantity() {
    return openQuantity;
  }

  public void setOpenQuantity(Integer openQuantity) {
    this.openQuantity = openQuantity;
  }

  public Recall quantity(Integer quantity) {
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

  public Recall recallDate(LocalDate recallDate) {
    this.recallDate = recallDate;
    return this;
  }

   /**
   * Get recallDate
   * @return recallDate
  **/
  @Schema(description = "")
  public LocalDate getRecallDate() {
    return recallDate;
  }

  public void setRecallDate(LocalDate recallDate) {
    this.recallDate = recallDate;
  }

  public Recall recallDueDate(LocalDate recallDueDate) {
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

  public Recall acknowledgementType(AcknowledgementType acknowledgementType) {
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

  public Recall description(String description) {
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

  public Recall lastUpdateDatetime(OffsetDateTime lastUpdateDatetime) {
    this.lastUpdateDatetime = lastUpdateDatetime;
    return this;
  }

   /**
   * Get lastUpdateDatetime
   * @return lastUpdateDatetime
  **/
  @Schema(description = "")
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
    Recall recall = (Recall) o;
    return Objects.equals(this.recallId, recall.recallId) &&
        Objects.equals(this.loanId, recall.loanId) &&
        Objects.equals(this.status, recall.status) &&
        Objects.equals(this.executionVenue, recall.executionVenue) &&
        Objects.equals(this.openQuantity, recall.openQuantity) &&
        Objects.equals(this.quantity, recall.quantity) &&
        Objects.equals(this.recallDate, recall.recallDate) &&
        Objects.equals(this.recallDueDate, recall.recallDueDate) &&
        Objects.equals(this.acknowledgementType, recall.acknowledgementType) &&
        Objects.equals(this.description, recall.description) &&
        Objects.equals(this.lastUpdateDatetime, recall.lastUpdateDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recallId, loanId, status, executionVenue, openQuantity, quantity, recallDate, recallDueDate, acknowledgementType, description, lastUpdateDatetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recall {\n");
    
    sb.append("    recallId: ").append(toIndentedString(recallId)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    executionVenue: ").append(toIndentedString(executionVenue)).append("\n");
    sb.append("    openQuantity: ").append(toIndentedString(openQuantity)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    recallDate: ").append(toIndentedString(recallDate)).append("\n");
    sb.append("    recallDueDate: ").append(toIndentedString(recallDueDate)).append("\n");
    sb.append("    acknowledgementType: ").append(toIndentedString(acknowledgementType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
