package steps;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import page.CreateNewAccountPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginStepDef {
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	CreateNewAccountPage createNewAccountPage;

	
	Random rnd = new Random();
	int randomNum = rnd.nextInt(999);

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on the Techfios login page$")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=login/");
	}

	@Given("^User is on the \"([^\"]*)\" login page$")
	public void user_is_on_the_login_page(String page) throws InterruptedException {
		if (page.equalsIgnoreCase("Techfios")) {
			driver.get("https://techfios.com/billing/?ng=login/");
		} else if (page.equalsIgnoreCase("GoogleSearch")) {
			driver.get("https://www.google.com");

		}
		Thread.sleep(1000);

		driver.get("https://techfios.com/billing/?ng=login/");
	}

	@When("^user enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws Throwable {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(username);
		Thread.sleep(2000);
	}

	@When("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterPassword(password);
		Thread.sleep(2000);
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String userName, String password) throws Throwable {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
	}

	@When("^user clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.clickOnSignInButton();
		Thread.sleep(2000);
	}

	@Then("^user should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() throws Throwable {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		loginPage.takeScreenshotAtEndOfTest(driver);
		Thread.sleep(1000);
	}

	@When("^user clicks on Bank and Cash$")
	public void user_clicks_on_Bank_and_Cash() throws Throwable {
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.clickBankAndCashTab();
		Thread.sleep(1000);
	}

	@When("^user clicks on New Account$")
	public void user_clicks_on_New_Account() throws Throwable {
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.newAccoutTab();
		Thread.sleep(1000);
	}

	@Then("^user should land on Accounts page$")
	public void user_should_land_on_Accounts_page() throws Throwable {
		String expectedTitle = "Accounts- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		loginPage.takeScreenshotAtEndOfTest(driver);
		Thread.sleep(1000);

	}

	@Then("^user should fill account title as \"([^\"]*)\"$")
	public void user_should_fill_account_title_as(String checking) throws Throwable {
		createNewAccountPage = PageFactory.initElements(driver, CreateNewAccountPage.class);
		createNewAccountPage.addAccountTitle(checking + randomNum);
		Thread.sleep(1000);
	}

	@Then("^user should fill description as \"([^\"]*)\"$")
	public void user_should_fill_description_as(String description) throws Throwable {
		createNewAccountPage = PageFactory.initElements(driver, CreateNewAccountPage.class);
		createNewAccountPage.addAccountDescription(description);
		Thread.sleep(1000);
	}

	@Then("^user should fill initial balance as \"([^\"]*)\"$")
	public void user_should_fill_initial_balance_as(String initialBalance) throws Throwable {
		createNewAccountPage = PageFactory.initElements(driver, CreateNewAccountPage.class);
		createNewAccountPage.addInitialBalance(initialBalance);
		Thread.sleep(1000);
	}

	@Then("^user should fill account number as \"([^\"]*)\"$")
	public void user_should_fill_account_number_as(String accountNumber) throws Throwable {
		createNewAccountPage = PageFactory.initElements(driver, CreateNewAccountPage.class);
		createNewAccountPage.addAccountNumber(accountNumber+ randomNum);
		Thread.sleep(1000);
	}

	@Then("^user should fill contact person as \"([^\"]*)\"$")
	public void user_should_fill_contact_person_as(String contactPerson) throws Throwable {
		createNewAccountPage = PageFactory.initElements(driver, CreateNewAccountPage.class);
		createNewAccountPage.addContactPerson(contactPerson);
		Thread.sleep(1000);
	}

	@Then("^user should fill phone number as \"([^\"]*)\"$")
	public void user_should_fill_phone_number_as(String phoneNumber) throws Throwable {
		createNewAccountPage = PageFactory.initElements(driver, CreateNewAccountPage.class);
		createNewAccountPage.addPhoneNumber(phoneNumber);
		Thread.sleep(1000);
	}

	@Then("^user should fill internet banking url as \"([^\"]*)\"$")
	public void user_should_fill_internet_banking_url_as(String URL) throws Throwable {
		createNewAccountPage = PageFactory.initElements(driver, CreateNewAccountPage.class);
		createNewAccountPage.addBankingUrl(URL);
		Thread.sleep(1000);
	}

	@Then("^user should click on submit button$")
	public void user_should_click_on_submit_button() throws Throwable {
		createNewAccountPage = PageFactory.initElements(driver, CreateNewAccountPage.class);
		createNewAccountPage.clickOnSubmitButton();
		Thread.sleep(1000);
	}

	// @After
	public void tearDown() {

		driver.close();
		driver.quit();

	}

}
