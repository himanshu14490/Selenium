package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Baselibrary {

	public static WebDriver driver;

	public void getlaunch(String url) {

		driver = new ChromeDriver();

		driver.get(url);
		driver.manage().window().maximize();

	}

	@AfterTest
	public void Teardown() {

<<<<<<< HEAD
		driver.quit();
	}
=======
	//driver.quit();
	//}
>>>>>>> branch 'master' of https://github.com/himanshu14490/Selenium.git

}
