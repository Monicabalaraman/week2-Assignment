package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leaftap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/main");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.xpath("//a[text()='Create Account']")).click();
        driver.findElement(By.id("accountName")).sendKeys("Monicabala");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        WebElement opt = driver.findElement(By.name("industryEnumId"));
        Select industry= new Select(opt);
        industry.selectByVisibleText("Computer Software");
        WebElement pick = driver.findElement(By.name("ownershipEnumId"));
        Select owner=new Select(pick);
        owner.selectByVisibleText("S-Corporation");
        WebElement choose = driver.findElement(By.name("dataSourceId"));
        Select source=new Select(choose);
        source.selectByValue("LEAD_EMPLOYEE");
        Select campaign=new Select(driver.findElement(By.id("marketingCampaignId")));
        campaign.selectByIndex(5);
        WebElement st = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select state=new Select(st);
        state.selectByValue("TX");
        driver.findElement(By.className("smallSubmit")).click();
        
        String aname = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
       if (aname.contains("Monicabalaram")) {
		System.out.println("Account name verified");
	} else {
System.out.println("Incorrect account name");
driver.close();
	}
       
	}

}
