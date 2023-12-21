package tutorial;
import baseClass.WebDiverIntialization;
public class BrowserActions extends WebDiverIntialization {

	public static void browserActions(){
		
		//Browser Navigation 
		driver.navigate().to("https://www.w3schools.com/");
		driver.navigate().to("https://stackoverflow.com/questions/62929/java-net-socketexception-connection-reset");
	
		//Will navigate to google website 
		driver.navigate().back();
		System.out.println("Back success");
		
		//will navigate to w3 schools
		driver.navigate().forward();
		System.out.println("Forward success");
		driver.navigate().refresh();
	}
	
	public static void main(String[] args) {
		ChromeDriver();
		browserActions();
		quit();
	
	}
}
