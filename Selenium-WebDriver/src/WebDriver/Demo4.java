package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		
		/*WebElement Performance = driver.findElement(By.id("menu__Performance"));

		Actions act = new Actions(driver);
		
		act.moveToElement(Performance).build().perform();  //menu_performance_viewEmployeePerformanceTrackerList
		
		driver.findElement(By.id("menu_performance_viewEmployeePerformanceTrackerList")).click();
		
		driver.findElement(By.linkText("Performance")).click();*/
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		for(WebElement e:links)
		{
			String text = e.getTagName();
			System.out.println(text);
		}
			
	}

}
