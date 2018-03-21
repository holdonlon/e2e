package com.equerest.features;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServiceHooks {
    @Before
    public void initialize(){
        //Code to setup initial configurations
    }
    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
