package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import net.bytebuddy.implementation.bind.MethodNameEqualityResolver;
import screenshotUtility.Screenutility;

public class Baselibrary {

	public static WebDriver driver;

	public void getlaunch(String url) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\git\\Selenium\\Sailclear-Automation\\driver\\chromedriver.exe");
		
		

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@AfterTest
	public void Teardown() {
		//driver.quit();
	}

	@AfterMethod
	public void getresultanalysis(ITestResult result) {
		String methodmethod = result.getMethod().getMethodName();
		if (result.isSuccess()) {
			Screenutility.getscreenshot("passed", methodmethod);

		}
		else if(result.getStatus()==ITestResult.FAILURE) 
		{
			Screenutility.getscreenshot("failed", methodmethod);
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			Screenutility.getscreenshot("skipped", methodmethod);
		}

	}

}
