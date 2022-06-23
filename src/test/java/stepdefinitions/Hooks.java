package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

import static utilities.Driver.waitFor;

public class Hooks {

    public static RequestSpecification spec;
    @Before(value = "@ApiTestItem")
    public void setup(){
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("url")).build();
    }


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            File scrFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(scrFile, new File(".\\HataliEkranGoruntuleri\\" + scenario.getName() + ".jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        waitFor(5);
        Driver.closeDriver();
        waitFor(5);
    }
}