package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromelaunchinggmailaccount {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.close();; sdet2 branch
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
 }

}
