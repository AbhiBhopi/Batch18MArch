package Inheritance;

public class This {
	
	int a =67;  // global variable
	
	public void demo() {
		
		int a = 35; // local variable
		System.out.println(a);
		System.out.println(this.a); // access global variable value from same class
		
	}
	
	
	

}
