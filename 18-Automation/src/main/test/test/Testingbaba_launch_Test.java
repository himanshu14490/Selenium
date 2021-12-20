package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_launch_page;
import propertyutility.PropertyUtility;

public class Testingbaba_launch_Test extends Baselibrary {

	Testingbaba_launch_page ob;

	@BeforeTest
	public void launcTestingbaba() {
		
		String url = PropertyUtility.getreadproperty("url");
		System.out.println(url);
		getlaunch(url);
		ob = new Testingbaba_launch_page();
		ob.clickonclosebtn();

	}

	@Test
	public void getttile() throws Exception {

		ob.gettitle();
	}

  
}
