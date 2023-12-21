package tutorial;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.WebDiverIntialization;
public class FindingElements extends WebDiverIntialization{

	public static void findElement() {
		driver.navigate().to("https://demo.nopcommerce.com/");
		WebElement ExcellentButton= driver.findElement(By.xpath("//label[contains(text(),'Excellent')]"));
		ExcellentButton.click();
		System.out.println("ExcellentButton element is stored in webelement");
	}

	public static void findElements() {
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(links.size());
		for(WebElement link:links) {
			System.out.println("The links are: "+link.getText());

		}
	}
	public static void main(String[] args) {

		ChromeDriver();
		findElement();
		findElements();
		quit();
	}

}
