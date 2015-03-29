//Tester.java

package com.w2.cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tester {

	@Given("^I am a \"([a-zA-Z]{1,})\" Tester$") //The brackets are to specify that the value will be passed as an argument
	public void I_am_a_Manual_Tester(String testerType) {
		System.out.println("@Given - I am a "+testerType+" Tester");
	}
	
	@When("^I apply for a job$")
	public void I_apply_for_a_job() {
		System.out.println("@When - I apply for a job");
	}
	
	@Then("^I got a \"([a-zA-Z]{1,})\" paid job$")
	public void I_got_a_less_paid_job(String jobType) {
		System.out.println("@Then - I got a "+jobType+" paid job");
	}
	
	@And("^I am \"([a-zA-Z]{1,})\" satisfied with my salary$")
	public void I_am_no_satisfied_with_my_salary(String satsifactionLevel) {
		System.out.println("@And - I am "+satsifactionLevel+" satisfied with my salary");
	}
	
	@But("^my parents are \"([a-zA-Z]{1,})\" satisfied$")
	public void my_parents_are_still_satisfied(String parentsSatsisfactionLevel) {
		System.out.println("@But - my parents are "+parentsSatsisfactionLevel+" satisfied");
	}
}