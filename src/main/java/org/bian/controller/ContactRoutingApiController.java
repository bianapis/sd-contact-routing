/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Allocate;

@BianRestController
public class ContactRoutingApiController {

	@Autowired
	ContactRoutingApiService service;
	
	@BQ("qualifications")
	@Allocate.Provide
	public BianResponse<ContactRoutingQualificationProvideResponse> provideQualifications(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactRoutingQualificationProvideRequest> bianRequest) {
		return BianResponse.forSuccess(service.provideQualifications(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("reservations")
	@Allocate.Provide
	public BianResponse<ContactRoutingReservationProvideResponse> provideReservations(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactRoutingReservationProvideRequest> bianRequest) {
		return BianResponse.forSuccess(service.provideReservations(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("rounds-robins")
	@Allocate.Provide
	public BianResponse<ContactRoutingRoundRobinProvideResponse> provideRoundsRobins(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactRoutingRoundRobinProvideRequest> bianRequest) {
		return BianResponse.forSuccess(service.provideRoundsRobins(crReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Record
	public BianResponse<ContactRoutingRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactRoutingRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Retrieve
	public BianResponse<ContactRoutingResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Allocate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Allocate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Allocate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("qualifications")
	@Allocate.Retrieve
	public BianResponse<ContactRoutingQualificationWithIdAndRootResponse> retrieveQualifications(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveQualifications(crReferenceId, bqReferenceId));
	}
	
	@BQ("reservations")
	@Allocate.Retrieve
	public BianResponse<ContactRoutingReservationWithIdAndRootResponse> retrieveReservations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReservations(crReferenceId, bqReferenceId));
	}
	
	@BQ("rounds-robins")
	@Allocate.Retrieve
	public BianResponse<ContactRoutingRoundRobinWithIdAndRootResponse> retrieveRoundsRobins(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRoundsRobins(crReferenceId, bqReferenceId));
	}
	
}
