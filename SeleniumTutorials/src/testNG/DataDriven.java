package testNG;


//data driven na simplea ena na u give all the data required here so that u no need to change or write 4 test cases sepeprately 
//login in example ku 4 test case eleutha thva ila lines ah reduce panduchu

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	String[][]data= {

			{"san","y"},

			{"jay","san"},

			{"admin","admin123"},

			{"Admin","admin123"},

	};

	// above line la 4 possibilites declare panrom log in ku 

	// using matrix methos as string we decalre so ipo inagye execute avum

	@DataProvider(name="logIn")
	public String[][] logInDataProvider () {
		return data;

		// oru methodn create pani mela ieuka string data va ing vangrom
	}




	// vangitu atha data povider ah kila test oda sync panrom simpple 


	@Test(dataProvider = "logIn")
	public void loginButton ( String uName,String pWord) {

		// sting uname and string pword send keys kudukurom la kila anga ponum nu inagye declare panrom

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys(uName);

		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(pWord);

		WebElement logINButoon=driver.findElement(By.id("btnLogin"));

		logINButoon.click();


	}


}
