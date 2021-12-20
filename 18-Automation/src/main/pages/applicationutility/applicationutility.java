package applicationutility;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baselibrary.Baselibrary;

public class applicationutility extends Baselibrary {
	
	public static void doubleclick(WebElement ele) 
	{
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
		
	}
	
	public static void rightclick(WebElement ele) 
	{
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		
	}
	
	
	
	

}
