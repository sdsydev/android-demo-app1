package com.sndconsultantsltd.android.demo.test;

import android.test.ActivityInstrumentationTestCase2;

import com.sndconsultantsltd.android.demo.RSSDemoActivity;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RssFeedDemoActivitySteps extends
		ActivityInstrumentationTestCase2<RSSDemoActivity> {

	public RssFeedDemoActivitySteps() {
		super(RSSDemoActivity.class);
		
	}

	@Given("^I am launching the application$")
	public void I_am_launching_the_application() throws Exception { 
		System.out.println("in method ..I_am_launching_the_application()");
		
	}

	@When("^I submit a text$")
	public void I_submit_a_text() throws Exception { 
		System.out.println("in method ..I_submit_a_text()");
		
	}

	@Then("^I receive the same text on the next page$")
	public void I_receive_the_same_text_on_the_next_page() throws Exception {
		System.out.println("in method ..I_receive_the_same_text_on_the_next_page()");
		
		
	}


}
