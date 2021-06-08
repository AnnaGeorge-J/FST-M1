package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		//System.setProperty(“webdriver.gecko.driver”,Path of the GeckoDriver file”);
		
		//System.setProperty("webdriver.gecko.driver","C:\\Windows\\System32\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Windows\\System32\\geckodriver.exe");
		driver.get("https://www.training-support.net");
			
		
		driver.close();
	}

}
