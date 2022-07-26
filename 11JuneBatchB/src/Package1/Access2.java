package Package1;

public class Access2 {
	
	public static void main(String[] args) {
		Access1 x = new Access1();
		System.out.println(x.a);// public
		//System.out.println(x.b);// private
		System.out.println(x.c);// protected
		System.out.println(x.d);// defaul
	}

}
