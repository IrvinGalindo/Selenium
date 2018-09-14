package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverHandler {
	
	static JavascriptExecutor js;
	
	public static void PerformAction(WebDriver driver, SeleniumActions action, WebElement element, String value) {
		js = ((JavascriptExecutor) driver);	
		
		switch (action) {
			case sendKey:
				Highlight(element);
				type(element, value);
				break;
			case Click:
				Highlight(element);
				click(element);
				break;
			default:
				break;
			}
	}
	
	
	private static void type(WebElement element, String value) {

		try {
			if (element != null) {
				if (value.equals("enter")) {
				element.sendKeys(Keys.ENTER);
				}else {
					element.sendKeys(value);
				}
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	private static void click(WebElement element) {
		try {
			if (element != null) {
				element.click();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void Highlight(WebElement element) {
	      String border;
	      border = "#f00 solid 5px";
	      js.executeScript("arguments[0].style.outline = '" + border + "'; ", element);
	 
	   }
}
