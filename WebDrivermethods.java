package seleniumprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivermethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getPageSource());
	    System.out.println(driver.getTitle());
		

	}

}
