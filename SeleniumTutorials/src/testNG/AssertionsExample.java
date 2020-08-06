package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

//Assertions main ah developers unit testing ku use panuvaganga nammo avalova use pana matom 


public class AssertionsExample {

	@Test
	public void checkEqual() {

		String name="Sanjay";

		//NORMAL TYPE

		//if (name.equals("Sanjay")) {

		//System.out.println("Yes it is equal");

		//}else {

		//	System.out.println("no , it is not equal");
		//}
		
		// ASSERTION TYPE
		
		
		Assert.assertEquals(name, "Sanjay");




	}

}
