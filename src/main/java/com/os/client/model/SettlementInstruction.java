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
 * SettlementInstruction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-05T14:31:33.159170711Z[GMT]")

public class SettlementInstruction implements Serializable, OneOfSettlementInstruction {
  private static final long serialVersionUID = 1L;
  @SerializedName("settlementBic")
  private String settlementBic = null;

  @SerializedName("localAgentBic")
  private String localAgentBic = null;

  @SerializedName("localAgentName")
  private String localAgentName = null;

  @SerializedName("localAgentAcct")
  private String localAgentAcct = null;

  @SerializedName("dtcParticipantNumber")
  private String dtcParticipantNumber = null;

  @SerializedName("cdsCustomerUnitId")
  private String cdsCustomerUnitId = null;

  @SerializedName("custodianName")
  private String custodianName = null;

  @SerializedName("custodianBic")
  private String custodianBic = null;

  @SerializedName("custodianAcct")
  private String custodianAcct = null;

  public SettlementInstruction settlementBic(String settlementBic) {
    this.settlementBic = settlementBic;
    return this;
  }

   /**
   * Business Identifier Code (BIC) used to identify Place of Settlement (PSET)
   * @return settlementBic
  **/
  @Schema(required = true, description = "Business Identifier Code (BIC) used to identify Place of Settlement (PSET)")
  public String getSettlementBic() {
    return settlementBic;
  }

  public void setSettlementBic(String settlementBic) {
    this.settlementBic = settlementBic;
  }

  public SettlementInstruction localAgentBic(String localAgentBic) {
    this.localAgentBic = localAgentBic;
    return this;
  }

   /**
   * BIC used to identify local agent that will interact with PSET
   * @return localAgentBic
  **/
  @Schema(description = "BIC used to identify local agent that will interact with PSET")
  public String getLocalAgentBic() {
    return localAgentBic;
  }

  public void setLocalAgentBic(String localAgentBic) {
    this.localAgentBic = localAgentBic;
  }

  public SettlementInstruction localAgentName(String localAgentName) {
    this.localAgentName = localAgentName;
    return this;
  }

   /**
   * Name of local agent that will interact with PSET
   * @return localAgentName
  **/
  @Schema(description = "Name of local agent that will interact with PSET")
  public String getLocalAgentName() {
    return localAgentName;
  }

  public void setLocalAgentName(String localAgentName) {
    this.localAgentName = localAgentName;
  }

  public SettlementInstruction localAgentAcct(String localAgentAcct) {
    this.localAgentAcct = localAgentAcct;
    return this;
  }

   /**
   * Account within local agent that will interact with PSET
   * @return localAgentAcct
  **/
  @Schema(description = "Account within local agent that will interact with PSET")
  public String getLocalAgentAcct() {
    return localAgentAcct;
  }

  public void setLocalAgentAcct(String localAgentAcct) {
    this.localAgentAcct = localAgentAcct;
  }

  public SettlementInstruction dtcParticipantNumber(String dtcParticipantNumber) {
    this.dtcParticipantNumber = dtcParticipantNumber;
    return this;
  }

   /**
   * Get dtcParticipantNumber
   * @return dtcParticipantNumber
  **/
  @Schema(required = true, description = "")
  public String getDtcParticipantNumber() {
    return dtcParticipantNumber;
  }

  public void setDtcParticipantNumber(String dtcParticipantNumber) {
    this.dtcParticipantNumber = dtcParticipantNumber;
  }

  public SettlementInstruction cdsCustomerUnitId(String cdsCustomerUnitId) {
    this.cdsCustomerUnitId = cdsCustomerUnitId;
    return this;
  }

   /**
   * Get cdsCustomerUnitId
   * @return cdsCustomerUnitId
  **/
  @Schema(description = "")
  public String getCdsCustomerUnitId() {
    return cdsCustomerUnitId;
  }

  public void setCdsCustomerUnitId(String cdsCustomerUnitId) {
    this.cdsCustomerUnitId = cdsCustomerUnitId;
  }

  public SettlementInstruction custodianName(String custodianName) {
    this.custodianName = custodianName;
    return this;
  }

   /**
   * Custodian Bank Name
   * @return custodianName
  **/
  @Schema(description = "Custodian Bank Name")
  public String getCustodianName() {
    return custodianName;
  }

  public void setCustodianName(String custodianName) {
    this.custodianName = custodianName;
  }

  public SettlementInstruction custodianBic(String custodianBic) {
    this.custodianBic = custodianBic;
    return this;
  }

   /**
   * Custodian Bank BIC
   * @return custodianBic
  **/
  @Schema(description = "Custodian Bank BIC")
  public String getCustodianBic() {
    return custodianBic;
  }

  public void setCustodianBic(String custodianBic) {
    this.custodianBic = custodianBic;
  }

  public SettlementInstruction custodianAcct(String custodianAcct) {
    this.custodianAcct = custodianAcct;
    return this;
  }

   /**
   * Custodian Bank Account
   * @return custodianAcct
  **/
  @Schema(description = "Custodian Bank Account")
  public String getCustodianAcct() {
    return custodianAcct;
  }

  public void setCustodianAcct(String custodianAcct) {
    this.custodianAcct = custodianAcct;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementInstruction settlementInstruction = (SettlementInstruction) o;
    return Objects.equals(this.settlementBic, settlementInstruction.settlementBic) &&
        Objects.equals(this.localAgentBic, settlementInstruction.localAgentBic) &&
        Objects.equals(this.localAgentName, settlementInstruction.localAgentName) &&
        Objects.equals(this.localAgentAcct, settlementInstruction.localAgentAcct) &&
        Objects.equals(this.dtcParticipantNumber, settlementInstruction.dtcParticipantNumber) &&
        Objects.equals(this.cdsCustomerUnitId, settlementInstruction.cdsCustomerUnitId) &&
        Objects.equals(this.custodianName, settlementInstruction.custodianName) &&
        Objects.equals(this.custodianBic, settlementInstruction.custodianBic) &&
        Objects.equals(this.custodianAcct, settlementInstruction.custodianAcct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlementBic, localAgentBic, localAgentName, localAgentAcct, dtcParticipantNumber, cdsCustomerUnitId, custodianName, custodianBic, custodianAcct);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementInstruction {\n");
    
    sb.append("    settlementBic: ").append(toIndentedString(settlementBic)).append("\n");
    sb.append("    localAgentBic: ").append(toIndentedString(localAgentBic)).append("\n");
    sb.append("    localAgentName: ").append(toIndentedString(localAgentName)).append("\n");
    sb.append("    localAgentAcct: ").append(toIndentedString(localAgentAcct)).append("\n");
    sb.append("    dtcParticipantNumber: ").append(toIndentedString(dtcParticipantNumber)).append("\n");
    sb.append("    cdsCustomerUnitId: ").append(toIndentedString(cdsCustomerUnitId)).append("\n");
    sb.append("    custodianName: ").append(toIndentedString(custodianName)).append("\n");
    sb.append("    custodianBic: ").append(toIndentedString(custodianBic)).append("\n");
    sb.append("    custodianAcct: ").append(toIndentedString(custodianAcct)).append("\n");
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
