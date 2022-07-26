package BasicsJAVA;

public class If_Else_if {
	
	
	public static void main(String[] args) {
		 int Marks = 26;
		 
		 if (Marks >= 75) {
			 System.out.println("Student is Pass with Distinction");
		 }
		 else if (Marks >=60) {
			 System.out.println("Student is pass with 1st Class");
		 }
		 
		 else if (Marks >=50) {
			 System.out.println("Student is pass with 2nd Class");
		 }
		 
		 else if (Marks >=35) {
			 System.out.println("Student is pass ");
		 }
		 else {
			 System.out.println("Student is fail");
		 }
		 
	}

}
