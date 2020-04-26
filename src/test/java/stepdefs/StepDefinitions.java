package stepdefs;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.WaitHelper;
import pages.LoginPage;

public class StepDefinitions extends TestBase {

	LoginPage loginPage = new LoginPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	@Given("^I am on the Login page URL \"([^\"]*)\"$")
	public void i_am_on_the_Login_page_URL(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@Then("^I click on sign in button and wait for sign in page$")
	public void i_click_on_sign_in_button_and_wait_for_sign_in_page() throws Throwable {
		loginPage.clickSignInButton();
		waitHelper.WaitForElement(loginPage.userName, 60);
	}

	@Then("^I should see Sign In Page$")
	public void i_should_see_Sign_In_Page() throws Throwable {
		loginPage.userName.isDisplayed();
	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable {
		loginPage.enterUserName(arg1);
	}

	@When("^I Click on Continue button$")
	public void i_Click_on_Continue_button() throws Throwable {
		loginPage.clickContinueButton();
		waitHelper.WaitForElement(loginPage.password, 60);
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg1) throws Throwable {
		loginPage.enterPassword(arg1);
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		loginPage.clickLoginButton();
		// check authentication
		loginPage.clickContinueButton();
	}

	@When("^I am logged in")
	public void i_am_already_logged_in() throws Throwable {
		loginPage.logoutBtn.isDisplayed();
	}

}