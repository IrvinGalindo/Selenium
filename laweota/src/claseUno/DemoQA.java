package claseUno;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQA {
	public static void main(String[] args) {

		WebDriver driver;
		String driverPath = "C:\\Users\\Training\\Desktop\\Testing exercise\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebElement element;
		Select s;

		// Instancear el driver del navegador a usar
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait varWait  = new WebDriverWait(driver, 10);
		
	
		//Verificar que entro a la pagina
		try {
			/*
			 * Navigate o get La diferencia es que navigate se espera a que primero se abra
			 * el navegador y el get no
			 */
			driver.navigate().to("https://www.demoqa.com/registration");
			// driver.get("https://www.demoqa.com/registratiton");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// id = name_3_firstname
		element = driver.findElement(By.id("name_3_firstname"));
		element.sendKeys("El irvins");
		varWait.until(ExpectedConditions.visibilityOf(element)).click();
		// id = name_3_lastname
		element = driver.findElement(By.id("name_3_lastname"));
		element.sendKeys("Galindo");
		
		//Marital State Xpath = //input[@value="single"]
		element = driver.findElement(By.xpath("//input[@value=\"single\"]"));
		element.click();
		
		//Hobby Xpath = //input[@value="dance"]
		element = driver.findElement(By.xpath("//input[@value=\"dance\"]"));
		element.click();
		
		// Select country id - dropdown_7 mexico
		element = driver.findElement(By.name("dropdown_7"));
		s = new Select(element);
		s.selectByValue("Mexico");
		
		//Select month id = mm_date_8 value = 12
		element = driver.findElement(By.id("mm_date_8"));
		s = new Select(element);
		s.selectByValue("12");
		
		//Select day id = dd_date_8 value = 23
		element = driver.findElement(By.id("dd_date_8"));
		s = new Select(element);
		s.selectByValue("23");
		
		//Select day id = yy_date_8 value = 1995
		element = driver.findElement(By.id("yy_date_8"));
		s = new Select(element);
		s.selectByValue("1995");
		
		//Write number id = phone_9 
		element = driver.findElement(By.id("phone_9"));
		element.sendKeys("8441234567");
		
		//Write username id = username
		element = driver.findElement(By.id("username"));
		element.sendKeys("El irvins");
		
		//Write email id = email_1
		element = driver.findElement(By.id("email_1"));
		element.sendKeys("lirvin@gmail.com");
		
		//Write password id = password_2
		element = driver.findElement(By.id("password_2"));
		element.sendKeys("contra123");
		
		//Write confirm password id = confirm_password_password_2
		element = driver.findElement(By.id("confirm_password_password_2"));
		element.sendKeys("contra123");
		
		//Click on the button
		element = driver.findElement(By.name("pie_submit"));
		element.click();
		

	}

}
