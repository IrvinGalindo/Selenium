package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverBuilder {
	private DriverType driverType;
	private String[] defaultOptions;
	
	public DriverBuilder(DriverType driverType) {
		this.driverType = driverType;
	}
	
	public DriverBuilder withDefaultOptions() {
		switch (driverType) {
		case Chrome:
			defaultOptions = new String[] {"--start-maximized", "incognito", 
					"disable-extensions", "default-notifications"};
			break;

		default:
			break;
		}
		
		return this;
	}
	
	public WebDriver build() {
		WebDriver driver = null;
		
		switch (driverType) {
		case Chrome:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Desktop\\Testing exercise\\Selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments(defaultOptions);
			driver = new ChromeDriver(options);
			break;

		default:
			break;
		}
		
		return driver;
	}
}
