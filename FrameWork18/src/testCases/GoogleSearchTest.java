package testCases;

import org.openqa.selenium.WebDriver;
import pageObject.GoogleWebSite.HomePage;
import utilities.DriverBuilder;
import utilities.DriverType;
import utilities.SeleniumActions;
import utilities.TypeBy;

public class GoogleSearchTest {
	WebDriver driver;
	
	
	public GoogleSearchTest(DriverType type) {
		
			driver = new DriverBuilder(type)
					.withDefaultOptions()
					.build();
					
			driver.navigate().to("https://www.google.com.mx");
			
			HomePage.pageElements(driver, "q", TypeBy.name, SeleniumActions.sendKey, "Hexaware");
			HomePage.pageElements(driver, "q", TypeBy.name, SeleniumActions.sendKey, "enter");
			HomePage.pageElements(driver, "Hexaware - IT, BPO", TypeBy.partialLinkText, SeleniumActions.Click, "0");
				
		
	}
}
