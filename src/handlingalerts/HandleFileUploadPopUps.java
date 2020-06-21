package handlingalerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleFileUploadPopUps {

	@Test
	public void fileuploadpopups() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://html.com/input-type-file/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("fileupload")).sendKeys("C://Users//kesava//Downloads//Testing.txt");

	}

}
