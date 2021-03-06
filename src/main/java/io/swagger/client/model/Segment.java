/*
 * Moosend API
 * TODO: Add a description
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Criterion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Segment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:14:23.257Z")
public class Segment {
  @SerializedName("CreatedBy")
  private String createdBy = null;

  @SerializedName("CreatedOn")
  private String createdOn = null;

  @SerializedName("Criteria")
  private List<Criterion> criteria = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("FetchType")
  private Double fetchType = null;

  @SerializedName("FetchValue")
  private Double fetchValue = null;

  @SerializedName("ID")
  private Double ID = null;

  @SerializedName("MatchType")
  private Double matchType = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("UpdatedBy")
  private String updatedBy = null;

  @SerializedName("UpdatedOn")
  private String updatedOn = null;

  public Segment createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Segment createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * 
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public Segment criteria(List<Criterion> criteria) {
    this.criteria = criteria;
    return this;
  }

  public Segment addCriteriaItem(Criterion criteriaItem) {
    if (this.criteria == null) {
      this.criteria = new ArrayList<Criterion>();
    }
    this.criteria.add(criteriaItem);
    return this;
  }

   /**
   * 
   * @return criteria
  **/
  @ApiModelProperty(value = "")
  public List<Criterion> getCriteria() {
    return criteria;
  }

  public void setCriteria(List<Criterion> criteria) {
    this.criteria = criteria;
  }

  public Segment description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Segment fetchType(Double fetchType) {
    this.fetchType = fetchType;
    return this;
  }

   /**
   * 
   * @return fetchType
  **/
  @ApiModelProperty(value = "")
  public Double getFetchType() {
    return fetchType;
  }

  public void setFetchType(Double fetchType) {
    this.fetchType = fetchType;
  }

  public Segment fetchValue(Double fetchValue) {
    this.fetchValue = fetchValue;
    return this;
  }

   /**
   * 
   * @return fetchValue
  **/
  @ApiModelProperty(value = "")
  public Double getFetchValue() {
    return fetchValue;
  }

  public void setFetchValue(Double fetchValue) {
    this.fetchValue = fetchValue;
  }

  public Segment ID(Double ID) {
    this.ID = ID;
    return this;
  }

   /**
   * 
   * @return ID
  **/
  @ApiModelProperty(value = "")
  public Double getID() {
    return ID;
  }

  public void setID(Double ID) {
    this.ID = ID;
  }

  public Segment matchType(Double matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * 
   * @return matchType
  **/
  @ApiModelProperty(value = "")
  public Double getMatchType() {
    return matchType;
  }

  public void setMatchType(Double matchType) {
    this.matchType = matchType;
  }

  public Segment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Segment updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * 
   * @return updatedBy
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public Segment updatedOn(String updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * 
   * @return updatedOn
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(String updatedOn) {
    this.updatedOn = updatedOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Segment segment = (Segment) o;
    return Objects.equals(this.createdBy, segment.createdBy) &&
        Objects.equals(this.createdOn, segment.createdOn) &&
        Objects.equals(this.criteria, segment.criteria) &&
        Objects.equals(this.description, segment.description) &&
        Objects.equals(this.fetchType, segment.fetchType) &&
        Objects.equals(this.fetchValue, segment.fetchValue) &&
        Objects.equals(this.ID, segment.ID) &&
        Objects.equals(this.matchType, segment.matchType) &&
        Objects.equals(this.name, segment.name) &&
        Objects.equals(this.updatedBy, segment.updatedBy) &&
        Objects.equals(this.updatedOn, segment.updatedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, criteria, description, fetchType, fetchValue, ID, matchType, name, updatedBy, updatedOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Segment {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fetchType: ").append(toIndentedString(fetchType)).append("\n");
    sb.append("    fetchValue: ").append(toIndentedString(fetchValue)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
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

