package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title=driver.getTitle();
		if (title.contains("Dashboard")) {
			System.out.println("title verified");
		} else {
System.out.println("wrong title");

		}
		
		driver.navigate().back();
		Boolean button=driver.findElement(By.xpath("//span[text()='Disabled']/parent::button")).isEnabled();
		if (button==true) {
			System.out.println("Button is enabled");
		} else {
System.out.println("button is disabled");
		}
		
		System.out.println("position of the submit button is :" +driver.findElement(By.xpath("//span[text()='Submit']/ancestor::button[1]")).getLocation());
		String color=driver.findElement(By.xpath("//span[text()='Save']/parent::button")).getCssValue("color");
		System.out.println("Colour of the element :" +color);
		
		System.out.println("the width and height of the element" +driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']")).getSize());
		
		
		
		driver.close();
		
		
		
		
	}

}
