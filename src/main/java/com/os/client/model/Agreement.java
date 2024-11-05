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

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Agreement
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-05T14:31:33.159170711Z[GMT]")

public class Agreement implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("agreementId")
  private String agreementId = null;

  @SerializedName("lastUpdateDatetime")
  private OffsetDateTime lastUpdateDatetime = null;

  @SerializedName("trade")
  private VenueTradeAgreement trade = null;

  public Agreement agreementId(String agreementId) {
    this.agreementId = agreementId;
    return this;
  }

   /**
   * Get agreementId
   * @return agreementId
  **/
  @Schema(required = true, description = "")
  public String getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }

  public Agreement lastUpdateDatetime(OffsetDateTime lastUpdateDatetime) {
    this.lastUpdateDatetime = lastUpdateDatetime;
    return this;
  }

   /**
   * Get lastUpdateDatetime
   * @return lastUpdateDatetime
  **/
  @Schema(description = "")
  public OffsetDateTime getLastUpdateDatetime() {
    return lastUpdateDatetime;
  }

  public void setLastUpdateDatetime(OffsetDateTime lastUpdateDatetime) {
    this.lastUpdateDatetime = lastUpdateDatetime;
  }

  public Agreement trade(VenueTradeAgreement trade) {
    this.trade = trade;
    return this;
  }

   /**
   * Get trade
   * @return trade
  **/
  @Schema(description = "")
  public VenueTradeAgreement getTrade() {
    return trade;
  }

  public void setTrade(VenueTradeAgreement trade) {
    this.trade = trade;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agreement agreement = (Agreement) o;
    return Objects.equals(this.agreementId, agreement.agreementId) &&
        Objects.equals(this.lastUpdateDatetime, agreement.lastUpdateDatetime) &&
        Objects.equals(this.trade, agreement.trade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId, lastUpdateDatetime, trade);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agreement {\n");
    
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    lastUpdateDatetime: ").append(toIndentedString(lastUpdateDatetime)).append("\n");
    sb.append("    trade: ").append(toIndentedString(trade)).append("\n");
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
