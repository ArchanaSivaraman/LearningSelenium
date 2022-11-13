package testing;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestingIRCTC {
	public void startTesting() {
		String bangaloreStationCode = "BNC";
		String chennaiStationCode = "MAS";
		String bangaloreStationName = "BENGALURU CANT - BNC";
		String chennaiStationName = "MGR CHENNAI CTL - MAS";
		
		MainClass.driver.get("https://www.irctc.co.in/nget/train-search");
		MainClass.driver.manage().window().maximize();
		
		// closeLoginScreenIfVisible();
		enterOriginStationCode(bangaloreStationCode);
		selectOriginStationFromList(bangaloreStationName);

		enterDestinationStationCode(chennaiStationCode);
		selectDestinationStationFromList(chennaiStationName);

		tapOnSearchButton();
	}

	private void closeLoginScreenIfVisible() {
		// try {
		// 	Thread.sleep(2000);
		// } catch (InterruptedException e) {
		// 	e.printStackTrace();
		// }
		if(MainClass.driver.findElement(By.xpath("//*[@id='login_header_disable']/div/div")).isDisplayed()) {
			MainClass.driver.findElement(By.xpath("//*[@id='login_header_disable']/div/div/div[2]/a")).click();
		}
	}

	private void enterOriginStationCode(String fromStationCode) {
		MainClass.driver.findElement(By.xpath("//*[@id='origin']/span/input")).sendKeys(fromStationCode);
	}

	private void selectOriginStationFromList(String stationNameToSelect) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement dropDownElement = MainClass.driver.findElement(By.xpath("//*[@id='origin']/span/div/ul"));
		List<WebElement> stationNameList =  dropDownElement.findElements(By.tagName("li"));
		for (WebElement stationName : stationNameList) {
			if(stationName.getText().equals(stationNameToSelect)) {
				stationName.click();
				return;
			}
		}
	}

	private void enterDestinationStationCode(String fromStationCode) {
		MainClass.driver.findElement(By.xpath("//*[@id='destination']/span/input")).sendKeys(fromStationCode);
	}

	private void selectDestinationStationFromList(String stationNameToSelect) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement dropDownElement = MainClass.driver.findElement(By.xpath("//*[@id='destination']/span/div/ul"));
		List<WebElement> stationNameList =  dropDownElement.findElements(By.tagName("li"));
		for (WebElement stationName : stationNameList) {
			if(stationName.getText().equals(stationNameToSelect)) {
				stationName.click();
				return;
			}
		}
	}

	private void tapOnSearchButton() {
		List<WebElement> buttons = MainClass.driver.findElements(By.tagName("Button"));
		for (WebElement button : buttons) {
			if (button.getText().equals("Search")) {
				button.click();
				return;
			}
		}
	}

	private void stopTesting() {
		MainClass.driver.quit();
	}
}
