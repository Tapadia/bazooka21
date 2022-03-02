package stringprograms;

public class VowelsAndConsonants
{
	public static void main(String[] args)
	{
		int vcount=0,ccount=0;
		String a = "Rushi Tapadia";
		
		
		for(int i = 0 ; i<a.length(); i++)
		{
			if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' ||
					a.charAt(i) == 'o' || a.charAt(i) == 'u')
			{
				vcount++;
			}
			else
			{
				ccount++;
			}
		}
		
		System.out.println("Total Number of Vowels are : "+vcount);
		System.out.println("Total Number of Consonants are : "+ccount);
	}
}
