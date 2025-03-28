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
 * Delegation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-28T19:09:31.413170521Z[GMT]")

public class Delegation implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("delegationId")
  private String delegationId = null;

  @SerializedName("delegationStatus")
  private DelegationStatus delegationStatus = null;

  @SerializedName("delegationParty")
  private Party delegationParty = null;

  @SerializedName("parties")
  private List<Party> parties = null;

  @SerializedName("authorization")
  private DelegationAuthorizationType authorization = null;

  public Delegation delegationId(String delegationId) {
    this.delegationId = delegationId;
    return this;
  }

   /**
   * Get delegationId
   * @return delegationId
  **/
  @Schema(description = "")
  public String getDelegationId() {
    return delegationId;
  }

  public void setDelegationId(String delegationId) {
    this.delegationId = delegationId;
  }

  public Delegation delegationStatus(DelegationStatus delegationStatus) {
    this.delegationStatus = delegationStatus;
    return this;
  }

   /**
   * Get delegationStatus
   * @return delegationStatus
  **/
  @Schema(description = "")
  public DelegationStatus getDelegationStatus() {
    return delegationStatus;
  }

  public void setDelegationStatus(DelegationStatus delegationStatus) {
    this.delegationStatus = delegationStatus;
  }

  public Delegation delegationParty(Party delegationParty) {
    this.delegationParty = delegationParty;
    return this;
  }

   /**
   * Get delegationParty
   * @return delegationParty
  **/
  @Schema(description = "")
  public Party getDelegationParty() {
    return delegationParty;
  }

  public void setDelegationParty(Party delegationParty) {
    this.delegationParty = delegationParty;
  }

  public Delegation parties(List<Party> parties) {
    this.parties = parties;
    return this;
  }

  public Delegation addPartiesItem(Party partiesItem) {
    if (this.parties == null) {
      this.parties = new ArrayList<>();
    }
    this.parties.add(partiesItem);
    return this;
  }

   /**
   * Get parties
   * @return parties
  **/
  @Schema(description = "")
  public List<Party> getParties() {
    return parties;
  }

  public void setParties(List<Party> parties) {
    this.parties = parties;
  }

  public Delegation authorization(DelegationAuthorizationType authorization) {
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @Schema(description = "")
  public DelegationAuthorizationType getAuthorization() {
    return authorization;
  }

  public void setAuthorization(DelegationAuthorizationType authorization) {
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
    Delegation delegation = (Delegation) o;
    return Objects.equals(this.delegationId, delegation.delegationId) &&
        Objects.equals(this.delegationStatus, delegation.delegationStatus) &&
        Objects.equals(this.delegationParty, delegation.delegationParty) &&
        Objects.equals(this.parties, delegation.parties) &&
        Objects.equals(this.authorization, delegation.authorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delegationId, delegationStatus, delegationParty, parties, authorization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Delegation {\n");
    
    sb.append("    delegationId: ").append(toIndentedString(delegationId)).append("\n");
    sb.append("    delegationStatus: ").append(toIndentedString(delegationStatus)).append("\n");
    sb.append("    delegationParty: ").append(toIndentedString(delegationParty)).append("\n");
    sb.append("    parties: ").append(toIndentedString(parties)).append("\n");
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
