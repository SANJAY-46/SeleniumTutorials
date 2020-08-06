package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

// task 1 : open google page 
// task  2 : open facebook
// task  3 : open instagram

public class SuiteExample {

	WebDriver driver;

	long currentTime;
	
	long endTime;
	
	// webdriver driver nu en inga thranum na before suite kula irukum pothu angaye driver yarunu nu mudinjirum
	// so cLASS kila declare pana whole program kum thereyum


	// SUITE - IS A COLLECTION OF TEST CASES 
	// BEFORESUITE - IS TO EXECUTE BEFORE THE TEST CASES 
	// AFTERSUITE - IS TO EXEFUTE AFTER THE TEST CASES
	// TO KNOW THE TIME TAKEN = 

	@BeforeSuite

	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		driver =new ChromeDriver();

		// before suite en intha three lines na oru vati browser open pana podhum la adan 

		// to reducce time 

		currentTime = System.currentTimeMillis();

		// evalo time aguthu nu therinjuka


	}

	@Test


	public void openGoogle(){

		driver.get("https://www.google.co.in/");

	}

	@Test
	public void openFacebook(){

		driver.get("https://www.facebook.com/");

	}

	@Test
	public void openInstagram(){

		driver.get("https://www.instagram.com/accounts/login/?hl=en");

	}


	@AfterSuite

	public void closeBrowser() {

		driver.quit();
		
		endTime = System.currentTimeMillis();
		
		long totalTime=endTime-currentTime;
		
		// above line to find the time taken 
		
		System.out.println("TOTAL TIME TAKEN IS: "  +totalTime);

	}

}


