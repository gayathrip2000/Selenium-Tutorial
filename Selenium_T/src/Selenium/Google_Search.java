package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Search {
	
	 public static void main(String[] args) throws InterruptedException {
		 
		 System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	     
	     driver.get("https://www.google.com/");
	     driver.findElement(By.name ("q")).sendKeys("sliit" + Keys.ENTER);
	     Thread.sleep(50000);
	     driver.close();
	 }

}
