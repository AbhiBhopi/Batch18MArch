package Inheritance;

public class TestHirarchicle {
	
	public static void main(String[] args) {
		
		
		Son s = new Son();
		s.Bike();
		s.car();
		s.Home();
		s.Money();
		s.bicycle();
		System.out.println("=======================================");
		
		Grandson1 g = new Grandson1();
		g.bicycle();
		g.car();
		g.Money();
		g.Home();
		
		System.out.println("=======================================");
		
		
	}

}
