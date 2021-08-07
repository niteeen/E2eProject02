package E2EP2.E2EProject_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Basicbrw;

public class Alerts_pop {
	
	WebDriver driver;
	
	
	@Test
	public void Alerts() throws InterruptedException {
		driver=Basicbrw.sendBrowser();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
	// Below is for ok alert 	
		driver.findElement(By.cssSelector("#alertbtn")).click();
	    String alerttext=	driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alerttext);
		
		
	//Below is for conform button	
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		String conformtext=	driver.switchTo().alert().getText();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		System.out.println(conformtext);
		
		
	
		driver.close();
		
		
		
		
	}
	
	
	
	

}
