package testNG;

import org.testng.annotations.Test;

public class GroupingExample {


	// group any two phones

	// groups is used to ccreate groups

	//rest xxml lla paru 

	@Test(groups = {"Apple"})
	public void appleIphone() {

		System.out.println("This is Iphone");

	}

	@Test(groups = {"Apple"})
	public void appleIpad() {

		System.out.println("This is Ipad");

	}

	@Test
	public void motoRocker() {

		System.out.println("This is moto rocker phone");

	}

	@Test
	public void motoHeadPhones() {

		System.out.println("This is headphones");

	}

	@Test(groups = {"samsung"})
	public void samsungS10() {

		System.out.println("This is samsungs10");

	}

	@Test(groups = {"samsung"})
	public void samsungS20() {

		System.out.println("This is samsungs20");

	}

}
