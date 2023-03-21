package com.UPGENIX.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
         "json:target/cucumber.json"},

        features = "src/test/resources/features",
        glue = "com/UPGENIX/step_definitions",
        dryRun = false

)
public class cukesRunner {

    }

