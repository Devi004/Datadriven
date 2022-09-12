package chintu.aug15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exam2 {

	public static void main(String[] args)throws Throwable{
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.flipkart.com/'");
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		WebElement ele=driver.findElement(By.linkText("About Us"));
		js.executeScript("return document.ScrollIntoview", "ele");
		ele.click();
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		driver.close();
		
				

	}

}
