package claseUno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertsTest {
	public static void main(String[] args) {
		String driverPath = "C:\\Users\\Training\\Desktop\\Testing exercise\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebElement element;
		Select s;
		WebDriver driver;
		// Instancear el driver del navegador a usar
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Verificar que entro a la pagina
		try {
			/*
			 * Navigate o get La diferencia es que navigate se espera a que primero se abra
			 * el navegador y el get no
			 */
			driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
			// driver.get("https://www.demoqa.com/registratiton");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		// switch to iframe tag
	driver.switchTo().frame("iframeResult");
		
	element = driver.findElement(By.xpath("//button[text()=\"Try it\"]"));
	element.click();
	
	//To give the focu page to the control 
	//driver.switchTo().defaultContent();
	
	//It just to navigate alterts
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.switchTo().alert().accept();
	
	
	}

}
