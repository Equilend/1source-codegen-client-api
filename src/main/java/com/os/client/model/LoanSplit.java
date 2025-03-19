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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * LoanSplit
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-19T20:22:04.606499523Z[GMT]")

public class LoanSplit implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("loanSplitId")
  private String loanSplitId = null;

  @SerializedName("loanSplitStatus")
  private LoanSplitStatus loanSplitStatus = null;

  @SerializedName("loanId")
  private String loanId = null;

  @SerializedName("splitLots")
  private List<LoanSplitLot> splitLots = null;

  @SerializedName("lastUpdateDatetime")
  private OffsetDateTime lastUpdateDatetime = null;

  public LoanSplit loanSplitId(String loanSplitId) {
    this.loanSplitId = loanSplitId;
    return this;
  }

   /**
   * Get loanSplitId
   * @return loanSplitId
  **/
  @Schema(required = true, description = "")
  public String getLoanSplitId() {
    return loanSplitId;
  }

  public void setLoanSplitId(String loanSplitId) {
    this.loanSplitId = loanSplitId;
  }

  public LoanSplit loanSplitStatus(LoanSplitStatus loanSplitStatus) {
    this.loanSplitStatus = loanSplitStatus;
    return this;
  }

   /**
   * Get loanSplitStatus
   * @return loanSplitStatus
  **/
  @Schema(required = true, description = "")
  public LoanSplitStatus getLoanSplitStatus() {
    return loanSplitStatus;
  }

  public void setLoanSplitStatus(LoanSplitStatus loanSplitStatus) {
    this.loanSplitStatus = loanSplitStatus;
  }

  public LoanSplit loanId(String loanId) {
    this.loanId = loanId;
    return this;
  }

   /**
   * Get loanId
   * @return loanId
  **/
  @Schema(description = "")
  public String getLoanId() {
    return loanId;
  }

  public void setLoanId(String loanId) {
    this.loanId = loanId;
  }

  public LoanSplit splitLots(List<LoanSplitLot> splitLots) {
    this.splitLots = splitLots;
    return this;
  }

  public LoanSplit addSplitLotsItem(LoanSplitLot splitLotsItem) {
    if (this.splitLots == null) {
      this.splitLots = new ArrayList<>();
    }
    this.splitLots.add(splitLotsItem);
    return this;
  }

   /**
   * Get splitLots
   * @return splitLots
  **/
  @Schema(description = "")
  public List<LoanSplitLot> getSplitLots() {
    return splitLots;
  }

  public void setSplitLots(List<LoanSplitLot> splitLots) {
    this.splitLots = splitLots;
  }

  public LoanSplit lastUpdateDatetime(OffsetDateTime lastUpdateDatetime) {
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
    LoanSplit loanSplit = (LoanSplit) o;
    return Objects.equals(this.loanSplitId, loanSplit.loanSplitId) &&
        Objects.equals(this.loanSplitStatus, loanSplit.loanSplitStatus) &&
        Objects.equals(this.loanId, loanSplit.loanId) &&
        Objects.equals(this.splitLots, loanSplit.splitLots) &&
        Objects.equals(this.lastUpdateDatetime, loanSplit.lastUpdateDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanSplitId, loanSplitStatus, loanId, splitLots, lastUpdateDatetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanSplit {\n");
    
    sb.append("    loanSplitId: ").append(toIndentedString(loanSplitId)).append("\n");
    sb.append("    loanSplitStatus: ").append(toIndentedString(loanSplitStatus)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    splitLots: ").append(toIndentedString(splitLots)).append("\n");
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
