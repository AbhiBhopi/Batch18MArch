package MethodConstructor;

public class sample1 {// non static method call from same class
	
	public static void main(String[] args) {
		
	
		System.out.println("Main method started");
		sample1 s1 = new sample1(); // object creation 
		 s1.m1();
		 s1.m2();
		stat();
		System.out.println("Main method ended");
		
	}
      public void m1() {  // non static method need to create object for calling
   		System.out.println("Running m1 non static method");
   	}
   	
   	public void m2() { // non static method need to create object for calling
   		System.out.println("Running M2 non static  Method");
   	}
       
      public static void stat() {
    	  System.out.println("running static method");
      }

}
