package baseClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDiverIntialization {

	public static WebDriver driver;
	
	public static void ChromeDriver()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Chrome Browser Launched success");

	}

	public static void EdgeDriver()
	{		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();	
		driver.get("https://www.google.com/");
		System.out.println("Edge Browser Launched success");
	}

	public static void FireFoxDriver()
	{		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();		
		driver.get("https://www.google.com/");
		System.out.println("Firefox Browser Launched success");
	}
	public static void quit() {
		driver.quit();
	}

}
