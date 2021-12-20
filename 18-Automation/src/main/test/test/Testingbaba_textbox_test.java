package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;

import pages.Testingbaba_textbox_page;
import propertyutility.PropertyUtility;

public class Testingbaba_textbox_test extends Baselibrary {

	Testingbaba_textbox_page ob;

	@BeforeTest
	public void launcTestingbaba() {

		String url = PropertyUtility.getreadproperty("url");
		System.out.println(url);
		getlaunch(url);
		ob = new Testingbaba_textbox_page();
		ob.clickonclosebtn();

	}

	@Test(priority = 0)
	public void getttile() throws Exception {

		ob.gettitle();
	}

	@Test(priority = 1)
	public void clickonelements() {
		ob.clickonelementstab();

	}
	@Test(priority = 2)
	public void filldetails() throws Exception {
		ob.filldeatils();
	}

	@Test(priority = 3)
	public void getverify() {
		ob.getverify_testboxdata();
	}
}
