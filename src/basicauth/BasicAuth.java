package basicauth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAuth {

	@Test
	public void auth() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
		driver.manage().window().maximize();
		driver.get(URL);

	}

}
