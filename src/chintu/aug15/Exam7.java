package chintu.aug15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.flipkart.com/'");
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		js.executeScript("document.querySelector(\"input[placeholder='Search for products, brands and more']\").value='mobiles'");
		js.executeScript("document.querySelector().click()");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		

	}

}
