package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		/*
		 * Select select = new Select(day); select.selectByVisibleText("8");
		 * 
		 * Select select1 = new Select(month);
		 * select1.selectByVisibleText("Apr");
		 * 
		 * Select select2 = new Select(year);
		 * select2.selectByVisibleText("1996");
		 */

		String dob = "08-May-1996";
		String dobArr[] = dob.split("-");

		selectvaluefromdropdown(day, dobArr[0]);
		selectvaluefromdropdown(month, dobArr[1]);
		selectvaluefromdropdown(year, dobArr[2]);

	}

	public static void selectvaluefromdropdown(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByVisibleText(value);

	}
}
