package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picUploading.BaseMain;

public class HomePage extends BaseMain {

	@FindBy(id = "Email")
	private WebElement _emailId;

	@FindBy(id = "next")
	private WebElement _nxtButton;
	@FindBy(id = "Passwd")
	private WebElement _password;

	@FindBy(id = "signIn")
	private WebElement _signInButton;

	@FindBy(xpath = "//a[contains(text(),'Inbox (17)')]")
	private WebElement _inboxTxt;

	public void enterEmailId() {
		_emailId.sendKeys("ksruthi2807");
	}

	public void ClickOnNxt() {
		_nxtButton.click();
	}

	public void enterPasswrd() {
		_password.sendKeys("akshitha");
	}

	public void ClickOnSignIn() {
		_signInButton.click();
	}

	public void signIn() {
		enterEmailId();
		ClickOnNxt();
		enterPasswrd();
		ClickOnSignIn();

	}

	public boolean isInboxTxtDisplayed() {
		return _inboxTxt.isDisplayed();
	}

}
