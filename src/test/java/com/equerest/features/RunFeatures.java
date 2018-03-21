package com.equerest.features;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/com/equerest/features", format = {"pretty",
        "html:target/site/cucumber-pretty"})
public class RunFeatures extends AbstractTestNGCucumberTests {
}
