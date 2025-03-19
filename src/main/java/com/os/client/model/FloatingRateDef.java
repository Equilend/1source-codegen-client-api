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
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Floating Rates are defined as a spread off of a benchmark. When proposing a loan or rerate, the benchmark, spread, and effective date are required. Base rate is provided by 1Source if auto rerate is true, otherwise base rate is also required.
 */
@Schema(description = "Floating Rates are defined as a spread off of a benchmark. When proposing a loan or rerate, the benchmark, spread, and effective date are required. Base rate is provided by 1Source if auto rerate is true, otherwise base rate is also required.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-19T18:59:50.954293492Z[GMT]")

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

  @SerializedName("rerateCutoffTime")
  private String rerateCutoffTime = null;

  public FloatingRateDef benchmark(BenchmarkCd benchmark) {
    this.benchmark = benchmark;
    return this;
  }

   /**
   * Get benchmark
   * @return benchmark
  **/
  @Schema(required = true, description = "")
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
  @Schema(description = "")
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
  @Schema(required = true, description = "")
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
  @Schema(required = true, description = "")
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public FloatingRateDef rerateCutoffTime(String rerateCutoffTime) {
    this.rerateCutoffTime = rerateCutoffTime;
    return this;
  }

   /**
   * Ignored on rerate proposals
   * @return rerateCutoffTime
  **/
  @Schema(description = "Ignored on rerate proposals")
  public String getRerateCutoffTime() {
    return rerateCutoffTime;
  }

  public void setRerateCutoffTime(String rerateCutoffTime) {
    this.rerateCutoffTime = rerateCutoffTime;
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
        Objects.equals(this.rerateCutoffTime, floatingRateDef.rerateCutoffTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmark, baseRate, spread, effectiveRate, isAutoRerate, effectiveDate, rerateCutoffTime);
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
    sb.append("    rerateCutoffTime: ").append(toIndentedString(rerateCutoffTime)).append("\n");
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
