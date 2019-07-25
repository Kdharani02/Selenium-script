package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains(@name,'userName')]")).sendKeys("sunil"); //manzoor
			
		driver.findElement(By.xpath("//*[contains(@type,'password')]")).sendKeys("sunil");  //manzoor
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		WebElement radio = driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']"));
		
		if(radio.isSelected())
		{
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		}
		
		WebElement DD = driver.findElement(By.name("passCount"));
		Select sel = new Select(DD);
		List<WebElement> data = sel.getOptions();
		System.out.println(data.size());
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i).getText());
		}
			
		sel.selectByVisibleText("2"); //1st option
		Thread.sleep(2000);
		sel.selectByIndex(2); //2nd option
		Thread.sleep(2000);
		sel.selectByValue("1"); //3rd option
		
		driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		
		driver.findElement(By.name("findFlights")).click();
		
		driver.findElement(By.name("reserveFlights")).click();
		
		driver.findElement(By.name("passFirst0")).sendKeys("Dharani");

		driver.findElement(By.name("passLast0")).sendKeys("Kosuri");
		
		driver.findElement(By.name("creditnumber")).sendKeys("1234 1234 1234 1234");
		
		/*driver.findElement(By.xpath("//*[@name='bookflight']/table/tbody/tr[8]/td[2]/input")).click();
		
		driver.findElement(By.xpath("//*[@name='bookflight']/table/tbody/tr[14]/td[2]/input")).click();*/
		
		List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
		
		/*for(WebElement e:checkbox)
		{
			e.click();
		}*/
		
		checkbox.get(1).click();
		
		
	}

}
