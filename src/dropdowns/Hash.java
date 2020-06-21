package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hash {

	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'No, thanks')]")).click();
		String title = driver.getTitle();
		System.out.println("title of the page :" + title);
		driver.findElement(By.xpath("//input[@id='holiday_category_id']")).sendKeys("Hyderabad");
		Select duration = new Select(driver.findElement(By.xpath("//select[@id='duration_d']")));
		duration.selectByVisibleText("7Nights+8Days");
	}

}