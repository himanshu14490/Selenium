package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;

import pages.Sailclear_weapon_page;

public class Sailclear_weapon_test extends Baselibrary {

	Sailclear_weapon_page ob;

	@BeforeTest
	public void launchsailclear() {

		getlaunch("https://sailclear-test.cclec.org");
		ob = new Sailclear_weapon_page();
	}

	@Test(priority = 0)
	public void clickonlogin() {

		ob.clickonlogin();
	}

	@Test(priority = 1)
	public void enterusername() {
		ob.enterusername();
	}

	@Test(priority = 2)
	public void enterpassword() {
		ob.enterpassword();
	}

	@Test(priority = 3)
	public void clickonsubmit() {
		ob.clickonsumbit_login();
	}
	
	@Test(priority=4, enabled=true)
	public void clickonweaponlist() {
		ob.clickonweaponlist();
	}
	
	@Test(priority=5,enabled=true)
	public void clickonaddnewweapon() {
		ob.addnewweapon();
	}
	@Test(priority=6,enabled=true)
	public void enterweaponinfo() {
		ob.enterweaponinfo();
	}
	
	//@Test(priority=7,enabled=false)
	//public void clickonsaveweapon() {
		//ob.clickonweaponsave();
		
	//}
}
