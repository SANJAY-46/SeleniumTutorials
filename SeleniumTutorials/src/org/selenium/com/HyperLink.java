package org.selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLink {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		//get ku badhil ah navigat eduku na back forward refresh la use pana 
		
		//1. jus click the link 
		
		WebElement homePage=driver.findElement(By.linkText("Go to Home Page"));
		
		homePage.click();
		
		driver.navigate().back();
		
		//2.find where is the link goin without clicking 
		//athuku "href" ah edutha podhum athula irukum enga podhu nu 
		
		WebElement withoutClicking=driver.findElement(By.partialLinkText("Find where"));
		
		String attribute = withoutClicking.getAttribute("href");
		
		System.out.println("hurray i found out where ur goin:" +attribute);
		
		//3.verify whether the link is broken 
		
		WebElement verifyBroken=driver.findElement(By.linkText("Verify am I broken?"));
		
		verifyBroken.click();
		
		String title = driver.getTitle();
		
		if (title.contains("404")) {
			
			System.out.println("the link is broken");
			
			}
		
		driver.navigate().back();
		
		//4.how many link are available in this page 
		//tage name "a" nu iundha athu link avalodan
		
		List<WebElement> noOfLinks=driver.findElements(By.tagName("a"));
		
		int size = noOfLinks.size();
		
		System.out.println("no of links in this page :"  +size);
		
		//5.interact with same link name 
		
		//panalam if in same page na direct ah click kudukalam refresh ila ver page pochu na stale element error varum
		//so agin find element kudukanum same link ah irundha kuda 
		
		
		
			
		}
	}


