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
import com.os.client.model.DelegationAuthorization;
import com.os.client.model.Party;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.io.Serializable;
/**
 * DelegationProposal
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-08-19T20:01:09.159040928Z[GMT]")

public class DelegationProposal implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("delegationParty")
  private Party delegationParty = null;

  @SerializedName("counterparty")
  private Party counterparty = null;

  @SerializedName("authorization")
  private DelegationAuthorization authorization = null;

  public DelegationProposal delegationParty(Party delegationParty) {
    this.delegationParty = delegationParty;
    return this;
  }

   /**
   * Get delegationParty
   * @return delegationParty
  **/
  @Schema(required = true, description = "")
  public Party getDelegationParty() {
    return delegationParty;
  }

  public void setDelegationParty(Party delegationParty) {
    this.delegationParty = delegationParty;
  }

  public DelegationProposal counterparty(Party counterparty) {
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @Schema(required = true, description = "")
  public Party getCounterparty() {
    return counterparty;
  }

  public void setCounterparty(Party counterparty) {
    this.counterparty = counterparty;
  }

  public DelegationProposal authorization(DelegationAuthorization authorization) {
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @Schema(description = "")
  public DelegationAuthorization getAuthorization() {
    return authorization;
  }

  public void setAuthorization(DelegationAuthorization authorization) {
    this.authorization = authorization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelegationProposal delegationProposal = (DelegationProposal) o;
    return Objects.equals(this.delegationParty, delegationProposal.delegationParty) &&
        Objects.equals(this.counterparty, delegationProposal.counterparty) &&
        Objects.equals(this.authorization, delegationProposal.authorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delegationParty, counterparty, authorization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelegationProposal {\n");
    
    sb.append("    delegationParty: ").append(toIndentedString(delegationParty)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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
