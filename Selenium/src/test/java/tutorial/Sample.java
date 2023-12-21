package tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://appium.io/docs/en/2.0/intro/drivers/");
		driver.manage().window().maximize();
		
		List <WebElement> obj = driver.findElements(By.tagName("a"));
		System.out.println("Objects length is "+ obj.size());
		for (int i=0; i<=obj.size()-1; i++) {
			System.out.println("The links are "+ obj.get(i).getAttribute("href"));
			System.out.println("The links are "+ obj.get(i).getText());
		}
		driver.quit();
	}

}
