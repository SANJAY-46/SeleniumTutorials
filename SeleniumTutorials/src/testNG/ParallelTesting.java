package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


// oru oru method execute avama parallel ha run pana porom

public class ParallelTesting {

	
	@Test
	public void opengoogle() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.co.in/");


	}
	@Test
	public void openFacebook() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");

	}
	@Test
	public void openInstagram() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.instagram.com/accounts/login/?hl=en");


	}

}
