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
 * TransactingParty
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-29T18:55:08.725971332Z[GMT]")

public class TransactingParty implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("partyRole")
  private PartyRole partyRole = null;

  @SerializedName("party")
  private Party party = null;

  @SerializedName("internalReference")
  private String internalReference = null;

  public TransactingParty partyRole(PartyRole partyRole) {
    this.partyRole = partyRole;
    return this;
  }

   /**
   * Get partyRole
   * @return partyRole
  **/
  @Schema(required = true, description = "")
  public PartyRole getPartyRole() {
    return partyRole;
  }

  public void setPartyRole(PartyRole partyRole) {
    this.partyRole = partyRole;
  }

  public TransactingParty party(Party party) {
    this.party = party;
    return this;
  }

   /**
   * Get party
   * @return party
  **/
  @Schema(required = true, description = "")
  public Party getParty() {
    return party;
  }

  public void setParty(Party party) {
    this.party = party;
  }

  public TransactingParty internalReference(String internalReference) {
    this.internalReference = internalReference;
    return this;
  }

   /**
   * Get internalReference
   * @return internalReference
  **/
  @Schema(required = true, description = "")
  public String getInternalReference() {
    return internalReference;
  }

  public void setInternalReference(String internalReference) {
    this.internalReference = internalReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactingParty transactingParty = (TransactingParty) o;
    return Objects.equals(this.partyRole, transactingParty.partyRole) &&
        Objects.equals(this.party, transactingParty.party) &&
        Objects.equals(this.internalReference, transactingParty.internalReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyRole, party, internalReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactingParty {\n");
    
    sb.append("    partyRole: ").append(toIndentedString(partyRole)).append("\n");
    sb.append("    party: ").append(toIndentedString(party)).append("\n");
    sb.append("    internalReference: ").append(toIndentedString(internalReference)).append("\n");
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
