package chintu.aug15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		
		Select ele=new Select(driver.findElement(By.id("searchDropdownBox")));
		
		List<WebElement>ele1=ele.getOptions();
		
		for (WebElement i : ele1) {
			
			
			System.out.println(i.getText());
			
		}

	}

}
