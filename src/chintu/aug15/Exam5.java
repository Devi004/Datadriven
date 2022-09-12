package chintu.aug15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exam5 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		Thread.sleep(5000);
		Select sc=new Select(driver.findElement(By.id("day")));
		sc.selectByValue("4");
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Oct");
		
		new Select(driver.findElement(By.id("year"))).selectByValue("2010");
		
		

		
		

	}

}
