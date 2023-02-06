package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;

	public WebDriver webDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resource/ProppertyPackage/application.properties");
//				System.getProperty("user.dir") + "src\\test\\resource\\ProppertyPackage\\application.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("myURL");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Altorum Leren Employ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get(url);
		
		return driver;

	}
}
