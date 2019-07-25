package WebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("mercurysignon.php")).click();
		/*List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		int size = allLinks.size();
		
		for(int i=0;i<size;i++) {
			//System.out.println(allLinks.get(i).getText());
			
			//String expected = "SIGN-ON";
			
			allLinks.get(i).click();
			
			driver.findElement(By.partialLinkText("Contains"));*/
				
			
		}
		
	
		
		

	}


