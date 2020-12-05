package DiffBetweenfindelementandfindelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementandFindElements {

	// with the help of find element we can locate one element on a web page.

	// Return type of find element is webelement.
	// with the help of find elements we can locate to more than one elements.
	// Return type of find elements is list of web elements.

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//input[@name='firstname']"));
		element.sendKeys("Hello");
		/*
		 * List<WebElement> element1 =
		 * driver.findElements(By.className("inputtext")); for (WebElement e :
		 * element) { e.sendKeys("Hello"); }
		 */
	}

}
