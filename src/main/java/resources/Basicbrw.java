package resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Basicbrw {
	public static Properties pp;
	static WebDriver driver;
	
	
	
	public static Properties fileproperty() throws IOException
	{
		FileInputStream ff= new FileInputStream("C:\\Users\\Nitin\\eclipse-workspace\\E2EProject_02\\src\\main\\java\\baseFile\\basicInfo.properties");
		Properties pp = new Properties();
		pp.load(ff);
		return pp;	
		
	};
	
	
	
	
	public static WebDriver sendBrowser() {
		 WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		 
		 return driver;
		
		
	}
	
	
	


	}
	
	
	
	
	
	
	
	


