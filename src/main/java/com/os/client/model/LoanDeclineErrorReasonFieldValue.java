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
 * LoanDeclineErrorReasonFieldValue
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-29T18:00:54.218085062Z[GMT]")

public class LoanDeclineErrorReasonFieldValue implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("field")
  private LoanDeclineErrorReasonFieldType field = null;

  @SerializedName("expectedValue")
  private OneOfLoanDeclineErrorReasonFieldValueExpectedValue expectedValue = null;

  public LoanDeclineErrorReasonFieldValue field(LoanDeclineErrorReasonFieldType field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @Schema(required = true, description = "")
  public LoanDeclineErrorReasonFieldType getField() {
    return field;
  }

  public void setField(LoanDeclineErrorReasonFieldType field) {
    this.field = field;
  }

  public LoanDeclineErrorReasonFieldValue expectedValue(OneOfLoanDeclineErrorReasonFieldValueExpectedValue expectedValue) {
    this.expectedValue = expectedValue;
    return this;
  }

   /**
   * Get expectedValue
   * @return expectedValue
  **/
  @Schema(description = "")
  public OneOfLoanDeclineErrorReasonFieldValueExpectedValue getExpectedValue() {
    return expectedValue;
  }

  public void setExpectedValue(OneOfLoanDeclineErrorReasonFieldValueExpectedValue expectedValue) {
    this.expectedValue = expectedValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanDeclineErrorReasonFieldValue loanDeclineErrorReasonFieldValue = (LoanDeclineErrorReasonFieldValue) o;
    return Objects.equals(this.field, loanDeclineErrorReasonFieldValue.field) &&
        Objects.equals(this.expectedValue, loanDeclineErrorReasonFieldValue.expectedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, expectedValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanDeclineErrorReasonFieldValue {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    expectedValue: ").append(toIndentedString(expectedValue)).append("\n");
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
