package Inheritance;

public class sample1 {
	
	// int a= 96; global variable from super class
	
	int a ; // global variable from same class
	
	public void test(){
		
		int h=0; // local variable
		
		
		System.out.println(h); // calling local variable
		System.out.println(this.a);//calling same class variable
		//System.out.println(super.a);//calling super class global varible
		
	}
	

}
