package castingprograms;

public class PrimitiveCasting 
{
	
	
	public static void main(String[] args)
	{
		
		// Widening Type Casting (Implicit Conversion) : Done Automatically
		System.out.println("Widening Type Casting : ");
		
		int a = 20;
		double b;
		
		b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println();
		
		// Narrowing Type Casting (Explicit Conversion) : Done Manually
		
		
		System.out.println("Narrowing Type Casting : ");
		
		double c = 20.3333;
		int d;
		
		d = (int)c;
		
		System.out.println(c);
		System.out.println(d);
		
		
	}
	
	
	
}
