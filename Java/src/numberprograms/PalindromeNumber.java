package numberprograms;

public class PalindromeNumber
{
	public static void main(String[] args)
	{
		int no = 121212121, temp=no, rev = 0, rem;
		while(no!=0)
		{
			rem = no%10;
			rev = rev*10+rem;
			no = no/10;
		}
		System.out.println(rev);
		
		if(rev==temp)
		{
			System.out.println("It is a Palindrome Number");
		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}
	}
}
