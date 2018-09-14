package claseUno;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DominosOrdered {
 
	public static void main(String[] args) {
		WebDriver driver;
		WebElement element;
		String driverPath = "C:\\Users\\Training\\Desktop\\Testing exercise\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wbw = new WebDriverWait(driver, 10);
		
		try {
			driver.navigate().to("http://dominos.com.mx/");
		}catch (Exception e) {
			e.getMessage();
		}
		
		
		element = driver.findElement(By.xpath("(//button[text() = \"Ordenar ahora\"])[1]"));
		element.click();
	
		
		element = driver.findElement(By.id("btnContinue"));
		element.click();
		
		wait(5);
		element = driver.findElement(By.id("deliveryInstructions"));
		element.sendKeys("Texto");
		
		element = driver.findElement(By.id("streetNumber"));
		element.sendKeys("100");
		
		element = driver.findElement(By.id("internalNumber"));
		element.sendKeys("asdf");
		
		wait(5);
		element = driver.findElement(By.id("btnContinue"));
		element.click();
		
		//wait(5);
		element = driver.findElement(By.id("zoom-effect"));
		element.click();
		
		element = driver.findElement(By.id("btn_next_0"));
		element.click();
		
		element = driver.findElement(By.id("btn_next_0"));
		element.click();
		
		element = driver.findElement(By.xpath("//img[@src =\"/img2.6/flavors/PES.png\"]"));
		element.click();
		
		
		
		
	}
	
	public static void wait(int s) {
		try {
			Thread.sleep(s*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
