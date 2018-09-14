package Execution;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObject.GoogleWebSite;
import testCases.GoogleSearchTest;
import utilities.DriverBuilder;
import utilities.DriverType;

public class MainExecution {
	public static void main(String[] args) {
		/*WebDriver driver;
		
		driver = new DriverBuilder(DriverType.Chrome)
				.withDefaultOptions()
				.build();
		
		try {
			driver.navigate().to("https://www.google.com.mx");
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		 WebElement elemnt = GoogleWebSite.HomePage.pageElements(driver, "q", "name");
		 elemnt.sendKeys("Hexaware");
		 elemnt.sendKeys(Keys.ENTER);
		 elemnt = GoogleWebSite.HomePage.pageElements(driver, "Hexaware - IT, BPO", "partial");
		 elemnt.click();*/
		
		new GoogleSearchTest(DriverType.Chrome);
	}
}
