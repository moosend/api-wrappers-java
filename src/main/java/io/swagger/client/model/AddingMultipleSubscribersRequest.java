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
import io.swagger.client.model.Subscribers;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AddingMultipleSubscribersRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:14:23.257Z")
public class AddingMultipleSubscribersRequest {
  @SerializedName("Subscribers")
  private List<Subscribers> subscribers = new ArrayList<Subscribers>();

  public AddingMultipleSubscribersRequest subscribers(List<Subscribers> subscribers) {
    this.subscribers = subscribers;
    return this;
  }

  public AddingMultipleSubscribersRequest addSubscribersItem(Subscribers subscribersItem) {
    this.subscribers.add(subscribersItem);
    return this;
  }

   /**
   * A list of subscribers to add to the mailing list. You may specify the email address, the name and the custom fields for each subscriber. The following example demonstrates the format each subscriber should be written in your request, assuming that you also have two custom fields named Age and Country.
   * @return subscribers
  **/
  @ApiModelProperty(required = true, value = "A list of subscribers to add to the mailing list. You may specify the email address, the name and the custom fields for each subscriber. The following example demonstrates the format each subscriber should be written in your request, assuming that you also have two custom fields named Age and Country.")
  public List<Subscribers> getSubscribers() {
    return subscribers;
  }

  public void setSubscribers(List<Subscribers> subscribers) {
    this.subscribers = subscribers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddingMultipleSubscribersRequest addingMultipleSubscribersRequest = (AddingMultipleSubscribersRequest) o;
    return Objects.equals(this.subscribers, addingMultipleSubscribersRequest.subscribers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscribers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddingMultipleSubscribersRequest {\n");
    
    sb.append("    subscribers: ").append(toIndentedString(subscribers)).append("\n");
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

