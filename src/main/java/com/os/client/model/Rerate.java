/*
 * 1Source Ledger API
 * 1Source Ledger API provides client access to the 1Source Ledger. You can find out more about 1Source at [https://equilend.com](https://equilend.com).  This specification is work in progress. The design is meant to model the securities lending life cycle in as clean a way as possible while being robust enough to easily translate to ISLA CDM workflows and data model.  API specification is the intellectual property of EquiLend LLC and should not be copied or disseminated in any way. 
 *
 * OpenAPI spec version: 1.2.2
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
 * Rerate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-29T19:02:50.865809907Z[GMT]")

public class Rerate implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("rerateId")
  private String rerateId = null;

  @SerializedName("loanId")
  private String loanId = null;

  @SerializedName("status")
  private RerateStatus status = null;

  @SerializedName("statusReason")
  private OneOfRerateStatusReason statusReason = null;

  @SerializedName("executionVenue")
  private Venue executionVenue = null;

  @SerializedName("isInitiator")
  private Boolean isInitiator = null;

  @SerializedName("rate")
  private Rate rate = null;

  @SerializedName("rerate")
  private Rate rerate = null;

  @SerializedName("dateProposed")
  private LocalDate dateProposed = null;

  @SerializedName("lastUpdateDatetime")
  private OffsetDateTime lastUpdateDatetime = null;

  public Rerate rerateId(String rerateId) {
    this.rerateId = rerateId;
    return this;
  }

   /**
   * Get rerateId
   * @return rerateId
  **/
  @Schema(required = true, description = "")
  public String getRerateId() {
    return rerateId;
  }

  public void setRerateId(String rerateId) {
    this.rerateId = rerateId;
  }

  public Rerate loanId(String loanId) {
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

  public Rerate status(RerateStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public RerateStatus getStatus() {
    return status;
  }

  public void setStatus(RerateStatus status) {
    this.status = status;
  }

  public Rerate statusReason(OneOfRerateStatusReason statusReason) {
    this.statusReason = statusReason;
    return this;
  }

   /**
   * Get statusReason
   * @return statusReason
  **/
  @Schema(description = "")
  public OneOfRerateStatusReason getStatusReason() {
    return statusReason;
  }

  public void setStatusReason(OneOfRerateStatusReason statusReason) {
    this.statusReason = statusReason;
  }

  public Rerate executionVenue(Venue executionVenue) {
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

  public Rerate isInitiator(Boolean isInitiator) {
    this.isInitiator = isInitiator;
    return this;
  }

   /**
   * Get isInitiator
   * @return isInitiator
  **/
  @Schema(description = "")
  public Boolean isIsInitiator() {
    return isInitiator;
  }

  public void setIsInitiator(Boolean isInitiator) {
    this.isInitiator = isInitiator;
  }

  public Rerate rate(Rate rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @Schema(required = true, description = "")
  public Rate getRate() {
    return rate;
  }

  public void setRate(Rate rate) {
    this.rate = rate;
  }

  public Rerate rerate(Rate rerate) {
    this.rerate = rerate;
    return this;
  }

   /**
   * Get rerate
   * @return rerate
  **/
  @Schema(required = true, description = "")
  public Rate getRerate() {
    return rerate;
  }

  public void setRerate(Rate rerate) {
    this.rerate = rerate;
  }

  public Rerate dateProposed(LocalDate dateProposed) {
    this.dateProposed = dateProposed;
    return this;
  }

   /**
   * Get dateProposed
   * @return dateProposed
  **/
  @Schema(description = "")
  public LocalDate getDateProposed() {
    return dateProposed;
  }

  public void setDateProposed(LocalDate dateProposed) {
    this.dateProposed = dateProposed;
  }

  public Rerate lastUpdateDatetime(OffsetDateTime lastUpdateDatetime) {
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
    Rerate rerate = (Rerate) o;
    return Objects.equals(this.rerateId, rerate.rerateId) &&
        Objects.equals(this.loanId, rerate.loanId) &&
        Objects.equals(this.status, rerate.status) &&
        Objects.equals(this.statusReason, rerate.statusReason) &&
        Objects.equals(this.executionVenue, rerate.executionVenue) &&
        Objects.equals(this.isInitiator, rerate.isInitiator) &&
        Objects.equals(this.rate, rerate.rate) &&
        Objects.equals(this.rerate, rerate.rerate) &&
        Objects.equals(this.dateProposed, rerate.dateProposed) &&
        Objects.equals(this.lastUpdateDatetime, rerate.lastUpdateDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rerateId, loanId, status, statusReason, executionVenue, isInitiator, rate, rerate, dateProposed, lastUpdateDatetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rerate {\n");
    
    sb.append("    rerateId: ").append(toIndentedString(rerateId)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    executionVenue: ").append(toIndentedString(executionVenue)).append("\n");
    sb.append("    isInitiator: ").append(toIndentedString(isInitiator)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    rerate: ").append(toIndentedString(rerate)).append("\n");
    sb.append("    dateProposed: ").append(toIndentedString(dateProposed)).append("\n");
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
