package javaprograms;
import java.util.Scanner; 
import java.lang.*;


public class JavaBasicPrograms
{
	public static void main(String[] args) 
	{
		// WAP to check whether a number is prime number or not.
		
//		int n1, n2, flag = 0;
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter Two Numbers : ");
//		n1 = s.nextInt();
//		n2 = s.nextInt();
//
//		for(int i=2;i<=n1/2;i++)
//		{
//			if(n1%i==0)
//			{	
//				flag = 1;
//				break;
//			}
//			
//		}
//		
//		if(flag==1)
//		{
//			System.out.println("Given number is not a prime number");
//		}
//		
//		else
//		{
//			System.out.println("Given number is a prime number");
//		}
		
		
//		
//		// WAP to check which number (n1,n2) is greater. 
//	
//		if(n1>n2)
//		{
//			System.out.println("Number 1 is greater than Number 2");
//		}
//		else if(n1==n2)
//		{
//			System.out.println(" Both the numbers are equal");
//		}
//		else
//		{
//			System.out.println(" Number 2 is greater than Number 1");
//		}
//		
		
		
//		// WAP to check if the number is positive or negative
//
//		if(n1>=0)
//		{
//			System.out.println("Number 1 is positve");
//			
//			if(n2>=0)
//			{
//				System.out.println("Number 2 is positive");
//			}
//			if(n1==0 && n2==0)
//			{
//				System.out.println("Neither +ve or -ve");
//			}
//			if(n1<0)
//			{
//				System.out.println("Number 1 is negative");
//			}
//			if(n2<0)
//			{	
//				System.out.println("Number 2 is negative");
//			}
//		}
		
		
		//WAP to display prime numbers between 1 to 100
		
//		int n1, temp = 0;
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter a Number : " );
//		n1 = s.nextInt();
//		
//		System.out.println("Prime numbers till "+n1+" are : ");
//		for(int i=0; i<=n1; i++)
//		{
//			for(int j=2;j<i-1;j++)
//			{
//				if(i%j==0)
//				{
//					temp=temp+1;
//				}
//			}
//			if(temp==0)
//			{
//				System.out.println(i);
//			}
//			else
//			{
//				temp=0;
//			}
//		}
		
		
		//WAP to Display Even & Odd Numbers From 1 to 100
		
//		int n1;
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter a Number : " );
//		n1 = s.nextInt();
//		
//		System.out.println("Even Numbers till "+n1+" are : ");
//		for(int i=1; i<=n1; i++)
//		{
//			if(i%2==0)
//			{
//				System.out.println(i);;
//			}
//		}
//		System.out.println();
//		
//		System.out.println("Odd Numbers till "+n1+" are : ");
//		for(int i=1; i<=n1; i++)
//		{
//			if(i%2!=0)
//			{
//				System.out.println(i);
//			}
//		}

		
		
		//WAP to swap two numbers without using a third varaible
		
//		int a,b;
//		
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter number a : " );
//		a = s.nextInt();
//		
//		System.out.print("Enter number b : " );
//		b = s.nextInt();
//	
//		System.out.println("Before Swap");
//		System.out.println("Number a : " + a);
//		System.out.println("Number b : " + b);
//		
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		
//		System.out.println("After Swap");
//		System.out.println("Number a : " + a);
//		System.out.println("Number b : " + b);
		
		
		
		//WAP to find the sum of first 10 natural numbers
		
//		int sum = 0;
//		
//		for(int i=1; i<=10; i++)
//		{
//			sum = sum + i;
//		
//		}
//		System.out.println("The sum of first 10 natural number : "+ sum);
		
		// WAP to fine the Square Root of a Number
		
//		int a;;
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter a Number : ");
//		a = s.nextInt();
//		
//		
//		System.out.println("Square root of "+a+ " is : " + Math.sqrt(a));
	}
}
