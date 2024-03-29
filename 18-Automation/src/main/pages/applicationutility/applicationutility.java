package applicationutility;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baselibrary.Baselibrary;

public class applicationutility extends Baselibrary {

	public static void doubleclick(WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();

	}

	public static void rightclick(WebElement ele) {
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();

	}

	public static void clickme(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
	}

	public static void changewindow(int tabno) {

		Set<String> dd = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(dd);
		driver.switchTo().window(tabs.get(tabno));

	}

}
