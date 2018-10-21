package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactRoutingReservationWithIdAndRootResponse
 */
public class ContactRoutingReservationWithIdAndRootResponse   {
  private String servicingResourceAllocationReference = null;

  private String servicingResourceReservationRequestReference = null;

  private Object servicingResourceReservationRecord = null;

  private String servicingResourceAllocationServiceSchedule = null;

  private String servicingResourceReference = null;

  private String servicingResourceQualificationProfile = null;

  private String servicingResourceSchedule = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingResourceReservationRequestReference
  **/

  public String getServicingResourceReservationRequestReference() {
    return servicingResourceReservationRequestReference;
  }

  public void setServicingResourceReservationRequestReference(String servicingResourceReservationRequestReference) {
    this.servicingResourceReservationRequestReference = servicingResourceReservationRequestReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"details the reservation requirements\" 
   * @return servicingResourceReservationRecord
  **/

  public Object getServicingResourceReservationRecord() {
    return servicingResourceReservationRecord;
  }

  public void setServicingResourceReservationRecord(Object servicingResourceReservationRecord) {
    this.servicingResourceReservationRecord = servicingResourceReservationRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return servicingResourceAllocationServiceSchedule
  **/

  public String getServicingResourceAllocationServiceSchedule() {
    return servicingResourceAllocationServiceSchedule;
  }

  public void setServicingResourceAllocationServiceSchedule(String servicingResourceAllocationServiceSchedule) {
    this.servicingResourceAllocationServiceSchedule = servicingResourceAllocationServiceSchedule;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"details the time resources are available from until - updated to reflect booking\" 
   * @return servicingResourceSchedule
  **/

  public String getServicingResourceSchedule() {
    return servicingResourceSchedule;
  }

  public void setServicingResourceSchedule(String servicingResourceSchedule) {
    this.servicingResourceSchedule = servicingResourceSchedule;
  }


}

