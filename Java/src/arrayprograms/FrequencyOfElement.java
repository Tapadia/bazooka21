package arrayprograms;

public class FrequencyOfElement
{
	public static void main(String[] args)
	{
		
		int a[] = {1,5,4,2,6,7,8,1,5,4,2,6,7,8};
		System.out.println("Length of Array : " + a.length);
		
		int freq[] = new int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			freq[i]= 1;
			
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					freq[i]++;
					a[j] = 0;
				}
				
			}
		}
	
		for(int i = 0; i<freq.length; i++)
		{
			if(a[i]!= 0)
			{
				System.out.println("Frequency of " +a[i]+ " - " + freq[i]);
			}
			
		}
		
		
			
	}

}
