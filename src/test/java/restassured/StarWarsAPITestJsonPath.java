package restassured;

import com.sun.xml.internal.ws.policy.AssertionSet;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import org.junit.Test;

import static io.restassured.RestAssured.get;

/**
 * Created by Ali Al-Marsumi Local on 24/09/2017.
 */
public class StarWarsAPITestJsonPath {
    Response res = get("https://swapi.co/api/people/");
    String jsonString = res.asString();
    JsonPath jp = new JsonPath(jsonString);


    @Test
    public void verifyStatus(){
        Assert.assertEquals(200, res.getStatusCode());
    }


    @Test
    public void getCount(){
//        Assert.assertEquals(200, res.getStatusCode());
//        String jsonString = res.asString();
//        JsonPath jp = new JsonPath(jsonString);
        Assert.assertEquals(87,jp.get("count"));
    }

    @Test
    public void getFirstPerson(){
//        Assert.assertEquals(200, res.getStatusCode());
//        String jsonString = res.asString();
//        JsonPath jp = new JsonPath(jsonString);
        Assert.assertEquals("Luke Skywalker",jp.get("results[0].name"));
    }







}
