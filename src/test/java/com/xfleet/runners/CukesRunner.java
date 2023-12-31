package com.xfleet.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber-report.json",
                "junit:target/cucumber-report.xml",
                "rerun:target/rerun.txt",


        },
        features = "src/test/resources/features",
        glue = "com/xfleet/step_definitions",

        dryRun = false,
        tags = "@XFLEET10-885",
        publish = true


)
public class CukesRunner {
}

