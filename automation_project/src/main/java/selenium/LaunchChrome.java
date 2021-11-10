package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LaunchChrome {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.phptravels.net/");
		System.out.println(driver.getTitle());
		
		
		try
		{
			Thread.sleep(5000);
			driver.findElement(By.id("tours-tab")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"tours-search\"]/div/div/div[1]/div/div/div")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Johor Bahru");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"select2-tours_city-results\"]/li")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"date\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr[3]/td[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tours-search\"]/div/div/div[3]/div/div/div")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tours-search\"]/div/div/div[3]/div/div/div/div/div[1]/div/div/div[2]/i")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tours-search\"]/div/div/div[3]/div/div/div/a")).click();
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//*[@id=\"submit\"]/span[1]")).click();
			//Thread.sleep(1000);
			
		}catch(Exception e)
		{
			System.out.println(e);
			System.out.println("ab");
		}
	}

}
