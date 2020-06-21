package handlingalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopupHandle {

	@Test
	public void AlertHandle() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://mail.rediff.com/cgi-bin/login.cgi";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println("---------------------------------");
		System.out.println(alert.getText());
		System.out.println("---------------------------------");
		String text = alert.getText();
		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct alert message");
		} else {

			System.out.println("in correct alert");
		}
		alert.accept();
	}
}
