/*
 * 1Source Ledger API
 * 1Source Ledger API provides client access to the 1Source Ledger. You can find out more about 1Source at [https://equilend.com](https://equilend.com).  This specification is work in progress. The design is meant to model the securities lending life cycle in as clean a way as possible while being robust enough to easily translate to ISLA CDM workflows and data model.  API specification is the intellectual property of EquiLend LLC and should not be copied or disseminated in any way. 
 *
 * OpenAPI spec version: 1.2.0
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
 * ErrorReasonFieldValue
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-06T16:12:41.344560814Z[GMT]")

public class ErrorReasonFieldValue implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("field")
  private ErrorField field = null;

  @SerializedName("expectedValue")
  private String expectedValue = null;

  public ErrorReasonFieldValue field(ErrorField field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @Schema(required = true, description = "")
  public ErrorField getField() {
    return field;
  }

  public void setField(ErrorField field) {
    this.field = field;
  }

  public ErrorReasonFieldValue expectedValue(String expectedValue) {
    this.expectedValue = expectedValue;
    return this;
  }

   /**
   * Get expectedValue
   * @return expectedValue
  **/
  @Schema(description = "")
  public String getExpectedValue() {
    return expectedValue;
  }

  public void setExpectedValue(String expectedValue) {
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
    ErrorReasonFieldValue errorReasonFieldValue = (ErrorReasonFieldValue) o;
    return Objects.equals(this.field, errorReasonFieldValue.field) &&
        Objects.equals(this.expectedValue, errorReasonFieldValue.expectedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, expectedValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorReasonFieldValue {\n");
    
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
