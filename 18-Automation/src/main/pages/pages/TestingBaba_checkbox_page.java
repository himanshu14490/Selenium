package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;
import waitutility.Waitutility;

public class TestingBaba_checkbox_page extends Baselibrary {
	
	public TestingBaba_checkbox_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement practicbtnclick;
	
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement clickonelementbtn;
	
	@FindBy(xpath="//*[text()='check box']")
	private WebElement clickoncheckbox;
	
	@FindBy(xpath="//*[@id=\"tab_2\"]/div/iframe")
	private WebElement iframe;

	@FindBy(xpath="//*[@onclick=\"myFunction()\"]")
	private WebElement checkmobile;
	
	public void clickonclosebtn() {
		closebtn.click();
		practicbtnclick.click();
	}

	public void clickonelementstab() {
		clickonelementbtn.click();
	}
	
	public void clickoncheckbox() {
		clickoncheckbox.click();
	}
	
	public void enterifram() {
	
		driver.switchTo().frame(iframe);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		checkmobile.click();
		
	}
	
	
}
