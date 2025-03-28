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
import java.time.OffsetDateTime;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Event
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-28T19:09:31.413170521Z[GMT]")

public class Event implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("eventId")
  private Long eventId = null;

  @SerializedName("eventType")
  private EventType eventType = null;

  @SerializedName("eventDateTime")
  private OffsetDateTime eventDateTime = null;

  @SerializedName("resourceUri")
  private String resourceUri = null;

  public Event eventId(Long eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @Schema(required = true, description = "")
  public Long getEventId() {
    return eventId;
  }

  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }

  public Event eventType(EventType eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @Schema(required = true, description = "")
  public EventType getEventType() {
    return eventType;
  }

  public void setEventType(EventType eventType) {
    this.eventType = eventType;
  }

  public Event eventDateTime(OffsetDateTime eventDateTime) {
    this.eventDateTime = eventDateTime;
    return this;
  }

   /**
   * Get eventDateTime
   * @return eventDateTime
  **/
  @Schema(description = "")
  public OffsetDateTime getEventDateTime() {
    return eventDateTime;
  }

  public void setEventDateTime(OffsetDateTime eventDateTime) {
    this.eventDateTime = eventDateTime;
  }

  public Event resourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

   /**
   * Get resourceUri
   * @return resourceUri
  **/
  @Schema(description = "")
  public String getResourceUri() {
    return resourceUri;
  }

  public void setResourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.eventId, event.eventId) &&
        Objects.equals(this.eventType, event.eventType) &&
        Objects.equals(this.eventDateTime, event.eventDateTime) &&
        Objects.equals(this.resourceUri, event.resourceUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventType, eventDateTime, resourceUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
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
