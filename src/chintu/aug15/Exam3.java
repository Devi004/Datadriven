package chintu.aug15;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam3 {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		String st=js.executeScript("return document.URL").toString();
		System.out.println(st);
		js.executeScript("document.querySelector(\"#txtUsername\").value='Admin'");
		js.executeScript("document.querySelector(\"#txtPassword\").value='Qedge123!@#'");
		js.executeScript("document.querySelector(\"#btnLogin\").click()");
		Thread.sleep(5000);
		driver.close();
		
		

		
	}

}
