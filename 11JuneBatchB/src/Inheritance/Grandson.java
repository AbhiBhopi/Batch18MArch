package Inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Grandson <T,L>{
	
	int a ;
	T b ; 
	// T return type     L argument
	T test(L d)
	{
		System.out.println(d);
		return b ;
	}
	
	public static void main(String[] args) {
		
		Grandson<Integer,String> g = new Grandson<Integer,String>();
		g.b = 100;
		
		int x = g.test("Velocity");
		System.out.println(x);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// MAP
//		
//		Hashtable<Integer,String> table = new Hashtable<Integer,String>();
//		
//		table.put(65, "Velocity");
//		table.put(45, "Pune");
//		table.put(98, null);
//		table.put(46, "Testing");
//		table.put(65, "Velocity");
//		table.put(34, "Pune");
//		
//		for(Map.Entry<Integer,String> r : table.entrySet())
//		{	
//			System.out.println("Key=" + r.getKey() + " Value= " + r.getValue());
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		HashSet<Character> set = new HashSet<Character>();
//		
//		set.add('@');
//		set.add('&');
//		set.add('#');
//		set.add('S');
//		set.add('8');
//		
//				/// insertion order not mainatain
//		//Advance for loop
//		for(char r : set)
//		{
//			System.out.println(r);
//		}
		
		
		
		// Homogeneous 
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		list.add(123);
//		list.add(4567);
//		list.add(987);
//		list.add(9978);
//		
//		// in array length keyword
//		// no of dada in collection 
//		int size = list.size();
//		System.out.println("size = " + size);
//		
//		for(int i =0 ; i<list.size() ;i++)
//		{
//			System.out.println(list.get(i));
//		}
//		
//		System.out.println("+++++++++++++++++");
//		list.remove(2);
//		
//		for(int i =0 ; i<list.size() ;i++)
//		{
//			System.out.println(list.get(i));
//		}
		
	}
	
	
	
	
	
		
		
		
		


}