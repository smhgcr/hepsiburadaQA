package API;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class GroceryTestAPI {

    @Test
    public void allGroceryTest() {
        when()
                .get("http://localhost:3000/allGrocery/")
                .then()
                .statusCode(200);
    }

    @Test
    public void singleGroceryTest() {
        when()
                .get("http://localhost:3000/allGrocery/1")
                .then()
                .body("name", equalTo("apple"))
                .statusCode(200);
    }

    @Test
    public void addGrocery() {
        String postData = "{\n" +
                " \"name\": \"string\",\n" +
                " \"price\": 12.3,\n" +
                " \"stock\": 3,\n" +
                "}";
        given().
                contentType(ContentType.JSON).
                body(postData).
                when().
                post("http://localhost:3000/allGrocery").
                then().
                statusCode(201);

    }


}

