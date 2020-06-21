package mousemovement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingMenuSubMenu {

	@Test
	public void menusubmenu() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String url = "http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146";
		driver.get(url);
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.className("menulink"))).click();
		

	}

}
