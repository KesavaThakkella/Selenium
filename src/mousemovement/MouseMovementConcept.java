package mousemovement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMovementConcept {
	@Test
	public void mousemovement() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://spicejet.com");

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		driver.findElement(By.linkText("InsuranceProductDescription.aspx")).click();

	}

}
