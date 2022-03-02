package stringprograms;

public class SwapTwoStrings
{
	public static void main(String[] args)
	{
		String a ="Rushi";			//Length = 5
		String b ="Tapadia";		//Length = 7
		
		
		System.out.println("Before Swap : ");
		System.out.println(a);						
		System.out.println(b);
		
		
		
		a = a+b;      // a = RushiTapadia --> Length = 12 
		b = a.substring(0,a.length()-b.length());   			//(0, 12-7) --> (0,5)      
		a = a.substring(b.length());
		
		System.out.println();
	
		System.out.println("After swap : ");
		System.out.println(a);
		System.out.println(b);
				
	}
}
