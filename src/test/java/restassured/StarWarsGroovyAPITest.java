package restassured;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.when;
import static io.restassured.path.json.JsonPath.from;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

/**
 * Created by Ali Al-Marsumi Local on 25/09/2017.
 */
public class StarWarsGroovyAPITest {
    Response response = get("https://swapi.co/api/people/");
    String jsonString =response.asString();
    JsonPath jp = new JsonPath(jsonString);


    @Test
    public void getLukeFilms(){
        when().get("https://swapi.co/api/people/").
                then().body("results.findAll {it.name=='Luke Skywalker'}.films[0]", hasItems("https://swapi.co/api/films/2/", "https://swapi.co/api/films/7/"));

//        System.out.println(jp.get("results.findAll {it.name=='Luke Skywalker'}.films[0]"));

//        List<String> filmsArray = from(jsonString).getList("results.findAll{it.name==\"Luke Skywalker\"}.films");
//        System.out.println(filmsArray);


//        List<String> nameArray = from(jsonString).getList("results.findAll{it.name==\"Luke Skywalker\"}");
//        System.out.println(nameArray);

            /////////////one alternative
//        List<String> films = jp.get("results[0].films");
        /////one way of debugging
//        List<String> films = jp.get("results.findAll {it.name=='Luke Skywalker'}.films[0]");
//        System.out.println(films);
//        assertThat(films, hasItems("https://swapi.co/api/films/2/", "https://swapi.co/api/films/1/"));

    }


}
