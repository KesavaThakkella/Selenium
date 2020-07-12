package mousemovement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {

	@Test
	public void draganddrop() {
		System.setProperty("Webdriver.chrome.driver",
				"C://Users//kesava//Downloads//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();

		WebElement sourceelement = driver.findElement(By.id("draggable"));

		WebElement targetelement = driver.findElement(By.name("droppable"));

		Actions action = new Actions(driver);

		action.clickAndHold(sourceelement).moveToElement(targetelement).release().build().perform();

		driver.close();

	}
}
