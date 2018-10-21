package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactRoutingRecordRequest
 */
public class ContactRoutingRecordRequest   {
  private String servicingResourceReference = null;

  private String servicingResourceStatus = null;

  private String servicingSessionReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to resource\" 
   * @return servicingResourceReference
  **/

  public String getServicingResourceReference() {
    return servicingResourceReference;
  }

  public void setServicingResourceReference(String servicingResourceReference) {
    this.servicingResourceReference = servicingResourceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"details current availability for servicing\" 
   * @return servicingResourceStatus
  **/

  public String getServicingResourceStatus() {
    return servicingResourceStatus;
  }

  public void setServicingResourceStatus(String servicingResourceStatus) {
    this.servicingResourceStatus = servicingResourceStatus;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the last completed servicing session assignment\" 
   * @return servicingSessionReference
  **/

  public String getServicingSessionReference() {
    return servicingSessionReference;
  }

  public void setServicingSessionReference(String servicingSessionReference) {
    this.servicingSessionReference = servicingSessionReference;
  }


}

