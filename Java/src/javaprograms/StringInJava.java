package javaprograms;
import java.util.Scanner;

public class StringInJava 
{	
	public static void main(String[] args)
	{
//		char a = 'A';
//		char b = 'B';
//		char c = 'C';
//		char d = 'D';
//		char e = 'E';
//		char f = 'F';
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);
//		
//		System.out.println();
//		
//		
//		String g = "ABCDEF";     //String Literal 
//		String h = "ABCDEF@123";
//		
//		System.out.println(g);
//		System.out.println(h);
//		
//		System.out.println();
//		
//		String i = new String(" ABCDEFGHI"); //With a new keyword
//		System.out.println(i);
//		
//		
//		String j = "        ABCDEF";
//		if(g==j)
//		{
//			System.out.println("Same Values");
//		}
//		else
//		{
//			System.out.println("Not Same Values");
//		}
//		
//		System.out.println("Length of the String : " + j.length());
//		System.out.println("Convert to lower case : " + j.toLowerCase());
//		System.out.println("Convert to lower case : " + j.toUpperCase());
//		System.out.println("Concatination of two Strings : " + j.concat(i));
//		System.out.println(j.equals(i));
//		System.out.println("Character at : " + j.charAt(5));
//		System.out.println("Ends with : " + j.endsWith(h));
//		System.out.println("Trim : "+j.trim());
			
//		int vcount = 0 , ccount = 0;
//		String a;
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter a String : ");
//		a = s.nextLine();
		

//		String str = a.toLowerCase();
//		System.out.println(str);
		
//		System.out.println(str.replaceAll(" ", "@")); // To replace all white spaces with special character.
			
		// WAP to find number of vowel and consonants in a string.
		
//		for(int i=0; i<a.length(); i++)
//		{
//			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
//			{	
//				vcount++;
//			}
//			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
//			{
//				ccount++;
//			}
//		}
//		
//		System.out.println("Vowel Count : " + vcount);
//		System.out.println("Consonant Count : " + ccount);
		
		// WAP to find duplicate characters in a string.
		
//		int count = 0;
//		String a;
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter a String : ");
//		a = s.nextLine();
//			
//		System.out.println(a.length());
//		char str[] = a.toCharArray();
//		
//		System.out.println("Duplicate characters in the given string : ");
//		
//		for(int i=0; i<str.length; i++)
//		{
//			count = 1;
//			
//			for(int j=i+1; j<str.length; j++)
//			{
//				if(str[i] == str[j] && str[i]!= ' ' ) 
//				{
//					count++;
//					str[j] = 0;
//				}
//			}
//			
//			if(count>1 && str[i]!='0')
//			{	
//				System.out.println(str[i]);
//			}
//		}
//		
		// WAP to reverse a string
		
//		String a = "Rushi", rev="";
//		char ch;
//		
//		System.out.println("Given String : " +a);
//		
//		for(int i=0; i<a.length(); i++)
//		{
//			ch=a.charAt(i);
//			// rev = ch+rev;
//			rev = rev+ch;
//		}
//		System.out.println("Reverse of string : " +rev);
		
		//WAP to swap two string without using third variable
//		
//		String a = "Rushi", b = "Tapadia";
//		
//		System.out.println(a.length());
//		System.out.println(b.length());
		
//		System.out.println("Before Swap");
//		System.out.println("String a : " +a+ 
//				" & String b : " +b);
//		System.out.println("String b :" + b);
//		
//		a = a+b;
//		
//		b=a.substring(0,a.length()-b.length());
//		
//		a=a.substring(b.length());
//		
//		System.out.println("After Swap");
//		System.out.println("String a : " +a+
//				" & String b : " +b);
//		System.out.println("String b : " +b);
	}

}
