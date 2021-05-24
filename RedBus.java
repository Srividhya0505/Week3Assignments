package week3.assignment;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
   
public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
				
		driver.findElementByXPath("//input [@data-message = 'Please enter a source city']").sendKeys("C");
		driver.findElementByXPath("//li [@data-no= '2']").click();
		WebElement webelement = (driver.findElementByXPath("//input [@data-message = 'Please enter a destination city']"));
          webelement.sendKeys("a");
          Thread.sleep(1000);
          webelement.sendKeys(Keys.TAB);
	      webelement.sendKeys(Keys.ENTER);
	   // driver.findElementById("rb-calendar_A");
	      driver.findElementByXPath("//input [@id='onward_cal']");
	      Thread.sleep(1000);
	       driver.findElementByCssSelector("td.next").click();
	       Thread.sleep(1000);
	       driver.findElementByXPath("//table[@class ='rb-monthTable first last']//tr[3]/td[2]").click();
	       driver.findElementByXPath("//button[contains(text(), 'Search Buses')]").click();
	       Thread.sleep(1000);
	       String noofBuses = driver.findElementByXPath("//span [@class='f-bold busFound']").getText();   
	       System.out.println("No of Buses:"+ "  " + noofBuses);
	       
		 //Sleeper only
		  driver.findElementByXPath("//label [@for = 'bt_SLEEPER'] [2]").click();
		  String noofSleeperBuses = driver.findElementByXPath("//span [@class ='f-bold busFound']").getText();
		     System.out.println("No of Sleeper Buses:"+"   " + noofSleeperBuses);
		     
		 //AC Classes added
		 driver.findElementByXPath("//label [@for = 'bt_AC'][2]").click();
		 String noofACBuseswithSleeper = driver.findElementByXPath("//span [@class = 'f-bold busFound']").getText();
		        System.out.println("No of AC Buses:"+"   "+ noofACBuseswithSleeper);
		        
		}
		
		
	


}


