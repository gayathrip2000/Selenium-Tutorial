package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxTutorial {
	
 public static void main(String[] args)  {
		 
		 System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	     
	     driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
	     
	     WebElement radio1= driver.findElement(By.xpath("/html/body/article/section/div[4]/form/div/span[4]/input"));
//	     WebElement radio2= driver.findElement(By.id("vehicle2"));
//	     WebElement radio3= driver.findElement(By.id("vehicle3"));
	     
	     radio1.click();
//	     radio2.click();
//	     radio3.click();
//	     
	     
	     WebElement cradio1= driver.findElement(By.xpath("/html/body/article/section/div[4]/form/div/span[4]/input"));
	     
	     
	     if(cradio1.isSelected()== true) {
	    	 System.out.println("Microsfot excel is checked");
	     }
	     
	     else {
	    	 System.out.println("Microsfot excel is not checked");
	     }
	     
	     
	     
	     
	     
	     
 }

}
