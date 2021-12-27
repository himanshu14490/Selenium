package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_links_page;
import propertyutility.PropertyUtility;

public class Testingbaba_links_test extends Baselibrary {

	Testingbaba_links_page ob;

	@BeforeTest
	public void launcTestingbaba() {

		String url = PropertyUtility.getreadproperty("url");
		System.out.println(url);
		getlaunch(url);
		ob = new Testingbaba_links_page();
		ob.clickonclosebtn();

	}

	@Test(priority = 0)
	public void clickonelements() {
		ob.clickonelementstab();
	}

	@Test(priority = 1)
	public void clickonlink() {
		ob.clickonlink();
	}

	@Test(priority = 2)
	public void clickondemo() {
		ob.clickondemolink();
	}

}