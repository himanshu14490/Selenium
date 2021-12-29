package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Sailclear_login_page extends Baselibrary {

	public Sailclear_login_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='btn-get-started animated fadeInUp scrollto']")
	private WebElement clickonlogin;

	@FindBy(xpath = "//*[@formcontrolname='Email']")
	private WebElement enterusername;

	@FindBy(xpath = "//*[@formcontrolname=\"Password\"]")
	private WebElement enterpswd;

	@FindBy(xpath = "//*[@type=\"submit\"]")
	private WebElement click_loginbtn;

	public void clickonlogin() {
		clickonlogin.click();
	}

	public void enterusername() {
		enterusername.sendKeys("himanshu00@yopmail.com");

	}

	public void enterpassword() {
		enterpswd.sendKeys("Himanshu@123");
	}

	public void clickonsumbit_login() {
		click_loginbtn.click();
	}

}
