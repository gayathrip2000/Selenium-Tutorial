package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonTutorial {

	
	 public static void main(String[] args)  {
		 
		 System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	     
	     driver.get("https://www.dofactory.com/html/button/id");
	     
	     //find position
	     WebElement alertbutton =  driver.findElement(By.id("alert-button"));
	     int xValue = alertbutton.getLocation().getX();
	     int yValue = alertbutton.getLocation().getY();
	     
	     System.out.println("X value is: " +xValue);
	     System.out.println("X value is: " +yValue);
	     
	     
	     
	     //find the color
	     WebElement colorbutton = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div[2]/button[1]"));
	     String color = colorbutton.getCssValue("background");
	     System.out.println("Color is : " +color);
	     
	     
	     WebElement sizeButton = driver.findElement(By.id("alert-button"));
	     int width = sizeButton.getSize().getWidth();
	     int height = sizeButton.getSize().getHeight();
	     
	     
	     System.out.println("Width is : " +width);
	     System.out.println("Height is : " +height);
	     
	     
	     WebElement live= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div[2]/button[1]"));
	     live.click();
	     
	     
	     
	     
	     
	     
	 }
}
