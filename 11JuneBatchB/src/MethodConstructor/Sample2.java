package MethodConstructor;

public class Sample2 {
	
	 public void m3() {  // non static method call from different class
	   		System.out.println("Running non static  m3 method");
	   	}
	 
	 public static void main(String[] args) {
		 System.out.println("Main2 method started");
		 
		 sample1 s2 = new sample1();
		 s2.m1();
		 s2.m2();
		 Sample2 d = new Sample2();
		 d.m3();
		 
		 sample1.stat();
		 
		 
		 System.out.println("Main2 method ended");
		
	}
	   	

}
