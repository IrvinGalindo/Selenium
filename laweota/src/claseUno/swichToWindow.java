package claseUno;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class swichToWindow {
	static WebDriver driver;
	
	public static void main(String asd[]) {

		
		String driverPath = "C:\\Users\\Training\\Desktop\\Testing exercise\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebElement element;
		Select s;

		// Instancear el driver del navegador a usar
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Verificar que entro a la pagina
		try {
			/*
			 * Navigate o get La diferencia es que navigate se espera a que primero se abra
			 * el navegador y el get no
			 */
			driver.navigate().to("https://www.demoqa.com/frames-and-windows/");
			// driver.get("https://www.demoqa.com/registratiton");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	
	element = driver.findElement(By.id("ui-id-2"));
	element.click();
	
	element = driver.findElement(By.xpath("//*[text() = \"Open New Seprate Window\"]"));
	element.click();
	
	SwitchToWindows();
	
	element = driver.findElement(By.className("dt-mobile-menu-icon"));
	element.click();
	
	}
	
	public static void SwitchToWindows() {
		String currWin = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		windows.remove(currWin);
		
		for(String x: windows) {
			if(x != currWin) {
				driver.switchTo().window(x);
			}
		}
	}
}
