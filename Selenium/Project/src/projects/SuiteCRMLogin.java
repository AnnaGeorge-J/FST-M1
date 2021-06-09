package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SuiteCRMLogin {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		//System.setProperty(“webdriver.gecko.driver”,Path of the GeckoDriver file”);
		
		//System.setProperty("webdriver.gecko.driver","C:\\Windows\\System32\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Windows\\System32\\geckodriver.exe");
		driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
			
		
		driver.close();
		
		String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

      
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));

        firstName.sendKeys("Anna");
        lastName.sendKeys("George");

      
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("test@example.com");

        
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("1234567890");

      
        driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");

  
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
    }
}
	}

}