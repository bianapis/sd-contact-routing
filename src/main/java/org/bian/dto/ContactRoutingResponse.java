package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactRoutingResponse
 */
public class ContactRoutingResponse   {
  private String servicingResourceAllocationReference = null;

  private String servicingResourceReference = null;

  private String servicingResourceQualificationProfile = null;

  private String servicingPositionReference = null;

  private String servicingResourceSchedule = null;

  private String servicingResourceStatus = null;

  private String servicingSessionReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingResourceAllocationReference
  **/

  public String getServicingResourceAllocationReference() {
    return servicingResourceAllocationReference;
  }

  public void setServicingResourceAllocationReference(String servicingResourceAllocationReference) {
    this.servicingResourceAllocationReference = servicingResourceAllocationReference;
  }


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"details qualification or expertise of a resource\" 
   * @return servicingResourceQualificationProfile
  **/

  public String getServicingResourceQualificationProfile() {
    return servicingResourceQualificationProfile;
  }

  public void setServicingResourceQualificationProfile(String servicingResourceQualificationProfile) {
    this.servicingResourceQualificationProfile = servicingResourceQualificationProfile;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"assigned servicing position for the resource\" 
   * @return servicingPositionReference
  **/

  public String getServicingPositionReference() {
    return servicingPositionReference;
  }

  public void setServicingPositionReference(String servicingPositionReference) {
    this.servicingPositionReference = servicingPositionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"details the time resources are available from until\" 
   * @return servicingResourceSchedule
  **/

  public String getServicingResourceSchedule() {
    return servicingResourceSchedule;
  }

  public void setServicingResourceSchedule(String servicingResourceSchedule) {
    this.servicingResourceSchedule = servicingResourceSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"current status indicates availability for assignment\" 
   * @return servicingResourceStatus
  **/

  public String getServicingResourceStatus() {
    return servicingResourceStatus;
  }

  public void setServicingResourceStatus(String servicingResourceStatus) {
    this.servicingResourceStatus = servicingResourceStatus;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to a servicing session assignment made to a resource\" 
   * @return servicingSessionReference
  **/

  public String getServicingSessionReference() {
    return servicingSessionReference;
  }

  public void setServicingSessionReference(String servicingSessionReference) {
    this.servicingSessionReference = servicingSessionReference;
  }


}

