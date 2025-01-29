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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * LoanDeclineErrorResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-29T18:00:54.218085062Z[GMT]")

public class LoanDeclineErrorResponse implements Serializable, OneOfLoanLoanStatusReason {
  private static final long serialVersionUID = 1L;
  @SerializedName("reason")
  private LoanDeclineErrorReason reason = null;

  @SerializedName("errors")
  private List<LoanDeclineErrorReasonFieldValue> errors = null;

  public LoanDeclineErrorResponse reason(LoanDeclineErrorReason reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @Schema(required = true, description = "")
  public LoanDeclineErrorReason getReason() {
    return reason;
  }

  public void setReason(LoanDeclineErrorReason reason) {
    this.reason = reason;
  }

  public LoanDeclineErrorResponse errors(List<LoanDeclineErrorReasonFieldValue> errors) {
    this.errors = errors;
    return this;
  }

  public LoanDeclineErrorResponse addErrorsItem(LoanDeclineErrorReasonFieldValue errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @Schema(description = "")
  public List<LoanDeclineErrorReasonFieldValue> getErrors() {
    return errors;
  }

  public void setErrors(List<LoanDeclineErrorReasonFieldValue> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanDeclineErrorResponse loanDeclineErrorResponse = (LoanDeclineErrorResponse) o;
    return Objects.equals(this.reason, loanDeclineErrorResponse.reason) &&
        Objects.equals(this.errors, loanDeclineErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanDeclineErrorResponse {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
