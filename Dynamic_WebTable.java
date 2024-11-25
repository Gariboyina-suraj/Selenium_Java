package Selenium.topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		//Instantiating WebDriver
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Suraj G/Desktop/driver/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		
		//code to get the table element
		
		WebElement table=driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		//code to get the no of rows of table 
		
		List<WebElement> rows=driver.findElements(By.xpath("//tbody/tr"));
		System.out.println("No of rows : "+ rows.size());
		
		//code top get no of columns of table 
		
		List<WebElement> columns=driver.findElements(By.xpath("//thead/tr/th"));
		System.out.println("No of columns of table : "+ columns.size());
		
		// code to go to particular cell of web table
		// lets retrieve 4th column 5th row cell
		WebElement ElementWeWant=driver.findElement(By.xpath("//tbody/tr[5]/td[4]"));
		System.out.println("value of 5th row 4th column cell is : "+ ElementWeWant.getText());
		
		//Get Maximum of all the Values in a Column of Dynamic Table
		float Max=0;
		for(int i=1;i<=rows.size();i++) {
			String s=driver.findElement(By.xpath("//tbody/tr["+i+"]/td[4]")).getText();
//			System.out.println(s);
			float number=Float.parseFloat(s);
			if(number>Max) {
				Max=number;
			}else {
				continue;
			}
		}
		
		System.out.println("Max number is : "+ Max);
		
		// get all elements of table 
		
		driver.get("https://demo.guru99.com/test/table.html");
		WebElement table2=driver.findElement(By.xpath("//table"));
		List<WebElement> rows2=driver.findElements(By.xpath("//tr"));
		
		for(int i=1;i<=rows2.size();i++) {
			List<WebElement> columns2=driver.findElements(By.xpath("//tr["+i+"]/td"));
			System.out.println("No of cells in row "+ i +" is : "+columns2.size());
			int c_size=columns2.size();
			for(int j=1;j<=c_size;j++) {
				WebElement cell=driver.findElement(By.xpath("//tr["+i+"]/td["+j+"]"));
				String s=cell.getText();
				System.out.println("cell value of row number "+ i+" and column number "+j+" is : "+s);
			}
		}
		
		
		
		
		

	}

}
