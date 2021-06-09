package projects;

import org.openqa.selenium.By;

public class VerifyTable {
	tring pageTitle = driver.getTitle();
    System.out.println(pageTitle);


    String thirdHeader = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
    System.out.println("Third header text is: " + thirdHeader);

   
    String fifthHeaderColour = driver.findElement(By.xpath("//h5")).getCssValue("color");
    System.out.println("Fith header's colour is: " + fifthHeaderColour);

    String violetButtonClasses = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
    System.out.println("Violet button's classes are: " + violetButtonClasses);

  
    String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
    System.out.println("The grey button's text is: " + greyButton);

    driver.close();


}
