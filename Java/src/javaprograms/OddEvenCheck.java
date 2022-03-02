package javaprograms;
import java.util.Scanner;

public class OddEvenCheck
{
	public static void main(String[] args)
	{
		
		int i;
		Scanner s = new Scanner(System.in);
		
		System.out.print(" Enter a number : ");
		i = s.nextInt();
		
		if(i%2==0)
		{
			System.out.println("Given Number is Even");
		}
		else
		{
			System.out.println("Given Number is Odd");
		}
	}
}
