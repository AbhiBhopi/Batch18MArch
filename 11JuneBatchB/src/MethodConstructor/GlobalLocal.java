package MethodConstructor;

public class GlobalLocal {
	
  int a=54; ; // global variable declared outside method
	
	public void Demo(){
		int b =89; // local variable declared inside method
		int a=87;
		System.out.println(a);
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public void Demo1() {
		int c=56;  // local variable declared inside method
		int b= 45;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		
	
	GlobalLocal x = new GlobalLocal();
	System.out.println(x.a);
	x.Demo(); // 78,89
	x.Demo1(); // 78,45,56
	
	
	}	

}
