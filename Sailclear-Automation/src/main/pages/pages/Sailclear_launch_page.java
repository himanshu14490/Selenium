package pages;

import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Sailclear_launch_page extends Baselibrary {

	public Sailclear_launch_page() {

		PageFactory.initElements(driver, this);
	}

	public void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

}
