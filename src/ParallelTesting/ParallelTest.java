package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParallelTest {

	public static void main(String[] args) {

		userloginpage();
		userloginpage1();
		userloginpage2();
	}

	public static void userloginpage() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html?e=1");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("kesavasubash");

	}

	public static void userloginpage1() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html?e=1");
		driver.manage().window().maximize();
		driver.findElement(By.name("password")).sendKeys("subash");
	}

	public static void userloginpage2() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html?e=1");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("kesavasubash");
		driver.findElement(By.name("password")).sendKeys("subash");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
