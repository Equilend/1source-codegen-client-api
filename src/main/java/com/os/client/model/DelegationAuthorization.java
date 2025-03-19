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
 * DelegationAuthorization
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-19T20:22:04.606499523Z[GMT]")

public class DelegationAuthorization implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("authorizationType")
  private DelegationAuthorizationType authorizationType = null;

  public DelegationAuthorization authorizationType(DelegationAuthorizationType authorizationType) {
    this.authorizationType = authorizationType;
    return this;
  }

   /**
   * Get authorizationType
   * @return authorizationType
  **/
  @Schema(required = true, description = "")
  public DelegationAuthorizationType getAuthorizationType() {
    return authorizationType;
  }

  public void setAuthorizationType(DelegationAuthorizationType authorizationType) {
    this.authorizationType = authorizationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelegationAuthorization delegationAuthorization = (DelegationAuthorization) o;
    return Objects.equals(this.authorizationType, delegationAuthorization.authorizationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelegationAuthorization {\n");
    
    sb.append("    authorizationType: ").append(toIndentedString(authorizationType)).append("\n");
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
