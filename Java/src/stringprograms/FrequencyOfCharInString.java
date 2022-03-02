package stringprograms;

public class FrequencyOfCharInString

{
	public static void main(String[] args)
	{
		String a = "Rushi Tapadia";
		int freq[] = new int[a.length()];
		
		char s[] = a.toCharArray();
		
		
		for(int i=0; i<s.length; i++)
		{
			freq[i]=1;
			
			for(int j=i+1; j<s.length; j++)
			{
				if(s[i] == s[j])
				{
					freq[i]++;
					s[j] = 0;
				}
			}
			
		}
		
		System.out.println("Characters and their corresponding frequencies : ");
		for(int i = 0; i<freq.length; i++)
		{
			if(s[i]!=' ' && s[i]!=0)
			{
				System.out.println(s[i] + "-" + freq[i]);
			}
		}
		
	}
}




//Define a string.
//Define an array freq with the same size of the string.
//Two loops will be used to count the frequency of each character. 
//Outer loop will be used to select a character and initialize element at corresponding index in array freq with 1.
//Inner loop will compare the selected character with rest of the characters present in the string.
//If a match found, increment element in freq by 1 and set the duplicates of selected character by '0' to mark them as visited.
//Finally, display the character and their corresponding frequencies by iterating through the array freq.