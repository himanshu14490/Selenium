package applicationUtitlity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import baselibrary.Baselibrary;

public class Applicationutility extends Baselibrary {

	public static void doubleclick(WebElement ele) {

		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}

	public static void rightclick(WebElement ele) {

		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}

	public static void main(WebElement ele, String value) {
		Select dropdown = new Select(ele);
		dropdown.selectByVisibleText(value);
	}

	public static void dropdown(WebElement ele, int value) {

		Select dropdown = new Select(ele);
		dropdown.selectByIndex(value);
	}
	
	

}
