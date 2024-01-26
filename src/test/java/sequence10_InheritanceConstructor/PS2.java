package sequence10_InheritanceConstructor;

public class PS2 extends PS3 {

	//class variable, scope is for complete class
	int a;
	
	
	//default constructor will not have arguments, and hidden
	
	
	
	/*
	 * instance variable, scope is only inside this method
	 * From child class we can pass variable value while creating this object
	 * 
	 * this = means mapping class variable in this class
	 * 
	 * super = whatever you receive in this class from calling class, 
	 * will also pass in parent class to activate
	 * 
	 * super will invoke parent class constructor.
	 * 
	 * super should be the first line inside child constructor
	 * 
	 * 
	 * 
	 * */
	
	public PS2(int a) {
		super(a);
		this.a = a;
	}
	
	
	public int increment() {
		a = a+1;
		System.out.println("a: " + a);
		return a;
	}
	
	
	public int decrement() {
		a = a-1;
		System.out.println("a: " + a);
		return a;
	}
	
	
}
