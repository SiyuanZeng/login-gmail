package selenium.vietnam.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://accounts.google.com")
public class UserPage extends PageObject{

	@FindBy(id="Email")
	WebElement emailField;
	
	@FindBy(id="errormsg_0_Email")
	WebElement errMsg;
	
	@FindBy(id="next")
	WebElement loginbtn;
	
	@FindBy(id="Passwd")
	WebElement passwordField;
	
	@FindBy(id="signIn")
	WebElement signInbtn;
	
	@FindBy(id="errormsg_0_Passwd")
	WebElement ErrMsg_Passwd;
	
	public void enter_email(String email) {
		emailField.sendKeys(email);
		
	}

	public Object getErrMsg() {
		return errMsg.getText();
	}

	public void clickLogin() {
		loginbtn.click();
	}

	public void enter_password(String password) {
		passwordField.sendKeys(password);
	}

	public void clickSignin() {
		signInbtn.click();
		
	}

	public Object getErrMsgPasswd() {
		return ErrMsg_Passwd.getText();
	}

}
