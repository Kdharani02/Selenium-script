package WebDriver;

import java.awt.AWTException;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
				
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(text(),'Gmail')]")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		//driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		
		System.out.println("Total no of tabs: "+tabs.size());
		
		driver.switchTo().window(tabs.get(1));
		
		String gmailtitle = driver.getTitle();
		
		System.out.println("Title of gmail page: "+gmailtitle);
		
		driver.switchTo().window(tabs.get(0));
		
		String googletitle = driver.getTitle();
		
		System.out.println("Title of google page: "+googletitle);
		
		if(gmailtitle.equals(googletitle))
		{
			System.out.println("Both the titles are same");
		}
		else
		{
			System.out.println("Both the titles are not same");
		}
		
		
	
		/*Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_TAB);*/	
	}

}
