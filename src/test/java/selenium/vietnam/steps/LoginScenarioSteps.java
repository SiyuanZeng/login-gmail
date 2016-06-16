package selenium.vietnam.steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import selenium.vietnam.steps.serenity.UserSteps;

import org.junit.Assert;

public class LoginScenarioSteps {
	
	@Steps
	UserSteps userStep;
	
	@Given("^I am on home page$")
	public void i_am_on_home_page() throws Throwable {
		userStep.open_home_page();
		
	}

	@When("^I input my account is \"([^\"]*)\"$")
	public void i_input_my_account_is(String email) throws Throwable {
		userStep.input_email(email);
	}

	@When("^click button Next$")
	public void click_button_Next() throws Throwable {
	    userStep.click_on_login();
	}
	
	@When("^click button signIn$")
	public void click_button_signIn() throws Throwable {
	    userStep.click_signIn();
	}
	
	@When("^I input password is \"([^\"]*)\"$")
	public void i_input_password_is(String password) throws Throwable {
	    userStep.input_password(password);
	}
	
	@Then("^I should see alert message \"([^\"]*)\"$")
	public void i_should_see_alert_message(String actual_Msg) throws Throwable {
		Assert.assertEquals(userStep.getAlertMsg(), actual_Msg);
	}
	@Then("^Alert message is \"([^\"]*)\"$")
	public void alert_message_is(String actual_Msg_Passwd) throws Throwable {
		Assert.assertEquals(userStep.getAlertMsgPasswd(), actual_Msg_Passwd);
	}
}
