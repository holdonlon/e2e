package com.equerest.features;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefenition {
    @Given()
    public void i_am_on_the_page_on_the_URL(String arg1,String arg2) throws Throwable {
        throw new PendingException();
    }

    @When("^")
    public void i_fill_in_with(String arg1, String arg2) throws Throwable {
        throw new PendingException();
    }
}
