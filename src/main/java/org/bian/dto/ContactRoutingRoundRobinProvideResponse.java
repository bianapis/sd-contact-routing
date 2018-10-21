package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactRoutingRoundRobinProvideResponse
 */
public class ContactRoutingRoundRobinProvideResponse   {
  private String servicingResourceAllocationReference = null;

  private String roundRobinServicingResourceAssignmentRequestReference = null;

  private String servicingPositionReference = null;

  private String servicingResourceReference = null;


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


}

