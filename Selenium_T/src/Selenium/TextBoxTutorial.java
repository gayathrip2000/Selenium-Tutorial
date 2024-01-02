package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxTutorial {
	
	 public static void main(String[] args) {
	
	
	 System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
     
     
     driver.get("https://www.jobsite.lk/feedback");
     
     //driver.findElement(By.id("jform_contact_name")).sendKeys("Gayathri");
     WebElement name = driver.findElement(By.id("jform_contact_name"));
     name.sendKeys("Gayathri");
     
     WebElement email = driver.findElement(By.xpath("//*[@id=\"jform_contact_email\"]"));
     email.sendKeys("gayathrigamage@gmai.com");
     
     
     WebElement subject = driver.findElement(By.id("jform_contact_emailmsg"));
     subject.sendKeys("hi");
     
     
     WebElement msg = driver.findElement(By.id("jform_contact_message"));
     msg.sendKeys("hi all"+Keys.ENTER);
     
     
     
     
     	
     
     
     
	 }

}
