package tutorial;
import java.time.Duration;

import org.openqa.selenium.By;

import baseClass.WebDiverIntialization;
public class GetCommands_ElementStatus extends WebDiverIntialization{

	
	public static void driverCommands() {
		driver.get("https://practice.automationtesting.in/");
		String url = driver.getCurrentUrl();//getPageSource, getWindowHangdles are more methods
		String Title = driver.getTitle();
		System.out.println("The url is "+ url+ " and The title is "+ Title);
	}
	public static void checkElementStatus() {
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Checking Display Status
		boolean DisplayStatus =	driver.findElement(By.xpath("//input[@id='small-searchterms']")).isDisplayed();
		System.out.println("The Display Status is: "+DisplayStatus); 
		
		//Checking Enable Status
		boolean EnableStatus =	driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		System.out.println("The Display Status is: "+EnableStatus); 
		
		//RegisterPage
		driver.findElement(By.xpath("//div/ul/li/a[@class = 'ico-register']")).click();
		driver.findElement(By.xpath("//input[@value ='M']")).click();
		boolean SelectStatus =	driver.findElement(By.xpath("//input[@value ='M']")).isSelected();
		System.out.println("The Display Status is: "+SelectStatus);
	}
	
	public static void main(String[] args) {
		ChromeDriver(); 
		driverCommands();
		checkElementStatus();
		quit();

	}

}
