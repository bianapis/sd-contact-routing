/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ContactRoutingApiService {

	ContactRoutingQualificationProvideResponse provideQualifications(String crReferenceId, ContactRoutingQualificationProvideRequest request);
	
	ContactRoutingReservationProvideResponse provideReservations(String crReferenceId, ContactRoutingReservationProvideRequest request);
	
	ContactRoutingRoundRobinProvideResponse provideRoundsRobins(String crReferenceId, ContactRoutingRoundRobinProvideRequest request);
	
	ContactRoutingRecordResponse record(String crReferenceId, ContactRoutingRecordRequest request);
	
	ContactRoutingResponse retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	ContactRoutingQualificationWithIdAndRootResponse retrieveQualifications(String crReferenceId, String bqReferenceId);
	
	ContactRoutingReservationWithIdAndRootResponse retrieveReservations(String crReferenceId, String bqReferenceId);
	
	ContactRoutingRoundRobinWithIdAndRootResponse retrieveRoundsRobins(String crReferenceId, String bqReferenceId);
	
}
