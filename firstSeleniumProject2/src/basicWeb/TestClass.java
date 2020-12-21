package basicWeb;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// setting up the basic configurations
		driver.get("https://www.amazon.com/");
		
		//logging in step 1: entering email id
//		driver.findElement(By.id("nav-link-accountList")).click();
//		driver.findElement(By.id("ap_email")).sendKeys("sanjayrjs16@gmail.com");
//		driver.findElement(By.id("continue")).click();
//				
//		//explicit wait until the enter password window comes, then entering password
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_password")));
//		driver.findElement(By.id("ap_password")).sendKeys("Patience#1");
//		driver.findElement(By.id("signInSubmit")).click();
//				
//		// explicit wait until the we approve the login from link we get on registered phone, selenium can't handle this
//		WebDriverWait wait2 = new WebDriverWait(driver,30);
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
//		
		//searching for product JBL Flip
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("JBL Flip");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		//Selecting the most Avg reviews from the filter dropdown
		String parentHandle = driver.getWindowHandle();
		WebElement priceRangeDropDown = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
		Select dropdown = new Select(priceRangeDropDown);
		dropdown.selectByIndex(3);
		
		
		
		WebElement R1 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a"));
		Actions builder = new Actions(driver);
	      
	      
	   builder.contextClick(R1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	   driver.close();

//	Set<String> handles = driver.getWindowHandles();
//	    for(String handle: handles) {  
//	  if(!handle.equals(parentHandle)) {
//		  Thread.sleep(2000);
//		  driver.switchTo().window(handle);
//		 
//	  }
//	    }
	   
		
	}

}
