package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S_Tute {
	
	 public static void main(String[] args) {
	        System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        
	        driver.get("https://www.google.com/");
	        driver.close(); 
	    }

}
