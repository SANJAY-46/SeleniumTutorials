package testNG;

import org.testng.annotations.Test;

public class SetPriority {

	// output la alphabatecal order la print panum method ah so priority set panrom to execute in a sequence way 

	//  drive a car nu example papom

	//	Priority nu oru attribute pass pnrom

	@Test(priority=0)
	public void startEngine() {

		System.out.println("Start The Engine");
	}
	@Test(priority=1)
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
