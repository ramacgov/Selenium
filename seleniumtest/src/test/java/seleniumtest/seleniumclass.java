package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class seleniumclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\7J4333897\\Desktop\\Driver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//Webdriver Browser Commands
		WebDriver Driver = new ChromeDriver();
		//Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Driver.get("https://www.google.com");
		Driver.manage().window().maximize();
		String title = Driver.getTitle();
		System.out.println("The page title is : " +title);
		String CurrentUrl = Driver.getCurrentUrl();
		System.out.println("The page URL is : " +CurrentUrl);
		String PageSource = Driver.getPageSource();
		System.out.println("The page Source is : " +PageSource);
		Driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Test");
		
		//Webdriver Browser Commands
		//Driver.navigate().to("https://www.DemoQA.com");
		//Driver.navigate().forward();
		//Driver.navigate().back();
		//Driver.wait(2000);
		Driver.close();
	}
	

}
