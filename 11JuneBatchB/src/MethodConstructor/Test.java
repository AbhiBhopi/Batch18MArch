package MethodConstructor;

public class Test {
	int a;  // variable declaration
	int b;
	int m;
	String name;
	String velocity;
	
	
	Test(){   // user define with zero argument
		a=50;
		b=69;
	}
	
	Test(int c ,int d){ // user define with Argument or with parameter
		
		a=c;
		b=d;
			
	}
	
	Test(int c, int d, int i){// user define with Argument or with parameter
		a=c;
		b=d;
		m=i;
		System.out.println(b);
		System.out.println("abcd");
		
	}
	
	Test(String name, String velocity){ // user define with Argument or with parameter
		
	}
	
	public void addition() {  // non static method
		System.out.println(m+a+b);
	}
	
	public void work(){
		System.out.println("name");
		System.out.println("velocity");
		
	}
	public static void main(String[] args) {
		Test t = new Test() ;
			t.addition();
			t.work();
			
			Test t1 = new Test(100 , 300);
			t1.addition();
			
			Test t2 = new Test(5000,200,700);
			//t2.addition();
			
		}
	}
	


