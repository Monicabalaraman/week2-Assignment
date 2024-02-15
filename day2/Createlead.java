package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createlead {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://leaftaps.com/opentaps/control/main");
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
    driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Create Lead")).click();
    driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Testleaf");
    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test");
    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Leaf");
    driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("testl");
    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("selenium");
    driver.findElement(By.id("createLeadForm_description")).sendKeys("Home assignment to create lead");
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("monica.balaraman@gmail.com");
    Select opt=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
    opt.selectByVisibleText("New York");
    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("updateLeadForm_description")).clear();
    driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Assignment to edit lead");
    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
    String viewLead = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
    System.out.println("The title of the displayed page is " +viewLead);
    driver.close();


}
}
