package Hooks;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Utils.LaunchWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public static LaunchWebDriver launchWebDriver;
	
	public ExtentHtmlReporter htmlReporter;
	public static ExtentReports extentReport;
	public ExtentTest test;
	
	@Before
	public void report() {
		htmlReporter = new ExtentHtmlReporter("./reports/extent.html");
		htmlReporter.config().setEncoding("UTF-8");
		htmlReporter.config().setDocumentTitle("New@Automation - Reports");
		htmlReporter.config().setReportName("Automation Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extentReport = new ExtentReports();
		extentReport.attachReporter(htmlReporter);
	}
	
	@After
	 public static void endReport() {
		extentReport.flush();
	}
	
	@Before
	 public static void setUp() {
		LaunchWebDriver.setUpDriver();
	}

	
	@After
    public static void tearDown() {
    	LaunchWebDriver.tearDown();
    }
}
