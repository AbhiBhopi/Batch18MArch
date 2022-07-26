package BasicsJAVA;

public class Nested_If {
	
	public static void main(String[] args) {
		
		String UN ="Abhinav";
		String PWD = "abhi@12";
		if (UN=="Abhinav") {
			System.out.println("Username is correct");
			
			if (PWD=="abhi@") {
				System.out.println("Password is correct");
				System.out.println("Login get successful");
			}
			else {
				System.out.println("password Wrong");
				System.out.println("Login failed");
			}
			}
		else {
			System.out.println("Invalid username");
			System.out.println("Login failed");
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
