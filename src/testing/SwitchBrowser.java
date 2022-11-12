package testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SwitchBrowser {
	public static void toChromeDriver() {
		MainClass.driver = new ChromeDriver();
	}

	public static void toSafari() {
        MainClass.driver = new SafariDriver();
    }
}
