package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.leafground.com/radio.xhtml");
driver.findElement(By.xpath("//label[text()='Chrome']")).click();
boolean cbrowser=driver.findElement(By.xpath("//input[@name='j_idt87:console1']")).isSelected();
if (cbrowser) {
System.out.println("Chrome is selected");	
}else {
	System.out.println("Chrome is not selected");
}
driver.findElement(By.xpath("//label[text()='Firefox']")).click();
if (driver.findElement(By.xpath("//input[@name='j_idt87:console1']")).isSelected()) {
	System.out.println("Chrome is still selected ");
}else {
	System.out.println("Chrome got automatically unselected");

}

boolean defaultselected=driver.findElement(By.xpath("//input[@id=\'j_idt87:console2:2\']")).isSelected();
if (defaultselected) {
	System.out.println("button is selected by default");
} else {
System.out.println("button is not selected by default");
}

if (driver.findElement(By.xpath("//input[@id=\'j_idt87:age:1\']")).isSelected()) {
System.out.println("selected by default ");	
} else {
driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();
}


driver.findElement(By.xpath("//label[text()='1-20 Years']")).click();
Thread.sleep(10000);
if (driver.findElement(By.xpath("//input[@id=\'j_idt87:age:1\']")).isSelected()) {
System.out.println("selected by default ");	
} else {
System.out.println("default button got unselected");
}







driver.close();
	}

}
