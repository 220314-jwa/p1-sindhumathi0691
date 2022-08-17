package test;
//import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;
import java.util.HashMap;
public class TestgetandpostExamples{
@Test
public void testGet(){
	baseURI="https://reqres.in/api";
	given().
	get("/users?page=2").
	then().
	statusCode(200).
	body("data[1].first_name",equalTo("Lindsay")).
	body("data.first_name", hasItems("George", "Lindsay"));
	
}
@Test
public void testPost() {
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
 post("/users").
 then().
 statusCode(201)
 .log().all();
}
}