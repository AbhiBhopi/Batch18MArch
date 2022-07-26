package BasicsJAVA;

public class mock {
	
	void test() {
		
		throw new ArithmeticException(); // user define kru shkto java librries mdhe
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		int a = 10 ;
		int b = 4 ;
		int c = 0 ;
		int [] d = {12, 34, 65, 98};
		
		System.out.println("Start");
		try {
			System.out.println("try block");
			c = a/b ;
			System.out.println(d[2]);
		}	
		catch(ArithmeticException e)
		{
			System.out.println("alternative code");
			System.out.println("catch blovk");
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("end");
		
		//Exception not generated
		// try - finally - normal flow
		
		// Excpetiion generated but not handelled
		// try - finally 
		
		// Excpetiion generated and get handelled
		// try - catch - finally - nornal flow
		
	}
	
}