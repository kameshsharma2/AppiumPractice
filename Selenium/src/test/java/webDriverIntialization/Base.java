package webDriverIntialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	 
	public static void main(String[] args) {
		//WebDriver Initialization		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();	
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("kamesh.sharma2@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Sreenivasa1");
		driver.findElement(By.name("login")).click();
		System.out.println("Script Executed Successfully");
	}
}