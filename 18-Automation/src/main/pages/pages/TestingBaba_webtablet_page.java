package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;
import excelutility.Excelutility;

public class TestingBaba_webtablet_page extends Baselibrary {

	public TestingBaba_webtablet_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement practicbtnclick;

	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement clickonelementbtn;

	@FindBy(xpath = "//*[text()='web tables']")
	private WebElement clickonwebtablet;

	@FindBy(xpath = "//*[@id=\"tab_4\"]/div/iframe")
	private WebElement iframe;

	@FindBy(xpath = "//*[text()='Name:']/following::input[@name='name']")
	private WebElement entername;

	@FindBy(xpath = "//*[text()='Email:']/following::input[@name='email']")
	private WebElement enteremail;

	@FindBy(xpath = "//*[text()='Save']")
	private WebElement save;

	public void clickonclosebtn() {
		closebtn.click();
		practicbtnclick.click();
	}

	public void clickonelementstab() {
		clickonelementbtn.click();
	}

	public void clickonwebtablet() {
		clickonwebtablet.click();
	}

	public void enterframe() {
		driver.switchTo().frame(iframe);
		for (int i = 1; i <= Excelutility.rowcount(); i++) {

			entername.sendKeys(Excelutility.getdataexcel(i, 0));
			enteremail.sendKeys(Excelutility.getdataexcel(i, 1));
			save.click();

		}
	}

}
