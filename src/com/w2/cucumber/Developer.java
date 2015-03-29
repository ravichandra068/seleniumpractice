// Developer.java

package com.w2.cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Developer {

	@Given("^I am a \"([a-zA-Z]{1,})\" Developer$") //The brackets are to specify that the value will be passed as an argument
	public void I_am_a_Java_Developer(String developerType) {
		System.out.println("========================================");
		System.out.println("@Given - I am a "+developerType+" Developer");
	}
	
	@When("^I started development$")
	public void I_started_development() {
		System.out.println("@When - I started development");
	}
	
	@Then("^I created a \"([a-zA-Z]{1,})\" java program$")
	public void I_created_a_java_program(String programType) {
		System.out.println("@Then - I created a "+programType+" java program");
	}
	
	@And("^I am \"([a-zA-Z]{1,})\" experienced$")
	public void I_am_experienced(String experienceLevel) {
		System.out.println("@And - I am "+experienceLevel+" experienced");
	}
	
	@But("^my boss is \"([a-zA-Z]{1,})\" satisfied$")
	public void my_boss_is_satisfied(String bossSatsisfactionLevel) {
		System.out.println("@But - my boss is "+bossSatsisfactionLevel+" satisfied");
	}
}