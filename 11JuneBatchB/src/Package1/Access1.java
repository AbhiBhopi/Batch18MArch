package Package1;

public class Access1 {
	
	 public int a =40;
     private int b = 78;
     protected int c =65;
	 int d = 32;
	
	
	public static void main(String[] args) {
		Access1 x = new Access1();
		
	System.out.println(x.a);// public
	System.out.println(x.b);// private
	System.out.println(x.c);// protected
	System.out.println(x.d);// default
		
	}

}
