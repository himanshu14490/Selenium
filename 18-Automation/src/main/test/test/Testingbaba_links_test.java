package test;

import org.testng.annotations.BeforeTest;

import baselibrary.Baselibrary;
import pages.Testingbaba_links_page;
import pages.Testingbaba_textbox_page;
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
	
	
}