package cucumberProject;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class MockAPI_Tests {
	
	
	@Test
	public void getMock_Test()
	{
		
		given().baseUri("http://localhost:3000/")
		.param("id", "2")
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.get("/Subjects")
		.then()
		.log()
		.all();
		
		
	}
	
	@Test
	public void postMock_Test()
	{
		JSONObject request=new JSONObject();
		request.put("id", "3");
		request.put("name", "Manual_testing");
		
		given().baseUri("http://localhost:3000/")
		
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		
		.body(request.toJSONString())
		.when()
		.post("/Subjects")
		.then()
		
		.log()
		.all();
		
		
	}
	
	@Test
	public void get2tMock_Test()
	{
		
		given().baseUri("http://localhost:3000/")
		
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		
		//.body(request.toJSONString())
		.when()
		.get("/Subjects")
		.then()
		.body("name", hasItems("Automation"))
		.log()
		.all();
		
		
	}
}
