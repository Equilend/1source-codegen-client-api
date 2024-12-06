/*
 * 1Source Ledger API
 * 1Source Ledger API provides client access to the 1Source Ledger. You can find out more about 1Source at [https://equilend.com](https://equilend.com).  This specification is work in progress. The design is meant to model the securities lending life cycle in as clean a way as possible while being robust enough to easily translate to ISLA CDM workflows and data model.  API specification is the intellectual property of EquiLend LLC and should not be copied or disseminated in any way. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: 1source_help@equilend.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.os.client.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets BuyinCompleteStatus
 */
@JsonAdapter(BuyinCompleteStatus.Adapter.class)
public enum BuyinCompleteStatus {
  @SerializedName("PENDING")
  PENDING("PENDING"),
  @SerializedName("COMPLETE")
  COMPLETE("COMPLETE");

  private String value;

  BuyinCompleteStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BuyinCompleteStatus fromValue(String input) {
    for (BuyinCompleteStatus b : BuyinCompleteStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BuyinCompleteStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BuyinCompleteStatus enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public BuyinCompleteStatus read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return BuyinCompleteStatus.fromValue((String)(value));
    }
  }
}
