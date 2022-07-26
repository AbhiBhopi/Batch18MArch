package AbstractConcret;

public class Multiple implements A,B{
	
	public void Display() {
		System.out.println("Display Implementation class");
		
	}
	
	public void Show() {
		System.out.println("Show Implementation class");
	}
	
   public void Add() {
	   int a = 56;
	   int b = 54;
	   int c= a+b;
	   System.out.println(c);
    	
    }
	
	public void Division() {
		  int a = 100;
		   int b = 20;
		   int c= a/b;
		   System.out.println(c);
	    	
	}
	
}
