package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinksallongooglpage {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int link_count=links.size();
		System.out.println("No. of links are on google home page "+link_count);
		for(WebElement L1:links) {
			System.out.println(L1.getAttribute("href"));
		}

	}

}
