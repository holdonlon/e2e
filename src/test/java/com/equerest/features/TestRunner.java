package com.equerest.features;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.*;

@CucumberOptions(
    features = "src/test/resourses/bdd.pages.features",
    glue = {"stepdefs"},
    tags = {~@Ignore},
    format ={
        "pretty",
        "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucmber-reports/CucumberTestReport.json",
        "rerun:target/cucumber-reports/rerun-reports/rerun.txt"
        })
public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "bdd/pages/features");
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
@DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
}
@AfterClass(alwaysRun = true)
    public void tearDOwnClass() throws Exception {
        testNGCucumberRunner.finish();
}
}
