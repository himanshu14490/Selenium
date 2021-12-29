package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Sailclear_launch_page;


public class Sailclear_launch_test extends Baselibrary {

	Sailclear_launch_page ob;

	@BeforeTest
	public void launchsailclear() {

		getlaunch("https://sailclear-test.cclec.org/");
		ob = new Sailclear_launch_page();

	}
     @Test
	public void gettitleverify() {
		ob.gettitle();
		
	}

}
