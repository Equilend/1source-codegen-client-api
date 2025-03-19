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
 * Rounding rule and rounding mode are required when the Lender is proposing or approving a loan
 */
@Schema(description = "Rounding rule and rounding mode are required when the Lender is proposing or approving a loan")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-19T18:59:50.954293492Z[GMT]")

public class Collateral implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("contractPrice")
  private Double contractPrice = null;

  @SerializedName("contractValue")
  private Double contractValue = null;

  @SerializedName("collateralValue")
  private Double collateralValue = null;

  @SerializedName("collateralCurrency")
  private CurrencyCd collateralCurrency = null;

  @SerializedName("collateralType")
  private CollateralType collateralType = null;

  @SerializedName("collateralDescriptionCode")
  private CollateralDescription collateralDescriptionCode = null;

  @SerializedName("collateralMargin")
  private Double collateralMargin = null;

  @SerializedName("roundingRule")
  private Integer roundingRule = null;

  @SerializedName("roundingMode")
  private RoundingMode roundingMode = null;

  public Collateral contractPrice(Double contractPrice) {
    this.contractPrice = contractPrice;
    return this;
  }

   /**
   * Get contractPrice
   * @return contractPrice
  **/
  @Schema(required = true, description = "")
  public Double getContractPrice() {
    return contractPrice;
  }

  public void setContractPrice(Double contractPrice) {
    this.contractPrice = contractPrice;
  }

  public Collateral contractValue(Double contractValue) {
    this.contractValue = contractValue;
    return this;
  }

   /**
   * Get contractValue
   * @return contractValue
  **/
  @Schema(description = "")
  public Double getContractValue() {
    return contractValue;
  }

  public void setContractValue(Double contractValue) {
    this.contractValue = contractValue;
  }

  public Collateral collateralValue(Double collateralValue) {
    this.collateralValue = collateralValue;
    return this;
  }

   /**
   * Get collateralValue
   * @return collateralValue
  **/
  @Schema(required = true, description = "")
  public Double getCollateralValue() {
    return collateralValue;
  }

  public void setCollateralValue(Double collateralValue) {
    this.collateralValue = collateralValue;
  }

  public Collateral collateralCurrency(CurrencyCd collateralCurrency) {
    this.collateralCurrency = collateralCurrency;
    return this;
  }

   /**
   * Get collateralCurrency
   * @return collateralCurrency
  **/
  @Schema(required = true, description = "")
  public CurrencyCd getCollateralCurrency() {
    return collateralCurrency;
  }

  public void setCollateralCurrency(CurrencyCd collateralCurrency) {
    this.collateralCurrency = collateralCurrency;
  }

  public Collateral collateralType(CollateralType collateralType) {
    this.collateralType = collateralType;
    return this;
  }

   /**
   * Get collateralType
   * @return collateralType
  **/
  @Schema(required = true, description = "")
  public CollateralType getCollateralType() {
    return collateralType;
  }

  public void setCollateralType(CollateralType collateralType) {
    this.collateralType = collateralType;
  }

  public Collateral collateralDescriptionCode(CollateralDescription collateralDescriptionCode) {
    this.collateralDescriptionCode = collateralDescriptionCode;
    return this;
  }

   /**
   * Get collateralDescriptionCode
   * @return collateralDescriptionCode
  **/
  @Schema(description = "")
  public CollateralDescription getCollateralDescriptionCode() {
    return collateralDescriptionCode;
  }

  public void setCollateralDescriptionCode(CollateralDescription collateralDescriptionCode) {
    this.collateralDescriptionCode = collateralDescriptionCode;
  }

  public Collateral collateralMargin(Double collateralMargin) {
    this.collateralMargin = collateralMargin;
    return this;
  }

   /**
   * Get collateralMargin
   * @return collateralMargin
  **/
  @Schema(required = true, description = "")
  public Double getCollateralMargin() {
    return collateralMargin;
  }

  public void setCollateralMargin(Double collateralMargin) {
    this.collateralMargin = collateralMargin;
  }

  public Collateral roundingRule(Integer roundingRule) {
    this.roundingRule = roundingRule;
    return this;
  }

   /**
   * Get roundingRule
   * @return roundingRule
  **/
  @Schema(description = "")
  public Integer getRoundingRule() {
    return roundingRule;
  }

  public void setRoundingRule(Integer roundingRule) {
    this.roundingRule = roundingRule;
  }

  public Collateral roundingMode(RoundingMode roundingMode) {
    this.roundingMode = roundingMode;
    return this;
  }

   /**
   * Get roundingMode
   * @return roundingMode
  **/
  @Schema(description = "")
  public RoundingMode getRoundingMode() {
    return roundingMode;
  }

  public void setRoundingMode(RoundingMode roundingMode) {
    this.roundingMode = roundingMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Collateral collateral = (Collateral) o;
    return Objects.equals(this.contractPrice, collateral.contractPrice) &&
        Objects.equals(this.contractValue, collateral.contractValue) &&
        Objects.equals(this.collateralValue, collateral.collateralValue) &&
        Objects.equals(this.collateralCurrency, collateral.collateralCurrency) &&
        Objects.equals(this.collateralType, collateral.collateralType) &&
        Objects.equals(this.collateralDescriptionCode, collateral.collateralDescriptionCode) &&
        Objects.equals(this.collateralMargin, collateral.collateralMargin) &&
        Objects.equals(this.roundingRule, collateral.roundingRule) &&
        Objects.equals(this.roundingMode, collateral.roundingMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractPrice, contractValue, collateralValue, collateralCurrency, collateralType, collateralDescriptionCode, collateralMargin, roundingRule, roundingMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Collateral {\n");
    
    sb.append("    contractPrice: ").append(toIndentedString(contractPrice)).append("\n");
    sb.append("    contractValue: ").append(toIndentedString(contractValue)).append("\n");
    sb.append("    collateralValue: ").append(toIndentedString(collateralValue)).append("\n");
    sb.append("    collateralCurrency: ").append(toIndentedString(collateralCurrency)).append("\n");
    sb.append("    collateralType: ").append(toIndentedString(collateralType)).append("\n");
    sb.append("    collateralDescriptionCode: ").append(toIndentedString(collateralDescriptionCode)).append("\n");
    sb.append("    collateralMargin: ").append(toIndentedString(collateralMargin)).append("\n");
    sb.append("    roundingRule: ").append(toIndentedString(roundingRule)).append("\n");
    sb.append("    roundingMode: ").append(toIndentedString(roundingMode)).append("\n");
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
