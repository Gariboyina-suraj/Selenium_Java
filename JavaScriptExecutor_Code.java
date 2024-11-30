package Selenium.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_Code {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
	//Instantiating WebDriver
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Suraj G/Desktop/driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/");
		WebElement Username=driver.findElement(By.xpath("//input[@name='uid']"));
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		Username.sendKeys("Suraj");
		password.sendKeys("sachin");
		
		//JavaScript executor is used to perform action on webelements 
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", button);
		driver.switchTo().alert().accept();
		
		// JS is used to pop up alerts 
		
		js.executeScript("alert('helloworld')");
		driver.switchTo().alert().accept();
		
		//JavaScriptexecutor to use to scroll window 
		
		js.executeScript("window.scrollBy(0,1000);");
		
		
	}
}
