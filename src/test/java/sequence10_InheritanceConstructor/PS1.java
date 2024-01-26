package sequence10_InheritanceConstructor;

import org.testng.annotations.Test;

public class PS1 extends PS{

	/*
	 * We can use methods defined in parent class without creating objects in child class
	 * We can pass value in called class while creating constructor so that we need to pass value in methods again
	 * 
	 * 
	 * 
	 * */
	
	
	@Test
	public void testRun() {
		
		/*
		 * Pass value to PS2 class while creating constructor
		 * so that we need pass value again while calling methods
		 * 
		 * 
		 * */
		
		//This is called parameterized constructor
		PS2 ps2 = new PS2(3);
		int i = 3;
		doThis(); // defined in parent class
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		
		
		
		System.out.println(ps2.multiplyTwo());
	}
	
	
	
	
}
