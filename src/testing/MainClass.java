package testing;

import org.openqa.selenium.WebDriver;

public class MainClass {
	public static WebDriver driver;
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "/Users/archa/Downloads/chromedriver_win32/chromedriver.exe");
	    System.setProperty("webdriver.gecko.driver", "/Users/archa/Downloads/geckodriver-v0.31.0-win64/geckodriver.exe");
	    System.setProperty("webdriver.edge.driver", "/Users/archa/Downloads/edgedriver_win64/msedgedriver.exe");
	    
	    SwitchBrowser.toChromeDriver();
	    TestingIRCTC irctc= new TestingIRCTC();
	    irctc.startTesting();
	    
	}
	
}
