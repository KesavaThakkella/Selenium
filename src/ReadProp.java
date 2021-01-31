import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {

		// properties is a java class
		// FileInputstream is a java class

		WebDriver driver;

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("F://pull//Selenium//src//config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("browser"));

		String browsername = prop.getProperty("broswer");

		if (browsername.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");

			driver = new ChromeDriver();
			driver.get("");

		} else {

			System.out.println("No browser is launched");
		}

		// driver.get(prop.getProperty("url")));
		// driver.findElement(By.id("url")).sendKeys(prop.getProperty("username"));
		// driver.findElement(By.name("")).sendKeys(prop.getProperty("password"));
		// driver.findElement(By.name(prop.getProperty("loginbutton"))).click();
	}

}
