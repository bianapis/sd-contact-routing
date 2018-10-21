/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ContactRoutingApiServiceImpl implements ContactRoutingApiService {

	public ContactRoutingQualificationProvideResponse provideQualifications(String crReferenceId, ContactRoutingQualificationProvideRequest request){
		return JsonReader.read("provide-ContactRoutingQualificationProvideResponse.json",new TypeReference<ContactRoutingQualificationProvideResponse>(){});
	}
	
	public ContactRoutingReservationProvideResponse provideReservations(String crReferenceId, ContactRoutingReservationProvideRequest request){
		return JsonReader.read("provide-ContactRoutingReservationProvideResponse.json",new TypeReference<ContactRoutingReservationProvideResponse>(){});
	}
	
	public ContactRoutingRoundRobinProvideResponse provideRoundsRobins(String crReferenceId, ContactRoutingRoundRobinProvideRequest request){
		return JsonReader.read("provide-ContactRoutingRoundRobinProvideResponse.json",new TypeReference<ContactRoutingRoundRobinProvideResponse>(){});
	}
	
	public ContactRoutingRecordResponse record(String crReferenceId, ContactRoutingRecordRequest request){
		return JsonReader.read("record-ContactRoutingRecordResponse.json",new TypeReference<ContactRoutingRecordResponse>(){});
	}
	
	public ContactRoutingResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-ContactRoutingResponse.json",new TypeReference<ContactRoutingResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ContactRoutingQualificationWithIdAndRootResponse retrieveQualifications(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactRoutingQualificationWithIdAndRootResponse.json",new TypeReference<ContactRoutingQualificationWithIdAndRootResponse>(){});
	}
	
	public ContactRoutingReservationWithIdAndRootResponse retrieveReservations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactRoutingReservationWithIdAndRootResponse.json",new TypeReference<ContactRoutingReservationWithIdAndRootResponse>(){});
	}
	
	public ContactRoutingRoundRobinWithIdAndRootResponse retrieveRoundsRobins(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactRoutingRoundRobinWithIdAndRootResponse.json",new TypeReference<ContactRoutingRoundRobinWithIdAndRootResponse>(){});
	}
	
}
