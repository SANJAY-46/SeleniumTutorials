package testNG;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class DataDriverWithExcelSheet {



	String[][]data=null;


	@DataProvider(name="logIn")
	public String[][] logInDataProvider () {
		
		data=getFromExcelSheet();
		
		return data;
		
		
	}


	public String[][] getFromExcelSheet() {

		//1.first file a import pananum

		FileInputStream file=new FileInputStream("location of the execel sheet file");

		//2. workbook ah import pananum from the above file

		Workbook work = Workbook.getWorkbook(file);

		//3.excel la sheet irukum la so entha sheet nu index pass panrom

		Sheet sheet=work.getSheet(0);

		//row count and column count edukanum la 

		int rows = sheet.getRows();
		int columns = sheet.getColumns();

		//ipo excel sheet save ana mari matrix mari read and save pananum la 

		String[][] testData=new String[rows-1][columns];

		//row-1 because heading venam columns apadiye iruntha podhum

		//ipo empty cells create airukum athula values add pananum la so itertate panrom

		for (int i = 1; i < rows ; i++) {
			//intha for loop matum data driven 4 th video pthuuru

			for (int j = 0; j < columns ; j++) {

				testData[i-1][j]=sheet.getCell(j,i).getContents();

				//0,1 varanum so inga j dan 0 so athu first

				//save avanum la so test data two dimension la 0,0 irukum so i-1 and j
             return testData;
			}

		}

		@Test(dataProvider = "logIn")
		public void loginButton ( String uName,String pWord) {


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


}
