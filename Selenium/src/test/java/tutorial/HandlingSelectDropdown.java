package tutorial;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseClass.WebDiverIntialization;
public class HandlingSelectDropdown extends WebDiverIntialization {

	public static void method1() {

		//Opens url
		driver.navigate().to("http://omayo.blogspot.com/");

		//Selecting select dropdown 
		WebElement Title= driver.findElement(By.id("drop1"));

		//select class is holding the dropdown list values
		Select titlevalue = new Select(Title); 

		//accessing the methods select by visible text or attribute or value based on requirements
		titlevalue.selectByIndex(3); //Select any by value, attribute or text
		System.out.println("Selected Successfully");
		

		List <WebElement> dropdown= titlevalue.getOptions();
		for(WebElement drp:dropdown){
			System.out.println(drp);
		}
		
	}

	public static void main(String[] args) {	
		ChromeDriver();
		method1();
		quit();
	}
}
