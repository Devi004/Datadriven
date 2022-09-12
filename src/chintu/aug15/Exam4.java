package chintu.aug15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exam4 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://money.rediff.com/mutual-funds");
		
		
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(rows.size());
		for (int i = 1; i <rows.size(); i++) {
			
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println(cols.size());
			
			for (int j = 0; j < cols.size(); j++) {
				
				String str4=cols.get(j).getText();
				System.out.print(str4);
				
			}
			System.out.println();
			
		}
		
		
		
	
		
		

	}

}
