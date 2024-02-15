package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://leafground.com/checkbox.xhtml");
    
driver.findElement(By.xpath("//span[text()='Basic']")).click();
Boolean basic=driver.findElement(By.xpath("//input[@aria-label='Basic']")).isSelected();
if (basic) {
	System.out.println("the basic checkbox is checked");
	
} else {
System.out.println("basic checkbox is not checked");
}
driver.findElement(By.xpath("//span[text()='Ajax']")).click();
Boolean ajax=driver.findElement(By.xpath("//input[@aria-label='Ajax']")).isSelected();
if (ajax) {
	System.out.println("Ajax is checked");
} else {
System.out.println("Ajax is not checked");
}

driver.findElement(By.xpath("//label[text()='Python']")).click();
if (driver.findElement(By.xpath("//input[@value='py']")).isSelected()) {
	System.out.println("Python is checked");
} else {
System.out.println("Python is not checked");
}

if (driver.findElement(By.xpath("//input[@value='c#']")).isSelected()) {
	System.out.println("C sharp is checked");
} else {
System.out.println("C sharp is not checked");
}

if(driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt102_input\']")).isEnabled()) {
	System.out.println("checkbox is enabled");
}else {
	System.out.println("checkbox is disabled");
}

driver.findElement(By.cssSelector("html>body>div>div:nth-of-type(5)>div:nth-of-type(2)>form>div>div>div:nth-of-type(4)>div>div>div>div:nth-of-type(2)")).click();
driver.findElement(By.className("ui-toggleswitch-slider")).click();
driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
if (driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt100_input\']")).isSelected()) {
	System.out.println("button is toggled ON");
} else {
System.out.println("button is toggled OFF");
}

driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
String a=driver.findElement(By.xpath("(//label[text()='London'])[2]")).getText();
String b=driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).getText();
System.out.println("The Cities selected are " +a +"\t" +b);

driver.close();
	}

}
