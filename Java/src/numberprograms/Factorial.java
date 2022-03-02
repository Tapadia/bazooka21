package numberprograms;


public class Factorial
{
	public static void main(String[] args)
	{
		int n=3, fact=1;
		
		for(int i=1; i<=n; i++)
		{
			//fact = i*fact;
			fact = fact*i;
		}
		
		System.out.println("Factorial of the given number is : " +fact);
	}
}
