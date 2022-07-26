package MethodConstructor;

import java.util.Scanner;

public class Scan1 {
	
	public static void main(String[] args) {
		Scanner Demo = new Scanner(System.in);// scaneer class object
		
		System.out.println("Enter The Integer");
		int value = Demo.nextInt();
		System.out.println("Your entered value is " + value);
		System.out.println();
		System.out.println("Enter the Float value");
		
        float Value1 = Demo.nextFloat();
		System.out.println("Your entered value is " + Value1);
		System.out.println();
		System.out.println("Enter The String");
		String value2 = Demo.next();
		System.out.println("Your entered Strin value is " + value2);
		
		Demo.close();
		
		
	}

}
