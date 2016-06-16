package selenium.vietnam.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import selenium.vietnam.pages.UserPage;

public class UserSteps extends ScenarioSteps {

	UserPage userPage;

	@Step
	public void open_home_page() {
		// Goi ham poen brower
		userPage.open();
	}

	@Step
	public void input_email(String email) {
		userPage.enter_email(email);
	}

	@Step
	public Object getAlertMsg() {
		return userPage.getErrMsg();
	}

	@Step
	public void click_on_login() {
		userPage.clickLogin();
	}

	public void input_password(String password) {
		userPage.enter_password(password);
	}

	public void click_signIn() {
		userPage.clickSignin();
		
	}

	public Object getAlertMsgPasswd() {
		return userPage.getErrMsgPasswd();
	}

}
