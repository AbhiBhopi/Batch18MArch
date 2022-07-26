package MethodConstructor;

public class StatNonStat {
	
	static int a =10;
	int b= 20;
	
	public static void main(String[] args) {
		System.out.println("Static variable = "+a);
		
		StatNonStat x = new StatNonStat();  // object creation
		
		System.out.println("Non static variable with ref of x = "+ x.b);
		
		StatNonStat y = new StatNonStat();
		System.out.println("Non static variable with ref of y = "+ y.b);
		
		x.b=30;
		System.out.println("Non static variable with x ref updated = "+ x.b);
		System.out.println("Non static variable with y ref updated = "+ y.b);
		
		
		System.out.println("Static variable with x ref = "+x.a);
		System.out.println("Static variable with y ref = "+y.a);
		
		x.a = 60;
		System.out.println("Static variable with x ref updated = "+x.a);
		System.out.println("Static variable with y ref updated = "+y.a);
		
	}
	
	
	

}
