package Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActions {
	
	LaunchWebDriver launchWebDriver;
	
	Actions action = new Actions(LaunchWebDriver.getdriver());
	WebDriverWait wait = new WebDriverWait(LaunchWebDriver.getdriver(), Duration.ofSeconds(30));
	
	public WebElement getElement(By var) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(var));
		return LaunchWebDriver.getdriver().findElement(var);
	}
	
	public void clickOnElement(By var) {
		wait.until(ExpectedConditions.elementToBeClickable(var));
		LaunchWebDriver.getdriver().findElement(var).click();
	}
	
}
