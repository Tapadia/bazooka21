package stringprograms;

public class DuplicateCharactersInString 
{
	public static void main(String[] args)
	{
		int count = 0;
		String a = "Rushi Tapadia";
		
		char s[] = a.toCharArray();
		
		for(int i = 0 ; i<s.length; i++)
		{
			count = 1;
			
			for(int j=i+1 ; j<s.length; j++)
			{
				if(s[i] == s[j] && s[i]!= ' ')
				{
					count++;
					s[j] = 0;
				}
			}
			if(count>1 && s[i]!=0)
			{
				System.out.println(s[i]);
			}
		}
	}
}
