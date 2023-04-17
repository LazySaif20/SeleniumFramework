//This will launch driver
package Utils;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchWebDriver {

	public static final String BROWSER = "browser";
	public static final int SHORT_WAIT = 10;
	public static final int TIME_EOUT = 30;
	public static final int PAGE_TIME_OUT = 60;

	public static WebDriverWait wait;
	public static LaunchWebDriver launchWebDriver;
	public static WebDriver driver;

	private LaunchWebDriver() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments(Arrays.asList("--no-sandbox", "--verbose", "--window-size=1920,1080",
				"--ignore-certificate-errors", "--disable-notofocations", "--remote-allow-origins=*"));
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(SHORT_WAIT));
		wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_EOUT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_TIME_OUT));
	}

	public static void LaunchUrl(String string) {
		driver.get(string);
	}

	public static WebDriver getdriver() {
		return driver;
	}

	public static void setUpDriver() {
		if (launchWebDriver == null) {
			launchWebDriver = new LaunchWebDriver();
		}
	}

	public static void tearDown() {
		if (driver != null) {
			try {
				driver.close();
				driver.quit();
			} catch (Exception e) {
				System.out.println("Error Occured While Shutting down driver");
			}
		}
		launchWebDriver = null;
	}
}
