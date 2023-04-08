package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utility {
	
	public  RequestSpecification reqspec;
	
	public RequestSpecification requestSpecification() throws IOException {
		
		
	 PrintStream log=new PrintStream(new FileOutputStream("logging.txt"));	
	 reqspec = new RequestSpecBuilder().setBaseUri(getGlobalVariable("baseUrl")).addQueryParam("key", "qaclick123")
		    .setContentType(ContentType.JSON)
		    .addFilter(RequestLoggingFilter.logRequestTo(log))
		    .addFilter(ResponseLoggingFilter.logResponseTo(log)).setContentType(ContentType.JSON)
		    .build();
	 return reqspec;
}
	
	public static String getGlobalVariable(String key) throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fi = new FileInputStream("C:\\Users\\praja\\eclipse-workspace\\APIFrameworkUsingBDDCucumber\\src\\test\\java\\resources\\globalproperties.properties");
		prop.load(fi);
		return prop.getProperty(key);
		
	}
	
	public static String getJsonPath(String key,Response res)
	{
		String responseAsString=res.asString();
		JsonPath js= new JsonPath(responseAsString);
		return js.getString(key);
		
	}
	 	
	
	
	
	
	
}