package stepdefinitions.apiStep;

import static io.restassured.RestAssured.given;
import static stepdefinitions.Hooks.spec;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class api02Step {


    Response response;
    @Given("sum gerekli path params ayarlari yapar")
    public void sum_gerekli_path_params_ayarlari_yapar() {
        spec.pathParams("bir","api","iki","productsList");
    }
    @Given("code ve response mesaji icin request gonderir response alir")
    public void code_ve_response_mesaji_icin_request_gonderir_response_alir() {
       // response = given().spec(spec).contentType(ContentType.JSON).body()
    }
    @Then("code api ile dogrulanir")
    public void code_api_ile_dogrulanir() {

    }
    @Then("message api ile verify edilir.")
    public void message_api_ile_verify_edilir() {

    }



}
