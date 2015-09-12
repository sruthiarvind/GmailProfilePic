package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picUploading.BaseMain;

public class InboxPage extends BaseMain {

	@FindBy(xpath = "//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")
	private WebElement _picIcon;

	@FindBy(xpath = "//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/a/span")
	private WebElement _changePhoto;

	@FindBy(xpath = "//*[@id=':f.select-files-button']/div")
	private WebElement _select;

	public void clickOnPicIcon() {
		_picIcon.click();
	}

	public void ClickOnChangePhoto() {
		_changePhoto.click();

	}

	public void clickOnSelectPhoto() {
		_select.sendKeys("C:/Users/arvindkumar/Documents.jpg");
	}

	public void changingProfilePic() {
		clickOnPicIcon();
		ClickOnChangePhoto();
		clickOnSelectPhoto();
	}
}
