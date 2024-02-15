package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("Monica");
		driver.findElement(By.name("lastname")).sendKeys("braman");
		driver.findElement(By.name("reg_email__")).sendKeys("monica.balaraman@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("monica.balaraman@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("wolfstreet");
		WebElement date = driver.findElement(By.id("day"));
        Select day=new Select(date);
        day.selectByValue("9");
        WebElement opt = driver.findElement(By.id("month"));
        Select month=new Select(opt);
        month.selectByVisibleText("Mar");
        WebElement choose = driver.findElement(By.id("year"));
        Select year=new Select(choose);
        year.selectByValue("1996");
        WebElement radio = driver.findElement(By.xpath("//label[text()='Female']"));
        radio.click();
        driver.findElement(By.name("websubmit")).click();
}
}