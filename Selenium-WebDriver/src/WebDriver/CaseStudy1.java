package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("userName")).sendKeys("sunil");
		
		//driver.findElement(By.linkText("Hotels")).click();
		
		//String title = driver.getTitle();
		
		//System.out.println(title);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement e:links)
		{
			
			e.click();
			/*if(driver.getTitle().equals("Under Construction: Mercury Tours"))
			{
				System.out.println(e.getText()+" underconstruction");
			}
			else
			{
				System.out.println("working");
			}*/
			driver.navigate().back();
				
		}
		
		driver.close();
		
		
	}

}
