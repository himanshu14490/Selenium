package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.TestingBaba_webtablet_page;

import propertyutility.PropertyUtility;

public class TestingBaba_webtablet_test extends Baselibrary

{

	TestingBaba_webtablet_page ob;

	@BeforeTest
	public void launcTestingbaba() {

		String url = PropertyUtility.getreadproperty("url");
		System.out.println(url);
		getlaunch(url);
		ob = new TestingBaba_webtablet_page();
		ob.clickonclosebtn();

	}

	@Test(priority = 0)
	public void clickonelements() {
		ob.clickonelementstab();
	}
	
	@Test(priority=1)
	public void clickonwebtablet() {
		ob.clickonwebtablet();
	}
	
	@Test(priority=2)
		public void entervalue() {
			ob.enterframe();
		}
	}

