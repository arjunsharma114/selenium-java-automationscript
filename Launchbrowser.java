package seleniumprograms;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Launchbrowser {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter web browser name: ");
		String driver_name=sc.nextLine();
		WebDriver driver=null;
		if(driver_name.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.google.com");
		}
		else if(driver_name.equalsIgnoreCase("firefox")) {
			  driver=new FirefoxDriver();
			  driver.manage().window().maximize();
			  driver.get("https://www.google.com");	  
		}
		else if(driver_name.equalsIgnoreCase("safari")) {
			  driver=new SafariDriver();
			  driver.manage().window().maximize();
			  driver.get("https://www.google.com");	
		}
		else if(driver_name.equalsIgnoreCase("edge")) {
			  driver=new EdgeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://www.google.com"); 
		}
		else {
			System.out.println("Invalid Input");
		}
		driver.close();

	}

}
