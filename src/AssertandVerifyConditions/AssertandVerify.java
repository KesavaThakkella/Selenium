package AssertandVerifyConditions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertandVerify {

	WebDriver driver;

	// reference link:
	// https://www.softwaretestingmaterial.com/difference-between-assert-and-verify/

	@Test
	public void Assertcondition() { // Hard assertion

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		String title = "Software testing material";
		String gettitle = driver.getTitle();
		System.out.println(title);
		System.out.println(gettitle);
		System.out.println("Assertion starts here");
		try {
			Assert.assertEquals("titile", "gettitle");

		} catch (Throwable e) {

			System.out.println("Print nextstep");

		}
		driver.close();

	}
}
