package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTutorialPart1 {
	
	 public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      
      
      driver.get("https://www.cedarville.edu/insights/computer-help/post/how-to-use-hyperlinks-and-action-buttons-in-powerpoint");
      //driver.findElement(By.linkText("Twitter")).click();
      driver.findElement(By.partialLinkText("tter")).click();
      
      Thread.sleep(50000);
	  driver.close();
      
      
	 }
}
