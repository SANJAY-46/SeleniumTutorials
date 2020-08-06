package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	// apadina na ena na ipo en name print panrom but client wants a diff name apo inga change pana mudiyathu 
	// xml la change pananum athuku dan ithu 

	@Test
	@Parameters("Name")

	//this is ton import the paramter name from xml to this file 

	public void myName(String name) {

	//name ah input ah change pananum la athuku dan string name 

	System.out.println("My name is " +name);
	
	}
}
