package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Del {

	public static void main(String[] args) throws InterruptedException {
	
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			Thread.sleep(3000);
			System.out.println("Success");
			driver.findElement(By.xpath("//div/a[@title='Shop Now!' ]/div[@class='_10pg75']")).click();
			Thread.sleep(3000);
			System.out.println("Success2");
			driver.quit();
//			driver.manage().window().maximize();
//			driver.findElement(By.xpath("(//div/a[@title='From ₹399'][@class='_6WQwDJ T88g6k'])[1]")).click();
	}

}
