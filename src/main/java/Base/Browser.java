package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import Utility.CommonFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser extends CommonFile{
		protected static WebDriver driver;
//This is for Repo Demo
		public void initilization() throws Exception {
		/*	System.setProperty("webdriver.http.factory", "jdk-http-client");
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			DesiredCapabilities cp = new DesiredCapabilities();
			cp.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(cp);
			driver = new ChromeDriver(options);

			driver.get(readExcelFileFinal(3, 1));
			driver.manage().window().maximize();*/
			
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless"); // Enable headless mode
			options.addArguments("--disable-gpu"); // Disable GPU usage

			// Set the path to the ChromeDriver executable
			System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

			// Create a new instance of ChromeDriver with the headless options
			WebDriver driver = new ChromeDriver(options);
			
			// Example: Open a website and print the page title
			driver.get("https://www.example.com");
			System.out.println("Page title: " + driver.getTitle());

			
		}
	


}
