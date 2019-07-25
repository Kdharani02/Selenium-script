package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		WebElement PIM = driver.findElement(By.id("menu_pim_viewPimModule"));
		
		Action mouseover = act.moveToElement(PIM).build();
		
		mouseover.perform();
		
		driver.findElement(By.linkText("Employee List")).click();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB).perform();
		
		/*for(int i=0;i<3;i++)
		{
			act.sendKeys(Keys.TAB).build().perform();	
		}*/
		
		//act.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
	}

}
