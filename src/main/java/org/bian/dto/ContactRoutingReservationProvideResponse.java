package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactRoutingReservationProvideResponse
 */
public class ContactRoutingReservationProvideResponse   {
  private String servicingResourceAllocationReference = null;

  private String servicingResourceReservationRequestReference = null;

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

