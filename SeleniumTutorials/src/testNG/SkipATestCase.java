package testNG;

import org.testng.annotations.Test;

public class SkipATestCase {
	
	
	//oru test case a skip ananum na ena panalam nu
	
	//default aah enabled true la ieukum so enabled false nu kuduthom na antha test case execute avathu thats all
	
	// test case 2 la paru
	
	@Test(priority=0)
	
	public void startEngine() {

		System.out.println("Start The Engine");
	}
	
	@Test(priority=1,enabled = false)
	
	public void putFirstGear() {

		System.out.println("Put the First Gear ");
	}
	@Test(priority=2)
	public void putSecondGear() {

		System.out.println("Put the second gear");
	}
	@Test(priority=3)
	public void putNeutral() {

		System.out.println("Put Neutral");
	}

	@Test(priority=4)
	public void turnOffEngine() {

		System.out.println("Turn of engine");
	}
}


