package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("http://elearning.upskills.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("admin@123");
		
		driver.findElement(By.id("form-login_submitAuth")).click();
		
		driver.findElement(By.xpath("//*[@class='list-items-admin']/li[4]/a")).click();
		
		driver.findElement(By.id("user_import_import_file")).sendKeys("C:\\Users\\IBM_ADMIN\\Documents\\Projects\\Siebel\\Environment Links.xlsx");
		
		
	}

}
