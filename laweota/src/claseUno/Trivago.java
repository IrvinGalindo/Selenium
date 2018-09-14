package claseUno;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trivago {
	public static void main(String[] args) {
		WebDriver driver;
		WebElement element;
		String driverPath = "C:\\Users\\Training\\Desktop\\Testing exercise\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		Select s;
		JavascriptExecutor jse;
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wbw = new WebDriverWait(driver, 5);
		jse = (JavascriptExecutor)driver;
		
		try {
			driver.navigate().to("https://www.segurosbanamex.com.mx/segurosBanamex/seguro-auto-banamex-contratacion-paso-uno.jsp");
		}catch (Exception e) {
			e.getMessage();
		}
		
		//jse.executeScript("window.scrollBy(0,500);");
		
	}
}
