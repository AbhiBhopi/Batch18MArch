package AbstractConcret;

public class Demo1 implements Demo {  // Implementation class
	
	public void Test() {
		int a = 67;
		int b = 89;
		int c = a+b;
		System.out.println(c);
		System.out.println("Running Test method");	
	}
	
	public void Test2() {
		
		
		System.out.println("Test2 Method running");
		
	}
	
	
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		
		// d.a
		System.out.println(d.a);
		d.Test();
		d.Test2();
		
		
	}
	
	
	
	
	
	}
	
	


