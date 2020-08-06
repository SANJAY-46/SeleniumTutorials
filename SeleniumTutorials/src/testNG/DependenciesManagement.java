package testNG;


//Simple on test case should be dependent on each other 

//10th fail na 12 th poga mudiyathu 

//priotity theva ila because it is dependent 

//dependsonmthods attribute use panrom

///error varum because first run avanum la 


import org.testng.annotations.Test;

public class DependenciesManagement {
	
	
	@Test(enabled = false)
	
	public void highSchool() {

		System.out.println("10th pass");
	}
	@Test(dependsOnMethods = "highSchool")
	
	public void higherSecondarySchool() {

		System.out.println("12th pass ");
	}
	@Test(dependsOnMethods = "higherSecondarySchool")
	
	public void engineeringCollege() {

		System.out.println("Now he can join engineering ");
	}
	
}
	
	


