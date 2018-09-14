package claseUno;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Banamex {

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
		
		jse.executeScript("window.scrollBy(0,500);");
		
		element = driver.findElement(By.id("vehiculo"));
		s = new Select(element);
		s.selectByValue("AUT");
		
		wait(5);
		element = driver.findElement(By.id("marca"));
		s = new Select(element);
		s.selectByValue("PO");
		
		wait(5);
		element = driver.findElement(By.id("modelo"));
		s = new Select(element);
		s.selectByValue("2015");
		
		wait(5);
		element = driver.findElement(By.id("descripcion"));
		s = new Select(element);
		s.selectByValue("01");
		
		wait(5);
		element = driver.findElement(By.id("version"));
		s = new Select(element);
		s.selectByValue("0|01");
		
		element = driver.findElement(By.name("codigoPostal"));
		element.sendKeys("23456");
		
		element = driver.findElement(By.id("nombres"));
		element.sendKeys("John");
		
		element = driver.findElement(By.id("apellidoPaterno"));
		element.sendKeys("Smith");
		
		element = driver.findElement(By.id("apellidoMaterno"));
		element.sendKeys("Peter");
		
		element = driver.findElement(By.id("numeroCliente"));
		element.sendKeys("1234657909654");
		
		element = driver.findElement(By.id("correoElectronico"));
		element.sendKeys("Smith@gmail.com");
		
		element = driver.findElement(By.id("telefono"));
		element.sendKeys("1234567890");
		
		element = driver.findElement(By.id("avisoPrivacidad"));
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
