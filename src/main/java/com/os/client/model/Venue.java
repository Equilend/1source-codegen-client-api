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
 * ONPLATFORM venues are third-party services that generate loans, returns, recalls, rerates, or perform loan modifications on a clients behalf. If the type is ONPLATFORM, a party with a value ID and LEI is required. If the loan is agreed OFFPLATFORM (email, chat, phone), party does not apply.
 */
@Schema(description = "ONPLATFORM venues are third-party services that generate loans, returns, recalls, rerates, or perform loan modifications on a clients behalf. If the type is ONPLATFORM, a party with a value ID and LEI is required. If the loan is agreed OFFPLATFORM (email, chat, phone), party does not apply.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-19T20:22:04.606499523Z[GMT]")

public class Venue implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("party")
  private Party party = null;

  @SerializedName("type")
  private VenueType type = null;

  @SerializedName("venueRefKey")
  private String venueRefKey = null;

  @SerializedName("transactionDateTime")
  private OffsetDateTime transactionDateTime = null;

  public Venue party(Party party) {
    this.party = party;
    return this;
  }

   /**
   * Get party
   * @return party
  **/
  @Schema(description = "")
  public Party getParty() {
    return party;
  }

  public void setParty(Party party) {
    this.party = party;
  }

  public Venue type(VenueType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public VenueType getType() {
    return type;
  }

  public void setType(VenueType type) {
    this.type = type;
  }

  public Venue venueRefKey(String venueRefKey) {
    this.venueRefKey = venueRefKey;
    return this;
  }

   /**
   * Similar to partyId and gliefLei, required if type is ONPLATFORM
   * @return venueRefKey
  **/
  @Schema(description = "Similar to partyId and gliefLei, required if type is ONPLATFORM")
  public String getVenueRefKey() {
    return venueRefKey;
  }

  public void setVenueRefKey(String venueRefKey) {
    this.venueRefKey = venueRefKey;
  }

  public Venue transactionDateTime(OffsetDateTime transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
    return this;
  }

   /**
   * Get transactionDateTime
   * @return transactionDateTime
  **/
  @Schema(description = "")
  public OffsetDateTime getTransactionDateTime() {
    return transactionDateTime;
  }

  public void setTransactionDateTime(OffsetDateTime transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Venue venue = (Venue) o;
    return Objects.equals(this.party, venue.party) &&
        Objects.equals(this.type, venue.type) &&
        Objects.equals(this.venueRefKey, venue.venueRefKey) &&
        Objects.equals(this.transactionDateTime, venue.transactionDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(party, type, venueRefKey, transactionDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Venue {\n");
    
    sb.append("    party: ").append(toIndentedString(party)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    venueRefKey: ").append(toIndentedString(venueRefKey)).append("\n");
    sb.append("    transactionDateTime: ").append(toIndentedString(transactionDateTime)).append("\n");
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
