package AllLinksOnaWebPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IdentifyAllLinksOnWebPage {

	// Collect all the links in the web page based on <a> tag.
	// Identify all links in a webpage and store them in List.

	WebDriver driver;

	@Test
	public void AllLinks() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.tagName("span"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {

			System.out.println(links.get(7).getText());

		}

	}

}
