package testNG;

import org.testng.annotations.Test;

// testNg la main method irukathu so @test use panuvom to run the programs 
// @test nu oru annotation use panrom

public class SampleTestCase { 

    @Test
	public void firstTestCase() {

		System.out.println("This is the first test case ");
	}
    @Test
	public void secondTestCase() {

		System.out.println("This is the second test case ");
	}
    @Test
	public void thirdTestCase() {

		System.out.println("This is the third test case ");
	}
    @Test
	public void fourthTestCase() {

		System.out.println("This is the fourth test case ");
	}

}
