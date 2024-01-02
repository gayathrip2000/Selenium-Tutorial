package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
 public static void main(String[] args)  {
		 
		 System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	     
	     driver.get("https://semantic-ui.com/modules/dropdown.html");
	     
	     
	     WebElement dropdown1= driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[4]/div[1]/div[2]/div"));
	     Select select1 = new Select(dropdown1);
	     
	     
	     select1.selectByIndex(1);
	     
	     
	     
 }

}
