package seleniumprograms;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivermethodtwo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().deleteAllCookies();
		Dimension d=new Dimension(500,500);//to set dimension of windows
		driver.manage().window().setSize(d);
		Point p=new Point(250,250);
		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
		
		
	}

}
