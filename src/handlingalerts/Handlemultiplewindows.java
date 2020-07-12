package handlingalerts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlemultiplewindows {

	@Test
	public void handlewindows() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String url = "http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html";
		driver.manage().window().maximize();
		driver.get(url);
		String parent = driver.getWindowHandle();
		
		System.out.println("===================================================================");
		System.out.println("Parent Window Handle Id :" + parent);
		System.out.println("===================================================================");
		driver.findElement(By.xpath("//div[@id='post-body-6170641642826198246']//a[1]")).click();
		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println("Total no of windows" + count);

		for (String child : allwindows) {

			if (!parent.equalsIgnoreCase(child)) {

				driver.switchTo().window(child);
				driver.findElement(By.name("q")).sendKeys("gmail.com");
				Thread.sleep(3000);
				driver.close();

			}
			driver.switchTo().window(parent);
			System.out.println("Title of the Parent" + driver.getTitle());

		}

	}

}
