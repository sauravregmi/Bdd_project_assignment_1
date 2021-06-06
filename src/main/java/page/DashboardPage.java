package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a")
	WebElement BankAndCash;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement NewAccount;
	

	
	public void clickBankAndCashTab() {
		BankAndCash.click();
	}
	public void newAccoutTab() {
		NewAccount.click();
	}
}
