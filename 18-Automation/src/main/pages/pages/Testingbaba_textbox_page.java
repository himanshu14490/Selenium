package pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.Baselibrary;
import propertyutility.PropertyUtility;

public class Testingbaba_textbox_page extends Baselibrary {

	ArrayList<String> li = null;

	public Testingbaba_textbox_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement practicbtnclick;

	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement clickonelementbtn;

	@FindBy(xpath = "//*[text()='text box']")
	private WebElement clickontextboxbtn;

	@FindBy(xpath = "//*[@id=\"fullname1\"]")
	private WebElement enterfullname;

	@FindBy(xpath = "//*[@id=\"fullemail1\"]")
	private WebElement enteremail;

	@FindBy(xpath = "//*[@id=\"fulladdresh1\"]")
	private WebElement entercurrentadrs;

	@FindBy(xpath = "//*[@id=\"paddresh1\"]")
	private WebElement enterperadrs;

	@FindBy(xpath = "//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")
	private WebElement clicksubmit;

	@FindBy(xpath = "//*[@class=\"col-md-6 mt-5\"]/label")
	private List<WebElement> texttabledata;

	public void gettitle() throws Exception {

		String title = driver.getTitle();
		System.out.println(title);
	}

	public void clickonclosebtn() {
		closebtn.click();
		practicbtnclick.click();
	}

	public void clickonelementstab() {
		clickonelementbtn.click();
	}

	public void filldeatils() throws Exception {
		clickontextboxbtn.click();
		String name = PropertyUtility.getreadproperty("name");
		String email = PropertyUtility.getreadproperty("email");
		String caddres = PropertyUtility.getreadproperty("currentaddress");
		String paddress = PropertyUtility.getreadproperty("permanentaddress");

		li = new ArrayList<String>();
		li.add(name);
		li.add(email);
		li.add(caddres);
		li.add(paddress);

		enterfullname.sendKeys(name);
		enteremail.sendKeys(email);
		entercurrentadrs.sendKeys(caddres);
		enterperadrs.sendKeys(paddress);
		clicksubmit.click();

		System.out.println("ending---");

	}

	public void getverify_testboxdata() {
		for (int j = 1; j < 7; j++) {
			for (String dd : li) {

				Assert.assertEquals(texttabledata.get(j).getText(), dd);
				j++;
				li.remove(dd);
				break;
			}

		}
	}
}
