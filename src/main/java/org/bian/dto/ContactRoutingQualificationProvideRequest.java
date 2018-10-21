package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactRoutingQualificationProvideRequest
 */
public class ContactRoutingQualificationProvideRequest   {
  private Object customerQualificationServicingRequestRecord = null;

  private String servicingSessionReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"details of servicing resource request\" 
   * @return customerQualificationServicingRequestRecord
  **/

  public Object getCustomerQualificationServicingRequestRecord() {
    return customerQualificationServicingRequestRecord;
  }

  public void setCustomerQualificationServicingRequestRecord(Object customerQualificationServicingRequestRecord) {
    this.customerQualificationServicingRequestRecord = customerQualificationServicingRequestRecord;
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

