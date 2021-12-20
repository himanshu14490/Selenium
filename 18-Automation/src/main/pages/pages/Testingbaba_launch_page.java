package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Testingbaba_launch_page extends Baselibrary {

	public Testingbaba_launch_page() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement practicbtnclick;

	public void gettitle() throws Exception {

		String title = driver.getTitle();
		System.out.println(title);
	}

	public void clickonclosebtn() {
		closebtn.click();
		practicbtnclick.click();
	}

}
