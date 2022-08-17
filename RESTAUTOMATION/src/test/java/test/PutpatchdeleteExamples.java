package test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutpatchdeleteExamples {
	@Test
	public void testPut() {
		 Map<String,Object>map	= new HashMap<String,Object>();
		// map.put("name","sindhu");
		// map.put("job","Associate Engineer");
		// System.out.println(map);
		// 
		 JSONObject request = new JSONObject(map);
		 request.put("name","sindhu");
		 request.put("job", "Associate Enginner");
		 System.out.println(request.toJSONString());
		 
		 baseURI ="https://reqres.in/api";
		 given().
		 header("Content-Type", "application/json").
		 contentType(ContentType.JSON).
		 accept(ContentType.JSON).
		 body(request.toJSONString()).
		 when().
		 post("/users/2").
		 then().
		 statusCode(201)
		 .log().all();
	
	}

	@Test
	public void testPatch() {
		 //Map<String,Object>map	= new HashMap<String,Object>();
		// map.put("name","sindhu");
		// map.put("job","Associate Engineer");
		// System.out.println(map);
		// 
		 JSONObject request = new JSONObject();
		 
		 request.put("name","sindhu");
		 request.put("job", "Associate Enginner");
		
		 System.out.println(request.toJSONString());
		 
		 baseURI ="https://reqres.in/api";
		 given().
		 header("Content-Type", "application/json").
		 contentType(ContentType.JSON).
		 accept(ContentType.JSON).
		 body(request.toJSONString()).
		 when().
		 patch("/api/users/2").
		 then().
		 statusCode(200)
		 .log().all();
	}
	
	
	        @Test
			public void testDelete() {
				 
				 
				 baseURI ="https://reqres.in/api";
				 
				
				 when().
				 delete("/api/users/2").
				 then().
				 statusCode(204)
				 .log().all();
				}
			
}
