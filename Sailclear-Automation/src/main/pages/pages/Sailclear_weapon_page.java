package pages;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.examples.LinkedDropDownLists;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import applicationUtitlity.Applicationutility;
import baselibrary.Baselibrary;
import excelUtility.Excelutility;
import propertyUtitliy.Propertyutility;

public class Sailclear_weapon_page extends Baselibrary {

	ArrayList<String> expected = null;

	public Sailclear_weapon_page() {
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

	@FindBy(xpath = "//*[@id=\"content\"]/dashboard/div/div[1]/div/div[3]/a/div/span[2]")

	private WebElement clickonweaponlist;

	@FindBy(xpath = "//span[contains(text(),'Add New Weapon')]")
	private WebElement addnewweapon_click;

	@FindBy(xpath = "//*[@id=\"mat-select-value-1\"]")
	private WebElement weapontypedrpdwn;

	@FindBy(xpath = "//*[@id='mat-input-6']")
	private WebElement entermanfacturer;

	@FindBy(xpath = "//*[@id='mat-input-4']")
	private WebElement enterserialnum;

	@FindBy(xpath = "//*[@id='mat-input-7']")
	private WebElement entercaliber;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement clickonsave;

	@FindBy(xpath = "//tbody/tr/td")
	private List<WebElement> weaponlist;

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
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	public void clickonweaponlist() {
		clickonweaponlist.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void addnewweapon() {
		addnewweapon_click.click();
	}

	public void enterweaponinfo() {

		// weapontypedrpdwn.click();
		applicationUtitlity.Applicationutility.dropdown(weapontypedrpdwn, 3);

		for (int i = 0; i <= Excelutility.rowcount(); i++) {

			// weapontypedrpdwn.sendKeys(Excelutility.getdataexcel(i, 0));
			entermanfacturer.sendKeys(Excelutility.getdataexcel(i, 0));
			enterserialnum.sendKeys(Excelutility.getdataexcel(i, 1));
			entercaliber.sendKeys(Excelutility.getdataexcel(i, 2));
			clickonsave.click();
		}

		// expected = new ArrayList<String>();

		// expected.add(Propertyutility.getreadproperty("type"));
		// expected.add(Propertyutility.getreadproperty("Manufacturer"));
		// expected.add(Propertyutility.getreadproperty("SerialNumber"));
		// expected.add(Propertyutility.getreadproperty("Caliber"));

		// Applicationutility.dropdown(weapontypedrpdwn, 1);

		// entermanfacturer.sendKeys(Propertyutility.getreadproperty("Manufacturer"));
		// enterserialnum.sendKeys(Propertyutility.getreadproperty("SerialNumber"));
		// entercaliber.sendKeys(Propertyutility.getreadproperty("Caliber"));

		// }

		// public void clickonweaponsave() {
		// clickonsave.click();
		// }

		// public void getverifyweapondata() {

		// try {

		// ArrayList<String> li = new ArrayList<String>();
		// li.add(weaponlist.get(7).getText());
		// li.add(weaponlist.get(8).getText());
		// li.add(weaponlist.get(9).getText());
		// li.add(weaponlist.get(10).getText());
		// li.add(weaponlist.get(11).getText());

		// } catch (Exception e) {
		//
		// }
	}

}
