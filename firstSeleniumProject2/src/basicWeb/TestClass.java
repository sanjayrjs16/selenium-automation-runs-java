package basicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("JBL Flip");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(2000);
		
		WebElement priceRangeDropDown = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
		Select dropdown = new Select(priceRangeDropDown);
		Thread.sleep(2000);
		dropdown.selectByIndex(0);
		 
		
	}

}
