package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public WebDriver driver;
	public void ChromeDriver() //ChromeDriver Initialization and opening url
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		System.out.println("Chrome Browser Launched success");
		driver.manage().window().maximize();
	}

	public void LocatorsExample() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a")).click();//Creating account 
		driver.findElement(By.xpath("//*[@id = 'firstname']")).sendKeys("Kamesh");// First Name field
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Kompella");// Last Name field	
		Thread.sleep(5000);
		
	}

	public void Quit() {
		driver.quit();
	}

	//Main Method execution starts
	public static void main(String[] args) throws InterruptedException { 
		Locators obj = new Locators();

		//ChromeDriver Initializes
		obj.ChromeDriver();

		//Locators to find the elements
		obj.LocatorsExample();

		//Quitting the browser	
		obj.Quit();


	}

}


/*
 * By Id – Locates element using id attribute of the web element.
 * 
 * WebElement element = driver.findElement(By.id("elementId")); 2. By className
 * – Locates the web element using className attribute.
 * 
 * WebElement element = driver.findElement(By.className("objectClass")); 3. By
 * tagName – Locates the web element using its HTML tag like div, a, input etc.
 * 
 * WebElement element = driver.findElement(By.tagName("a")); 4. By name –
 * Locates the web element using name attribute.
 * 
 * WebElement element = driver.findElement(By.name("male")); 5. By linkText –
 * Locates the web element of link type using their text.
 * 
 * WebElement element = driver.findElement(By.linkText("Click Here")); 6. By
 * partialLinkText – Locates the web element of link type with partial matching
 * of text.
 * 
 * WebElement element = driver.findElement(By.partialLinkText("Click")); 7. By
 * cssSelector – Locates the web element using css its CSS Selector
 * patterns(explained in detailed here – CSS Locators).
 * 
 * WebElement element = driver.findElement(By.cssSelector("div#id")); 8. By
 * xpath – Locates the web element using its XPaths(explained in detailed here
 * XPath Locators).
 * 
 * WebElement element = driver.findElement(By.xpath("//div[@id='id']"));
 */