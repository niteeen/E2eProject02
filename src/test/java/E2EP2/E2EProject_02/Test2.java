package E2EP2.E2EProject_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	
	WebDriver driver;
	
	
	@Test
	public void gg() {
		
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		 driver.get("http://www.qaclickacademy.com/");
		
		
		
		
	};
	
	
	
	

}
