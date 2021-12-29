package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;

import pages.Sailclear_login_page;

public class Sailclear_login_test extends Baselibrary {
	
	Sailclear_login_page ob;
	
	@BeforeTest
	public void launchsailclear() {
		
		getlaunch("https://sailclear-test.cclec.org");
		ob= new Sailclear_login_page();
	}
	
	@Test(priority=0)
	public void clickonlogin() {
		ob.clickonlogin();
	}

	@Test(priority=1)
	public void enterusername() {
		ob.enterusername();
	}
	@Test(priority=2)
	public void enterpassword() {
		ob.enterpassword();
	}
	@Test(priority=3)
	public void clickonsubmit() {
		ob.clickonsumbit_login();
	}
	
}
