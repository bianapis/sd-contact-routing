package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactRoutingQualificationWithIdAndRootResponse
 */
public class ContactRoutingQualificationWithIdAndRootResponse   {
  private String servicingResourceAllocationReference = null;

  private String qualificationServicingResourceAssignmentRequestReference = null;

  private Object customerQuaificationServicingRequestRecord = null;

  private Object customerContactRecord = null;

  private String servicingPositionReference = null;

  private String servicingResourceReference = null;

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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return qualificationServicingResourceAssignmentRequestReference
  **/

  public String getQualificationServicingResourceAssignmentRequestReference() {
    return qualificationServicingResourceAssignmentRequestReference;
  }

  public void setQualificationServicingResourceAssignmentRequestReference(String qualificationServicingResourceAssignmentRequestReference) {
    this.qualificationServicingResourceAssignmentRequestReference = qualificationServicingResourceAssignmentRequestReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"details of servicing resource request\" 
   * @return customerQuaificationServicingRequestRecord
  **/

  public Object getCustomerQuaificationServicingRequestRecord() {
    return customerQuaificationServicingRequestRecord;
  }

  public void setCustomerQuaificationServicingRequestRecord(Object customerQuaificationServicingRequestRecord) {
    this.customerQuaificationServicingRequestRecord = customerQuaificationServicingRequestRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"contains consolidated contact details assembled during contact - used to select best qualified resource\" 
   * @return customerContactRecord
  **/

  public Object getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(Object customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"assigned servicing position\" 
   * @return servicingPositionReference
  **/

  public String getServicingPositionReference() {
    return servicingPositionReference;
  }

  public void setServicingPositionReference(String servicingPositionReference) {
    this.servicingPositionReference = servicingPositionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"assigned servicing resource if assisted\" 
   * @return servicingResourceReference
  **/

  public String getServicingResourceReference() {
    return servicingResourceReference;
  }

  public void setServicingResourceReference(String servicingResourceReference) {
    this.servicingResourceReference = servicingResourceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the session within the contact\"  
   * @return servicingSessionReference
  **/

  public String getServicingSessionReference() {
    return servicingSessionReference;
  }

  public void setServicingSessionReference(String servicingSessionReference) {
    this.servicingSessionReference = servicingSessionReference;
  }


}

