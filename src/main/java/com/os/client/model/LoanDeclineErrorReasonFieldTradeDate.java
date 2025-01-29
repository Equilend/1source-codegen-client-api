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

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * LoanDeclineErrorReasonFieldTradeDate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-29T18:55:08.725971332Z[GMT]")

public class LoanDeclineErrorReasonFieldTradeDate implements Serializable, AnyOfLoanDeclineErrorResponseErrorsItems {
  private static final long serialVersionUID = 1L;
  /**
   * Gets or Sets field
   */
  @JsonAdapter(FieldEnum.Adapter.class)
  public enum FieldEnum {
    @SerializedName("TRADE_DATE")
    TRADE_DATE("TRADE_DATE");

    private String value;

    FieldEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FieldEnum fromValue(String input) {
      for (FieldEnum b : FieldEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FieldEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FieldEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FieldEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FieldEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("field")
  private FieldEnum field = null;

  @SerializedName("expectedValue")
  private LocalDate expectedValue = null;

  public LoanDeclineErrorReasonFieldTradeDate field(FieldEnum field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @Schema(required = true, description = "")
  public FieldEnum getField() {
    return field;
  }

  public void setField(FieldEnum field) {
    this.field = field;
  }

  public LoanDeclineErrorReasonFieldTradeDate expectedValue(LocalDate expectedValue) {
    this.expectedValue = expectedValue;
    return this;
  }

   /**
   * Get expectedValue
   * @return expectedValue
  **/
  @Schema(required = true, description = "")
  public LocalDate getExpectedValue() {
    return expectedValue;
  }

  public void setExpectedValue(LocalDate expectedValue) {
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
    LoanDeclineErrorReasonFieldTradeDate loanDeclineErrorReasonFieldTradeDate = (LoanDeclineErrorReasonFieldTradeDate) o;
    return Objects.equals(this.field, loanDeclineErrorReasonFieldTradeDate.field) &&
        Objects.equals(this.expectedValue, loanDeclineErrorReasonFieldTradeDate.expectedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, expectedValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanDeclineErrorReasonFieldTradeDate {\n");
    
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
