package pAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	WebDriver driver;
	
	
	public Login(WebDriver driver) {
		
		this.driver=driver;
		
	};
	
	
	By Signin= By.xpath("//a[text()='Courses']");
	
	
	
	public WebElement signinreturn() {
		
		
		return driver.findElement(Signin);
		
		
		
	};
	
	
	
	
	
	
	
	
	

}
