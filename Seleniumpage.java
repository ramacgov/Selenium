package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWebdrivermanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		//.firefoxdriver().setup();
		//.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
				//ChromeDriver();
		
		driver.get("Http://google.com");
		driver.close();
		
	}
