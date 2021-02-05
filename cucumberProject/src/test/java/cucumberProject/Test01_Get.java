package cucumberProject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import  io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Test01_Get {
	
	static ResponseSpecBuilder builder;
	static ResponseSpecification specification;
	
	
	
	@BeforeClass
	public  static void setupResponseSpec()
	{
		builder=new ResponseSpecBuilder();
		specification=builder.expectStatusCode(200).build();
		
		
		
		
		
	}
	@BeforeClass
	public  static void setupBeforeClass()
	{
		System.out.println("setupBeforeClass");
		
		
		
		
		
	}
	
	
	
	@Test
	void test_01()
	{
		Response response=get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.getStatusLine());
		System.out.println(response.getStatusCode());
		
	}
	
	@Test
	void test_02()
	{
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		//.statusCode(200)
		.spec(specification)
		
		.body("data.id[0]", equalTo(7));
		
		
	}
	
	@Test
	void test_03()
	{
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.body("data.first_name", hasItems("Tobias","Byron"));
		
		
		
	}
	
	
	@Test
	void test_04()
	{
		given()
		.pathParam("number", 2)
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		
		.baseUri("https://reqres.in/")
		.request("GET","/api/users?page={number}")
		
		
		//.get("/api/users?page=2")
		.then()
		
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.log().all()
		
		//.spec(responseSpecification)
		.body("data.first_name", hasItems("Tobias","Byron"));
		
		
		
	}

}
