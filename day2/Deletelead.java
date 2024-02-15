package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deletelead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	    driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    String leadid= driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10275']")).getText();
	    System.out.println(leadid);
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	    driver.findElement(By.linkText("Delete")).click();
	   driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	   String result= driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
	    if (result.contains("No records")) {
		System.out.println("successfully deleted");	
		}
	    else {
	    	System.out.println("Not deleted");
	    }
	    
		driver.close();
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
