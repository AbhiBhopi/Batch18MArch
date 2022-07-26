package Package2;

import Package1.Access1;

public class Access3 extends Access1 {
	public static void main(String[] args) {
		Access3 x = new Access3();
		System.out.println(x.a);// public
		//System.out.println(x.b);// private
		System.out.println(x.c);// protected
		//System.out.println(x.d);// defaul
	}

}
