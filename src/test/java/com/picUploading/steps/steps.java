package com.picUploading.steps;

import org.junit.Assert;

import com.picUploading.Utils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.InboxPage;

public class steps {

	HomePage home = new HomePage();
	InboxPage inbox;

	@Given("^I am on gmail home page$")
	public void i_am_on_gmail_home_page() {
		Assert.assertTrue(new Utils().getCurrentURL());

	}

	@When("^I populate login details$")
	public void i_populate_login_details() {

		home.signIn();

	}

	@Then("^I check page title is inbox$")
	public void i_check_page_title_is_inbox() {
		Assert.assertTrue(home.isInboxTxtDisplayed());

	}

	@Then("^I must be able to upload a photo$")
	public void i_must_be_able_to_upload_a_photo() {
		inbox = new InboxPage();
		inbox.changingProfilePic();

	}

	@Given("^I am on inbox page$")
	public void i_am_on_inbox_page() {

	}

	@When("^I click on change photo$")
	public void i_click_on_change_photo() {

	}

}
