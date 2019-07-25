package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		WebElement UN = driver.findElement(By.name("userName"));
		
		UN.getSize();
		if(UN.isEnabled())
		{
			UN.sendKeys("sunil");
			Thread.sleep(3000);
			UN.clear();
			UN.sendKeys("Manipal");
			
		}
		if(UN.isDisplayed())
		{
			//get the username and print the username
		
			String name = UN.getAttribute("value");
			System.out.println("This will get the attribute of thr value -> "+name);
			
			String name1 = UN.getAttribute("name");
			driver.findElement(By.name(name1)).clear();
			System.out.println("This will get the attribute of the name -> "+name1);
			
			String type = UN.getAttribute("type");
			System.out.println(type);
			
			String label1 = driver.findElement(By.xpath("//*[contains(text(),'User')]")).getText();
			
			System.out.println(label1);
			
		}
		
		
	
		//driver.findElement(By.name("password")).sendKeys("sunil");
		
		//driver.findElement(By.name("login")).click();
		
}
}
