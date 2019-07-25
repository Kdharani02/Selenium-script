package WebDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Demo8 {


	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://realestate.upskills.in/admin");
	
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("user_login")).sendKeys("admin");
		
		driver.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		
		String title1 = driver.getTitle();
		WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy, ')]"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(link).build().perform();
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);	
		
		Thread.sleep(2000);
		
		String title2 = driver.getTitle();
		
		if(title1.equals(title2))
		{
			System.out.println("Title are same");
		}
		else
		{
			System.out.println("Title are not same");
		}
		//act.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		//act.sendKeys(Keys.ENTER).build().perform();
	
	}

}
