package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		driver.manage().window().maximize();
		String Expectedtitle = "OrangeHRM";
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		
		String Actualtitle = driver.getTitle();
		if(Expectedtitle.equals(Actualtitle))
		{
			driver.findElement(By.id("welcome")).click();
			//driver.findElement(By.linkText("/index.php/auth/logout")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		}
		
		else
		{
			System.out.println("Expected is not equal to Actual");
		}
		
		driver.close();
		
		

	}

	
	
}
