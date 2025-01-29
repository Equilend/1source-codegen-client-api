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
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * LedgerResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-29T18:00:54.218085062Z[GMT]")

public class LedgerResponse implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("code")
  private String code = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("responseDateTime")
  private OffsetDateTime responseDateTime = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("resourceUri")
  private String resourceUri = null;

  public LedgerResponse code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public LedgerResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public LedgerResponse responseDateTime(OffsetDateTime responseDateTime) {
    this.responseDateTime = responseDateTime;
    return this;
  }

   /**
   * Get responseDateTime
   * @return responseDateTime
  **/
  @Schema(description = "")
  public OffsetDateTime getResponseDateTime() {
    return responseDateTime;
  }

  public void setResponseDateTime(OffsetDateTime responseDateTime) {
    this.responseDateTime = responseDateTime;
  }

  public LedgerResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(required = true, description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public LedgerResponse resourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

   /**
   * Get resourceUri
   * @return resourceUri
  **/
  @Schema(description = "")
  public String getResourceUri() {
    return resourceUri;
  }

  public void setResourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LedgerResponse ledgerResponse = (LedgerResponse) o;
    return Objects.equals(this.code, ledgerResponse.code) &&
        Objects.equals(this.type, ledgerResponse.type) &&
        Objects.equals(this.responseDateTime, ledgerResponse.responseDateTime) &&
        Objects.equals(this.message, ledgerResponse.message) &&
        Objects.equals(this.resourceUri, ledgerResponse.resourceUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type, responseDateTime, message, resourceUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LedgerResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    responseDateTime: ").append(toIndentedString(responseDateTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
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
