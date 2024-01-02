package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumRadioButton {
	

	 public static void main(String[] args)  {
		 
		 System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	     
	     driver.get("https://www.wufoo.com/html5/radio-type/");
	     
	     WebElement test =driver.findElement(By.xpath("//*[@id=\"main\"]/section[1]/div/form/label[1]/input "));
	     test.click();
	 }
	 
	  
}
