package waitutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baselibrary.Baselibrary;

public class Waitutility extends Baselibrary
{
	public static void alertIsPresent(int time)
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public static void vislibiltyofele(int time,WebElement ele) {
		WebDriverWait wait= new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	

}
