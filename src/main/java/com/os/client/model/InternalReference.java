/*
 * 1Source Ledger API
 * 1Source Ledger API provides client access to the 1Source Ledger. You can find out more about 1Source at [https://equilend.com](https://equilend.com).  This specification is work in progress. The design is meant to model the securities lending life cycle in as clean a way as possible while being robust enough to easily translate to ISLA CDM workflows and data model.  API specification is the intellectual property of EquiLend LLC and should not be copied or disseminated in any way. 
 *
 * OpenAPI spec version: 1.1.0
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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.io.Serializable;
/**
 * InternalReference
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-08-19T20:45:27.999725349Z[GMT]")

public class InternalReference implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("brokerCd")
  private String brokerCd = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("internalRefId")
  private String internalRefId = null;

  public InternalReference brokerCd(String brokerCd) {
    this.brokerCd = brokerCd;
    return this;
  }

   /**
   * Get brokerCd
   * @return brokerCd
  **/
  @Schema(description = "")
  public String getBrokerCd() {
    return brokerCd;
  }

  public void setBrokerCd(String brokerCd) {
    this.brokerCd = brokerCd;
  }

  public InternalReference accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public InternalReference internalRefId(String internalRefId) {
    this.internalRefId = internalRefId;
    return this;
  }

   /**
   * Get internalRefId
   * @return internalRefId
  **/
  @Schema(required = true, description = "")
  public String getInternalRefId() {
    return internalRefId;
  }

  public void setInternalRefId(String internalRefId) {
    this.internalRefId = internalRefId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalReference internalReference = (InternalReference) o;
    return Objects.equals(this.brokerCd, internalReference.brokerCd) &&
        Objects.equals(this.accountId, internalReference.accountId) &&
        Objects.equals(this.internalRefId, internalReference.internalRefId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokerCd, accountId, internalRefId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalReference {\n");
    
    sb.append("    brokerCd: ").append(toIndentedString(brokerCd)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    internalRefId: ").append(toIndentedString(internalRefId)).append("\n");
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
