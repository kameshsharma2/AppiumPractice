package tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.WebDiverIntialization;
import baseClass.WebDiverIntialization;

public class BootstrapDropdown extends WebDiverIntialization{

	public static void main(String[] args) {
	driver.navigate().to("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		List <WebElement> BootstrapDownload= driver.findElements(By.xpath("(//div[@class='dropdown'])[1]"));
		for(WebElement dropdown:BootstrapDownload) {
		String Text= dropdown.getText();
		}
	}

}
