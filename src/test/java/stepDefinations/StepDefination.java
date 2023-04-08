
package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.Location;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utility;

import static org.junit.Assert.assertEquals;

import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StepDefination extends Utility {

	RequestSpecification req;
	TestDataBuild data=new TestDataBuild();
	ResponseSpecification resspec;;
	Response res;
	static String placeId;
	
	
@Given("Add place payload with {string} {string} {string}")
public void add_place_payload_with(String name,String language,String address) throws IOException
{
	
     resspec= new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
     req = given().spec(requestSpecification()).body(data.addPlacePayload(name,language,address));
}


@When("User call {string} with {string} http request")
public void user_call_with_http_request(String resource,String httpRequest )
{
	APIResources resourceAPI = APIResources.valueOf(resource);
	System.out.println(resourceAPI);
	if(httpRequest.equalsIgnoreCase("POST"))
	res = req.when().post(resourceAPI.getResource()).then().extract().response();
	else if(httpRequest.equalsIgnoreCase("GET"))
	res = req.when().get(resourceAPI.getResource()).then().extract().response();
  
}

@Then("the API code is sucess with the status code {int}")
public void the_API_code_is_sucess_with_the_status_code(Integer int1)
{
	assertEquals(res.getStatusCode(),200);
  
}

@Then("{string} in response body is {string}")
public void in_response_body_is(String keyValue, String ExpectedValue) 
{
   
   String actualValue=getJsonPath(keyValue,res);
   assertEquals(actualValue,ExpectedValue);
   
}

@Then("verify place_Id created map to {string} using {string}")
public void verify_place_Id_created_map_to_using(String expectedName, String resource) throws IOException {
	placeId=getJsonPath("place_id",res);
	req= given().spec(requestSpecification()).queryParam("place_id", placeId);
	user_call_with_http_request(resource,"GET");
	String actualName=getJsonPath("name",res);
	assertEquals(actualName,expectedName);
	
}

@Given("Delete place payload")
public void delete_place_payload() throws IOException {
   System.out.println(placeId);
	req=given().spec(requestSpecification()).body(data.deletePlacePayload(placeId));
}


}
