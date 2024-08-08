/*
 * 1Source Ledger API
 * 1Source Ledger API provides client access to the 1Source Ledger. You can find out more about 1Source at [https://equilend.com](https://equilend.com).  This specification is work in progress. The design is meant to model the securities lending life cycle in as clean a way as possible while being robust enough to easily translate to ISLA CDM workflows and data model.  API specification is the intellectual property of EquiLend LLC and should not be copied or disseminated in any way. 
 *
 * OpenAPI spec version: 1.0.5
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
import com.os.client.model.Price;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.LocalDate;
import java.io.Serializable;
/**
 * BuyinCompleteRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-07-02T14:22:48.657322733Z[GMT]")

public class BuyinCompleteRequest implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("buyinDate")
  private LocalDate buyinDate = null;

  @SerializedName("price")
  private Price price = null;

  public BuyinCompleteRequest quantity(Integer quantity) {
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

  public BuyinCompleteRequest buyinDate(LocalDate buyinDate) {
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

  public BuyinCompleteRequest price(Price price) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyinCompleteRequest buyinCompleteRequest = (BuyinCompleteRequest) o;
    return Objects.equals(this.quantity, buyinCompleteRequest.quantity) &&
        Objects.equals(this.buyinDate, buyinCompleteRequest.buyinDate) &&
        Objects.equals(this.price, buyinCompleteRequest.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, buyinDate, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyinCompleteRequest {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    buyinDate: ").append(toIndentedString(buyinDate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
