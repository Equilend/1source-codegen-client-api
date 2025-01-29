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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * BuyinComplete
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-29T18:00:54.218085062Z[GMT]")

public class BuyinComplete implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("buyinCompleteId")
  private String buyinCompleteId = null;

  @SerializedName("loanId")
  private String loanId = null;

  @SerializedName("status")
  private BuyinCompleteStatus status = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("buyinDate")
  private LocalDate buyinDate = null;

  @SerializedName("price")
  private Price price = null;

  @SerializedName("lastUpdateDatetime")
  private OffsetDateTime lastUpdateDatetime = null;

  public BuyinComplete buyinCompleteId(String buyinCompleteId) {
    this.buyinCompleteId = buyinCompleteId;
    return this;
  }

   /**
   * Get buyinCompleteId
   * @return buyinCompleteId
  **/
  @Schema(required = true, description = "")
  public String getBuyinCompleteId() {
    return buyinCompleteId;
  }

  public void setBuyinCompleteId(String buyinCompleteId) {
    this.buyinCompleteId = buyinCompleteId;
  }

  public BuyinComplete loanId(String loanId) {
    this.loanId = loanId;
    return this;
  }

   /**
   * Get loanId
   * @return loanId
  **/
  @Schema(required = true, description = "")
  public String getLoanId() {
    return loanId;
  }

  public void setLoanId(String loanId) {
    this.loanId = loanId;
  }

  public BuyinComplete status(BuyinCompleteStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public BuyinCompleteStatus getStatus() {
    return status;
  }

  public void setStatus(BuyinCompleteStatus status) {
    this.status = status;
  }

  public BuyinComplete quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @Schema(required = true, description = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public BuyinComplete buyinDate(LocalDate buyinDate) {
    this.buyinDate = buyinDate;
    return this;
  }

   /**
   * Get buyinDate
   * @return buyinDate
  **/
  @Schema(description = "")
  public LocalDate getBuyinDate() {
    return buyinDate;
  }

  public void setBuyinDate(LocalDate buyinDate) {
    this.buyinDate = buyinDate;
  }

  public BuyinComplete price(Price price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(description = "")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public BuyinComplete lastUpdateDatetime(OffsetDateTime lastUpdateDatetime) {
    this.lastUpdateDatetime = lastUpdateDatetime;
    return this;
  }

   /**
   * Get lastUpdateDatetime
   * @return lastUpdateDatetime
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getLastUpdateDatetime() {
    return lastUpdateDatetime;
  }

  public void setLastUpdateDatetime(OffsetDateTime lastUpdateDatetime) {
    this.lastUpdateDatetime = lastUpdateDatetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyinComplete buyinComplete = (BuyinComplete) o;
    return Objects.equals(this.buyinCompleteId, buyinComplete.buyinCompleteId) &&
        Objects.equals(this.loanId, buyinComplete.loanId) &&
        Objects.equals(this.status, buyinComplete.status) &&
        Objects.equals(this.quantity, buyinComplete.quantity) &&
        Objects.equals(this.buyinDate, buyinComplete.buyinDate) &&
        Objects.equals(this.price, buyinComplete.price) &&
        Objects.equals(this.lastUpdateDatetime, buyinComplete.lastUpdateDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyinCompleteId, loanId, status, quantity, buyinDate, price, lastUpdateDatetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyinComplete {\n");
    
    sb.append("    buyinCompleteId: ").append(toIndentedString(buyinCompleteId)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    buyinDate: ").append(toIndentedString(buyinDate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    lastUpdateDatetime: ").append(toIndentedString(lastUpdateDatetime)).append("\n");
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
