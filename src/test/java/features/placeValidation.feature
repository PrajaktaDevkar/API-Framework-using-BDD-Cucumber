Feature: Validate place API's
@AddPlace
Scenario Outline: Verify if place is sucessfully added using AddPlaceAPI
Given Add place payload with "<name>" "<language>" "<address>"
When User call "AddPlaceAPI" with "Post" http request
Then the API code is sucess with the status code 200
And "status" in response body is "OK"
And "scope" in response body is "APP"
And verify place_Id created map to "<name>" using "GetPlaceAPI" 

Examples:
|name| language |address|
|AAhouse|English|world cross center|
#|BBhouse|Marathi|Kurla|

@DeletePlace
Scenario: Verify if delete place functionality is working
Given Delete place payload
When User call "DeletePlaceAPI" with "Post" http request
Then the API code is sucess with the status code 200
And "status" in response body is "OK"