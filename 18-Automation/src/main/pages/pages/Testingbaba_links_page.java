package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.applicationutility;
import baselibrary.Baselibrary;

public class Testingbaba_links_page extends Baselibrary {

	public Testingbaba_links_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement practicbtnclick;
	
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement clickonelementbtn;

	@FindBy(xpath = "//*[@id=\"v-pills-tab\"]/a[6]")
	private WebElement clicklink;

	@FindBy(xpath = "//*[text()='Demo Page']")
	private WebElement clickondemolink;

	

	public void clickonclosebtn() {
		closebtn.click();
		practicbtnclick.click();
	}

	public void clickonelementstab() {
		clickonelementbtn.click();
	}

	public void clickonlink() {
		applicationutility.clickme(clicklink);
	}

	public void clickondemolink() {
		applicationutility.clickme(clickondemolink);
		applicationutility.changewindow(0);
	}
}