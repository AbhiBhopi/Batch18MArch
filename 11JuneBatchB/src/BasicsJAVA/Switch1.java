package BasicsJAVA;

public class Switch1 {
	public static void main(String[] args) {
		
		int value =4;
		switch (value) {
		case 1 :
			System.out.println("today is monday");
			//break;
			
		case 2 : 
			System.out.println("today is Tuesday");
			//break;
			
		case 3 :
			System.out.println("today is wednesday ");
			break;
			
		case 4 :
			System.out.println("today is thursday");
			//break;
			
			
		case 5 :
			System.out.println("today is friday");
			break;
			
			default:
				System.out.println("enter correct input from 1 to 5");
			
			
		}
	}

}
