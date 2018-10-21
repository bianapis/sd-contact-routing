package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactRoutingRoundRobinWithIdAndRootResponse
 */
public class ContactRoutingRoundRobinWithIdAndRootResponse   {
  private String servicingResourceAllocationReference = null;

  private String roundRobinServicingResourceAssignmentRequestReference = null;

  private Object customerRoundRobinServicingRequestRecord = null;

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
   * @return roundRobinServicingResourceAssignmentRequestReference
  **/

  public String getRoundRobinServicingResourceAssignmentRequestReference() {
    return roundRobinServicingResourceAssignmentRequestReference;
  }

  public void setRoundRobinServicingResourceAssignmentRequestReference(String roundRobinServicingResourceAssignmentRequestReference) {
    this.roundRobinServicingResourceAssignmentRequestReference = roundRobinServicingResourceAssignmentRequestReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"details of servicing resource request\" 
   * @return customerRoundRobinServicingRequestRecord
  **/

  public Object getCustomerRoundRobinServicingRequestRecord() {
    return customerRoundRobinServicingRequestRecord;
  }

  public void setCustomerRoundRobinServicingRequestRecord(Object customerRoundRobinServicingRequestRecord) {
    this.customerRoundRobinServicingRequestRecord = customerRoundRobinServicingRequestRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"assigned servicing position - next available resource\" 
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

