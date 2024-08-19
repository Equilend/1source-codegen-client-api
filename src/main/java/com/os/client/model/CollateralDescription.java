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
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets CollateralDescription
 */
@JsonAdapter(CollateralDescription.Adapter.class)
public enum CollateralDescription {
  @SerializedName("NONUSAGENCIES")
  NONUSAGENCIES("NONUSAGENCIES"),
  @SerializedName("AGENCIES")
  AGENCIES("AGENCIES"),
  @SerializedName("CANADIANBONDS")
  CANADIANBONDS("CANADIANBONDS"),
  @SerializedName("CANADIANPROVINCIALS")
  CANADIANPROVINCIALS("CANADIANPROVINCIALS"),
  @SerializedName("CORPORATES")
  CORPORATES("CORPORATES"),
  @SerializedName("DEBT")
  DEBT("DEBT"),
  @SerializedName("EMUDEBTAAA")
  EMUDEBTAAA("EMUDEBTAAA"),
  @SerializedName("EMUDEBT")
  EMUDEBT("EMUDEBT"),
  @SerializedName("AUSTRALIANEQUITIES")
  AUSTRALIANEQUITIES("AUSTRALIANEQUITIES"),
  @SerializedName("EQUITIES")
  EQUITIES("EQUITIES"),
  @SerializedName("GOVTDEBT105")
  GOVTDEBT105("GOVTDEBT105"),
  @SerializedName("G10DEBT")
  G10DEBT("G10DEBT"),
  @SerializedName("G3DEBT")
  G3DEBT("G3DEBT"),
  @SerializedName("G8DEBT")
  G8DEBT("G8DEBT"),
  @SerializedName("UKGILTS")
  UKGILTS("UKGILTS"),
  @SerializedName("GOVERNMENTISSUES")
  GOVERNMENTISSUES("GOVERNMENTISSUES"),
  @SerializedName("GOVERNMENTISSUESAAA")
  GOVERNMENTISSUESAAA("GOVERNMENTISSUESAAA"),
  @SerializedName("HIGHGRADEEQUITIES")
  HIGHGRADEEQUITIES("HIGHGRADEEQUITIES"),
  @SerializedName("INVESTMENTGRADECORPORATES")
  INVESTMENTGRADECORPORATES("INVESTMENTGRADECORPORATES"),
  @SerializedName("JAPANESEGOVERNMENTBONDS")
  JAPANESEGOVERNMENTBONDS("JAPANESEGOVERNMENTBONDS");

  private String value;

  CollateralDescription(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CollateralDescription fromValue(String input) {
    for (CollateralDescription b : CollateralDescription.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CollateralDescription> {
    @Override
    public void write(final JsonWriter jsonWriter, final CollateralDescription enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public CollateralDescription read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return CollateralDescription.fromValue((String)(value));
    }
  }
}
