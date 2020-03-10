package com.learn.cucumber.bdd.stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

class IsItSunday {
	static String isItSunday(String today) {
		return today.equals("Sunday") ? "yes" : "Nope";
	}
}

public class HelloCucumberWithExampleStepDefinitions {

	String today;
	String actualAnswer;

	@Given("today is {string}")
	public void today_is(String day) {
		this.today = day;
	}

	@When("I ask whether it's Sunday yet")
	public void i_ask_whether_it_s_Sunday_yet() {
		actualAnswer = IsItSunday.isItSunday(today);
		System.out.println("actualAnswer : " + actualAnswer);
	}

	@Then("Tell me {string}")
	public void tell_me(String expectedAnswer) {
		assertEquals(expectedAnswer, actualAnswer);
	}

}
