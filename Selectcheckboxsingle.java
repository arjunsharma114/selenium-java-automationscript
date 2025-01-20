package seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectcheckboxsingle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/checkboxes");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> checkbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		for(WebElement L1:checkbox) {
			L1.sendKeys(Keys.ARROW_DOWN);
			L1.sendKeys(Keys.ARROW_DOWN);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			L1.click();
		}
		driver.close();
		

	}

}
