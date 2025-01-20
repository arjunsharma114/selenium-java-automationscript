package seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonfacebook {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement cssvalue=driver.findElement(By.xpath("//a[contains(text(),'Create new')]"));
		System.out.println(cssvalue.getCssValue("color"));
		driver.findElement(By.xpath("//a[contains(text(),'Create new')]")).click();
		List<WebElement> radio_button=driver.findElements(By.xpath("//span[@data-name='gender_wrapper']//label//input"));
		for(int i=0;i<radio_button.size();i++) {
			radio_button.get(i).click();
		}
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
	}

}
