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
import java.time.LocalDate;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * FloatingRateDef
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-05T14:31:33.159170711Z[GMT]")

public class FloatingRateDef implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("benchmark")
  private BenchmarkCd benchmark = null;

  @SerializedName("baseRate")
  private Double baseRate = null;

  @SerializedName("spread")
  private Double spread = null;

  @SerializedName("effectiveRate")
  private Double effectiveRate = null;

  @SerializedName("isAutoRerate")
  private Boolean isAutoRerate = null;

  @SerializedName("effectiveDate")
  private LocalDate effectiveDate = null;

  @SerializedName("cutoffTime")
  private String cutoffTime = null;

  public FloatingRateDef benchmark(BenchmarkCd benchmark) {
    this.benchmark = benchmark;
    return this;
  }

   /**
   * Get benchmark
   * @return benchmark
  **/
  @Schema(description = "")
  public BenchmarkCd getBenchmark() {
    return benchmark;
  }

  public void setBenchmark(BenchmarkCd benchmark) {
    this.benchmark = benchmark;
  }

  public FloatingRateDef baseRate(Double baseRate) {
    this.baseRate = baseRate;
    return this;
  }

   /**
   * Get baseRate
   * @return baseRate
  **/
  @Schema(required = true, description = "")
  public Double getBaseRate() {
    return baseRate;
  }

  public void setBaseRate(Double baseRate) {
    this.baseRate = baseRate;
  }

  public FloatingRateDef spread(Double spread) {
    this.spread = spread;
    return this;
  }

   /**
   * Get spread
   * @return spread
  **/
  @Schema(description = "")
  public Double getSpread() {
    return spread;
  }

  public void setSpread(Double spread) {
    this.spread = spread;
  }

  public FloatingRateDef effectiveRate(Double effectiveRate) {
    this.effectiveRate = effectiveRate;
    return this;
  }

   /**
   * Get effectiveRate
   * @return effectiveRate
  **/
  @Schema(description = "")
  public Double getEffectiveRate() {
    return effectiveRate;
  }

  public void setEffectiveRate(Double effectiveRate) {
    this.effectiveRate = effectiveRate;
  }

  public FloatingRateDef isAutoRerate(Boolean isAutoRerate) {
    this.isAutoRerate = isAutoRerate;
    return this;
  }

   /**
   * Get isAutoRerate
   * @return isAutoRerate
  **/
  @Schema(description = "")
  public Boolean isIsAutoRerate() {
    return isAutoRerate;
  }

  public void setIsAutoRerate(Boolean isAutoRerate) {
    this.isAutoRerate = isAutoRerate;
  }

  public FloatingRateDef effectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @Schema(description = "")
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public FloatingRateDef cutoffTime(String cutoffTime) {
    this.cutoffTime = cutoffTime;
    return this;
  }

   /**
   * Get cutoffTime
   * @return cutoffTime
  **/
  @Schema(description = "")
  public String getCutoffTime() {
    return cutoffTime;
  }

  public void setCutoffTime(String cutoffTime) {
    this.cutoffTime = cutoffTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FloatingRateDef floatingRateDef = (FloatingRateDef) o;
    return Objects.equals(this.benchmark, floatingRateDef.benchmark) &&
        Objects.equals(this.baseRate, floatingRateDef.baseRate) &&
        Objects.equals(this.spread, floatingRateDef.spread) &&
        Objects.equals(this.effectiveRate, floatingRateDef.effectiveRate) &&
        Objects.equals(this.isAutoRerate, floatingRateDef.isAutoRerate) &&
        Objects.equals(this.effectiveDate, floatingRateDef.effectiveDate) &&
        Objects.equals(this.cutoffTime, floatingRateDef.cutoffTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmark, baseRate, spread, effectiveRate, isAutoRerate, effectiveDate, cutoffTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FloatingRateDef {\n");
    
    sb.append("    benchmark: ").append(toIndentedString(benchmark)).append("\n");
    sb.append("    baseRate: ").append(toIndentedString(baseRate)).append("\n");
    sb.append("    spread: ").append(toIndentedString(spread)).append("\n");
    sb.append("    effectiveRate: ").append(toIndentedString(effectiveRate)).append("\n");
    sb.append("    isAutoRerate: ").append(toIndentedString(isAutoRerate)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    cutoffTime: ").append(toIndentedString(cutoffTime)).append("\n");
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
