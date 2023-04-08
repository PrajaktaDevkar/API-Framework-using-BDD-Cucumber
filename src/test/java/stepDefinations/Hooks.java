
package stepDefinations;

import java.io.IOException;

import cucumber.api.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{
		StepDefination m=new StepDefination();
		if(m.placeId==null)
		{
		m.add_place_payload_with("shetty", "French", "Mumbai");
		m.user_call_with_http_request("AddPlaceAPI", "POST");
		m.verify_place_Id_created_map_to_using("shetty", "GetPlaceAPI");
		}
	}
	

}
