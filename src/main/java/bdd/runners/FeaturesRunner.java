package bdd.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/main/java/ua/p900/fetures/login",
        glue = {"stepdefs"},
        tags = {"~@Ignore"},
        format = {"pretty"},
        "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/json-reports/CucumberTestReport.json",
        "rerun:target/cucumber-reports/rerun-reports/rerun.txt"})
)

public class FeaturesRunner {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void features(CucmberFeatureWrapper cucmberFeature) {
        testNGCucumberRunner.runCucumber(cucmberFeature.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void rearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
}
