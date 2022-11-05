package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\7J4333897\\Desktop\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver Driver = new ChromeDriver();
		String appUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		//String appUrl = "https://www.DemoQA.com";
		Driver.get(appUrl);
	

		// Click on Registration link
		Driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("Test");
		
		
		// Go back to Home Page
		//Driver.navigate().back();

		// Go forward to Registration page
		//Driver.navigate().forward();

		// Go back to Home page
		//Driver.navigate().to(appUrl);

		// Refresh browser
		//Driver.navigate().refresh();

		// Close browser
		//Driver.close();
	
	}
	

}
