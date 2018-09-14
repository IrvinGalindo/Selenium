package claseUno;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	public static void main(String[] args) {

		WebDriver driver;
		String driverPath = "C:\\Users\\Training\\Desktop\\Testing exercise\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebElement element;

		// Instancear el driver del navegador a usar
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		/**
		 * Navigate o get La diferencia es que navigate se espera a que primero se abra
		 * el navegador y el get no
		 */
		try {
			driver.navigate().to("https://www.google.com");
			// driver.get("https://www.google.com.mx");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Buscar a hexaware
		element = driver.findElement(By.name("q"));
		element.sendKeys("Hexaware");
		element.sendKeys(Keys.ENTER);

		element = driver.findElement(By.partialLinkText("Hexaware - IT, BPO"));
		element.click();

		driver.quit(); // destruye, este objeto no se puede reutilizar
		driver.close(); // cierra, se puede reutilizar

	}

}
