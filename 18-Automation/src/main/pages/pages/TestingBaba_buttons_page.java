package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baselibrary.Baselibrary;

public class TestingBaba_buttons_page extends Baselibrary {

	
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement practicbtnclick;

	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement clickonelementbtn;
	
	@FindBy(xpath = "//*[text()='buttons']")
	private WebElement clickonbutton;
	
	@FindBy(xpath = "//*[@ondblclick= 'doubletext()']")
	private WebElement doubleclick;
	
	@FindBy(xpath="//*[@oncontextmenu='righttext()']")
	private WebElement rightclick;
	
	public void clickonclosebtn() {
		closebtn.click();
		practicbtnclick.click();
	}

	public void clickonelementstab() {
		clickonelementbtn.click();
	}
	
	public void clickonbutton() {
		clickonbutton.click();
		
	}
		public void doubleclick() {
			doubleclick.click();
		}
		
		public void rightclick() {
			rightclick.click();
		}
		
	
}
