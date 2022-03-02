package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CollectionProgram1 
{
	public static void main(String[] args)
	{
		
		
		// Array List
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("rushi");
		al.add('c');
		
		System.out.println(al);
		
		List l = new ArrayList();
		l.add(10);
		l.add("rushi");
		l.add('c');
		l.add(2, 30);								// Add using index position 
		l.remove(0);								// Remove element using index position
		l.set(1,31);								// Replace using index position
		
		System.out.println("Using upcasting : " +l);
		
		System.out.println("Print a particular value : " +l.get(0));
		
		System.out.println("Print using for Loop : ");
		for(int i=0 ; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		
		System.out.println();
		System.out.println();
		
		
		// HashSet
		System.out.println("HashSet : ");
		
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add("Rushi");
		hs.add(3);					// HashSet does not allow duplicate values
		hs.add(null);
		hs.remove(1);				// Remove element in HashSet
		
		System.out.println(hs);
		
		
		
		
	}
	
	
}
