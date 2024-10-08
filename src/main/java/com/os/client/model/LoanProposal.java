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
import com.os.client.model.PartySettlementInstruction;
import com.os.client.model.TradeAgreement;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * LoanProposal
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-25T16:59:29.530075741Z[GMT]")

public class LoanProposal implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("trade")
  private TradeAgreement trade = null;

  @SerializedName("settlement")
  private List<PartySettlementInstruction> settlement = null;

  public LoanProposal trade(TradeAgreement trade) {
    this.trade = trade;
    return this;
  }

   /**
   * Get trade
   * @return trade
  **/
  @Schema(description = "")
  public TradeAgreement getTrade() {
    return trade;
  }

  public void setTrade(TradeAgreement trade) {
    this.trade = trade;
  }

  public LoanProposal settlement(List<PartySettlementInstruction> settlement) {
    this.settlement = settlement;
    return this;
  }

  public LoanProposal addSettlementItem(PartySettlementInstruction settlementItem) {
    if (this.settlement == null) {
      this.settlement = new ArrayList<>();
    }
    this.settlement.add(settlementItem);
    return this;
  }

   /**
   * Get settlement
   * @return settlement
  **/
  @Schema(description = "")
  public List<PartySettlementInstruction> getSettlement() {
    return settlement;
  }

  public void setSettlement(List<PartySettlementInstruction> settlement) {
    this.settlement = settlement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanProposal loanProposal = (LoanProposal) o;
    return Objects.equals(this.trade, loanProposal.trade) &&
        Objects.equals(this.settlement, loanProposal.settlement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trade, settlement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanProposal {\n");
    
    sb.append("    trade: ").append(toIndentedString(trade)).append("\n");
    sb.append("    settlement: ").append(toIndentedString(settlement)).append("\n");
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
