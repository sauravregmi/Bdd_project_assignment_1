package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateNewAccountPage {
	WebDriver driver;

	public CreateNewAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement AccountTitle;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement NewAccount;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement InitialBalance;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement PhoneNumber;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement BankingUrl;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SubmitButton;
	
	
	public void addAccountTitle(String checking) {
		AccountTitle.sendKeys(checking);
	}
	public void addAccountDescription(String description) {
		NewAccount.sendKeys(description);
	}
	public void addInitialBalance(String initialBalance) {
		InitialBalance.sendKeys(initialBalance);
	}
	public void addAccountNumber(String accountNumber) {
	
		AccountNumber.sendKeys(accountNumber );
	}
	public void addContactPerson(String contactPerson) {
		ContactPerson.sendKeys(contactPerson);
	}
	public void addPhoneNumber(String phoneNumber) {
		PhoneNumber.sendKeys(phoneNumber);
	}
	public void addBankingUrl(String bankingUrl) {
		BankingUrl.sendKeys(bankingUrl);
	}
	public void clickOnSubmitButton() {
		SubmitButton.click();
	}





}
