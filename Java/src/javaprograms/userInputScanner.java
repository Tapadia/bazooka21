package javaprograms;
import java.util.Scanner;

public class userInputScanner
{
	
	public static void main(String[] args)
	{
		// WAP to swap two numbers.
		
		
		int i,o,p;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		i = s.nextInt();
		System.out.println("Enter a Number : ");
		o = s.nextInt();
		
		p = i;	
		i = o;
		o = p;
				
		System.out.println("Value in i is : " +i);
		System.out.println("Value in o is : " +o);
		
		
		
		
		
		
		
		
				
//		if(i%2==0)
//			{
//				System.out.println("The Given Numeber is Even");
//			}
//		else
//		{
//				System.out.println("The Given Number is Odd");
//		}
	}

}
