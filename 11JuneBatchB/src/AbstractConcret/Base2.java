package AbstractConcret;

public class Base2 extends Base1 {
	
	// Implementation of incomplete method from abstract class Base1
	public void whatsApp() {  
		System.out.println("Method WhatsApp Completed in concrete clas");
		
	}
	
	// Implementation of incomplete method from abstract class Base1
	public  void Insta() {
		
		System.out.println("Method Insta Completed in concrete clas");
		
	}
	
	// Implementation of incomplete method from abstract class Base1
	
	public  void Twitter() {
		
		System.out.println("Method Twitter Completed in concrete clas");
		
	}
	
	
	public static void main(String[] args) {
		
		
		Base2 b = new Base2();
		b.facebook();
		b.whatsApp();
		b.Insta();
		b.Twitter();
		
	}

}
