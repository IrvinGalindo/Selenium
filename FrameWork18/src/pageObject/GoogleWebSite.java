package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObject.GoogleWebSite.HomePage;
import utilities.DriverHandler;
import utilities.SeleniumActions;
import utilities.TypeBy;

public class GoogleWebSite {
	
	public static class HomePage  extends DriverHandler{
		
		public static void pageElements(WebDriver driver, String ByElement, TypeBy typeBy, SeleniumActions action, String value) {
			boolean noEntroCaseDef = true;
			WebElement element = null;
			
			try {
				switch (typeBy) {
				
				case name:
					element = driver.findElement(By.name(ByElement));
					break;
					
				case xpath:
					element = driver.findElement(By.xpath(ByElement));
					break;
				
				case cssSelector:
					element = driver.findElement(By.cssSelector(ByElement));
					break;
				
				case className:
					element = driver.findElement(By.className(ByElement));
					break;
				
				case partialLinkText:
					element = driver.findElement(By.partialLinkText(ByElement));
					break;
					
				case LinkText:
					element = driver.findElement(By.partialLinkText(ByElement));
					break;	
					
				case id:
					element = driver.findElement(By.partialLinkText(ByElement));
					break;

				default:
					noEntroCaseDef = false;
					System.out.println("Error de parametro");
					break;
				}
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			if (noEntroCaseDef) {
				PerformAction(driver, action, element, value);
			}
			
		}
		
	
		
		
		
	}
}
