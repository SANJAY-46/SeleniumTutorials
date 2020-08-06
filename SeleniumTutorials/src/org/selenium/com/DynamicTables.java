package org.selenium.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");

		//1.get the number of count of columns

		List<WebElement> noOfColumns=driver.findElements(By.tagName("th"));

		//th na column in a table

		int size = noOfColumns.size();

		System.out.println("No of column in this table are :"  +size);

		//2. get the number off count off rows

		List<WebElement>noofRows=driver.findElements(By.tagName("tr"));

		int size2 = noofRows.size();

		System.out.println("The no of rows in this table are :" +size2);

		//3. get the value of an element by selleting another element next to that row

		WebElement valueOf=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));

		//x path explanation : td na row ula irukarathu . normalize space is to take aay spcae in front and back , following na next box ah kandu pudika

		String value=valueOf.getText();

		System.out.println("The element next is "  +value);

		//4.find the least value in the vital task and click the check box next to it 

		List<WebElement> progressBar=driver.findElements(By.xpath("//td[2]"));

		int size3 = progressBar.size();

		System.out.println(size3);

		//td2 nu xpath la kudatha td2 la iruk ela values vandhurum

		List<Integer> numberList = new ArrayList<Integer>();

		//above line ehuku na  kila line la itterate avum bt athula lleast value venum na store avanum la td oda full list athuku dan above line

		for (WebElement x : progressBar) {

			String text = x.getText().replace("%", "");

			//% special charc ah consider panuthu so no format exception varum

			numberList.add(Integer.parseInt(text));

			//abov line ethu na number list la itertae avra values ah add panrom bt intergar dan venum nu kekuthu so string ah integer ha convert panrom
		}
		
		System.out.println("All value in td2 is :" +numberList);

		Integer min = Collections.min(numberList);
		
		// collections la dan min nu method so min value kandu pudikalam

		System.out.println("Min value in progressbaris :"  +min);
		
		String xPath = Integer.toString(min)+"%";
		
		//String finalXpath = "//td[normalize-space()= "+""/" +xPath" + "/""+"]"+"//following::td[1]";
		
		//System.out.println(finalXpath);
		
		//above line la xpath la min ah pota avarala so again integer ah string ah mathurom
		
				
				////td[normalize-space()='30%']following::td[1]
	}

}
