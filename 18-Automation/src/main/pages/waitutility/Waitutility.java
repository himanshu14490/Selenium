package waitutility;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baselibrary.Baselibrary;

public class Waitutility extends Baselibrary
{
	public void alertIsPresent(int time)
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	

}
