package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	@Given("Add Place Payload")
	public void add_Place_Payload() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Add Place Payload method is invoked");
	}

	@When("User calls {string} with Post method")
	public void user_calls_with_Post_method(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user_calls_with_Post_method with " + string + " is invoked");
	}

	@Then("Successful response with {string} = {string}")
	public void successful_response_with_statuscode(String string1, String string2) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("successful_respons with " + string1 + " is invoked " + string2);
	}

	@Then("Check {string} is {string}")
	public void check_is(String string3, String string4) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("successful_response with " + string3 + " is invoked " + string4);
	}
}