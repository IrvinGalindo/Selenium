package orbitz;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Examen {
	static WebDriver driver;
	public static void main(String[] args) {
		
		String driverPath = "C:\\Users\\Training\\Desktop\\Testing exercise\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebElement element;
		JavascriptExecutor jse;

		// Instancear el driver del navegador a usar
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		jse = (JavascriptExecutor)driver;
	
		//Verificar que entro a la pagina
		try {
			/*
			 * Navigate o get La diferencia es que navigate se espera a que primero se abra
			 * el navegador y el get no
			 */
			driver.navigate().to("https://www.orbitz.com/");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		element = driver.findElement(By.id("package-origin-hp-package"));
		element.sendKeys("Monterrey, Nuevo Leon, Mexico");
	
		
		element = driver.findElement(By.id("package-destination-hp-package"));
		element.sendKeys("Cabo San Lucas Country Club, Cabo San Lucas, Baja California Sur, Mexico");
	
		/*waits(3);
		element = driver.findElement(By.cssSelector("#typeaheadDataPlain li:first-child a"));
		element.click();*/
		
		
		element = driver.findElement(By.id("package-departing-hp-package"));
		element.sendKeys("09/14/2018");
	
		
		element = driver.findElement(By.id("package-returning-hp-package"));
		element.sendKeys("16/14/2018");

		
		element = driver.findElement(By.id("search-button-hp-package"));
		element.click();
		
		waits(10);
		element = driver.findElement(By.cssSelector(".container article:first-child"));
		element.click();
		
		waits(10);
		SwitchToWindows();
		
		jse.executeScript("window.scrollBy(0,500);");
		
		element = driver.findElement(By.xpath("//a[@data-track-page=\"HOT.PHIS.RoomsAndRates.Select1\"]"));
		element.click();
		
		waits(10);
		
		element = driver.findElement(By.cssSelector(".segmented-list li:first-child button"));
		element.click();
		
		element = driver.findElement(By.cssSelector(".segmented-list li:first-child button"));
		element.click();
		
	}
	
	public static void waits(int s) {
		driver.manage().timeouts().implicitlyWait(s, TimeUnit.SECONDS);
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
