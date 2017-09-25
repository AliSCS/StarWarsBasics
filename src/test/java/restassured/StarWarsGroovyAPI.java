package restassured;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

/**
 * Created by Ali Al-Marsumi Local on 25/09/2017.
 */
public class StarWarsGroovyAPI {
    Response response = get("https://swapi.co/api/people/");
    String jsonString =response.asString();
    JsonPath jp = new JsonPath(jsonString);


    @Test
    public void getLukeFilms(){
//        when().get("https://swapi.co/api/people/").
//                then().body("results.findAll {it.name='Luke Skywalker'}.films", hasItems("https://swapi.co/api/films/2/"));
        List<String> films = jp.get("results[0].films");
        System.out.println(films);
        assertThat(films, hasItems("https://swapi.co/api/films/2/", "https://swapi.co/api/films/12/"));

//        Assert.assertEquals("Luke Skywalker",jp.get("results[0].name"));
    }


}
