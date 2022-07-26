package MethodConstructor;

public class Default {
	
	static int a=10;
	int b=20;
	
	
	public static void main(String[] args) {
		System.out.println("static variable = "+a); // calling static variable 
		
		Default x = new Default();
		System.out.println("Non static variable with x ref = "+x.b);
		Default y = new Default();
		System.out.println("Non static variable with y ref = "+y.b);
		
		x.b = 30;
		System.out.println("Non static variable with x ref updated = "+x.b);
		System.out.println("Non static variable with y ref updated = "+y.b);
		
		System.out.println("static variable with x ref  = "+x.a);
		System.out.println("static variable with x ref  = "+y.a);
		x.a = 60;
		System.out.println("static variable with x ref updated  = "+x.a);
		System.out.println("static variable with x ref updated  = "+y.a);
	}
   
	

}
