package E2EP2.E2EProject_02;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pAGES.Login;
import resources.Basicbrw;

public class TestExecution extends Basicbrw {

	WebDriver driver;

	@Test
	public void executeTestcase() {
		driver = sendBrowser();

		driver.get("http://www.qaclickacademy.com");

		Login g1 = new Login(driver);
		g1.signinreturn().click();
		Set<String> windowscount = driver.getWindowHandles();
		System.out.println(windowscount.size());

		String title = driver.getTitle();

		System.out.println(title);

		Assert.assertEquals(title, "Rahul Shetty Academy");
		driver.quit();

	}

}
