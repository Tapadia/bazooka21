package stringprograms;

public class ReverseOfString
{
	public static void main(String[] args)
	{
		char ch;
		String a = "Rushi Tapadia", rev = "", reverse = "";
		
		for(int i = 0; i<a.length(); i++)
		{
			ch = a.charAt(i);
			rev = ch + rev;
		}
		
		System.out.println(rev);
		
		for(int i = a.length()-1; i>=0; i--)
		{
			reverse = reverse + a.charAt(i);
		}
		System.out.println(reverse);
	}

}
