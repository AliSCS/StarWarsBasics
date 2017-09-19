package restassured;



import io.restassured.RestAssured;
import org.junit.Test;
import org.junit.Before;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import io.restassured.response.Response;

import static io.restassured.RestAssured.expect;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


/**
 * Created by Ali Al-Marsumi Local on 13/09/2017.
 */
public class StarWars_API_Test {

    @Before
    public void setup(){
        RestAssured.baseURI= "http://swapi.co/api/";
    }


    @Test
    public void canGetName(){
        //get and assert lukes name
        expect().body("name",equalTo("Luke Skywalker")).when().get("http://swapi.co/api/people/1/");

    }

    @Test
    public void canGetFilms(){
        // get and assert 
        RestAssured.get("people/1/").then().assertThat().body("films[0]", equalTo("http://swapi.co/api/films/2/"));
    }


    @Test
    public void canGetMass(){
        given().queryParam("name", "Anakin Skywalker").when().get("people/11").then().body("mass", equalTo("84"));
    }
}

