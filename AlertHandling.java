package Selenium.topics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	public static void main(String[] args){
		// TODO Auto-generated method stub

		//Instantiating WebDriver

		System.setProperty("webdriver.chrome.driver", "C:/Users/Suraj G/Desktop/driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		
		
		// simple alert
		
		driver.findElement(By.id("accept")).click();
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		
		//confirm alert
		// it may be accepted and dismissed
		
		driver.findElement(By.id("confirm")).click();
		Alert alert2=driver.switchTo().alert();
		alert2.dismiss();
		
		//prompt alert
		
		driver.findElement(By.id("prompt")).click();
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys("suraj");
		alert3.accept();
		
		driver.quit();
		
		
		
		
	}
}
