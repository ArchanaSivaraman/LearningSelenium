package testing;

public class TestingIRCTC {
	public void startTesting() {
		MainClass.driver.get("https://www.irctc.co.in/nget/train-search");
		System.out.println(MainClass.driver.getTitle());
	}

}
