package MethodConstructor;

public class sample3 { // method with parameter
	
	public static void Addition(int a, int b ) { 
		int c = a+ b ;
		System.out.println("Addition ="+ c);
		
	}
	 public void Multiplication(int a, int b ){
		 int c = a*b;
		 System.out.println("Multiplication = "+ c );
		 
	 }
	 public static void main(String[] args) {
		System.out.println("Main method started");
		//Addition(230,70);
		Addition(54,89);
		sample3 mul = new sample3();
		mul.Multiplication(120, 50);
		
	}
	

}
