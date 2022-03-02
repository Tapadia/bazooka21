package arrayprograms;

public class MaxNumber
{

	public static void main(String[] args)
	{
		int a[] = {1,5,4,2,6,7,8};
		System.out.println("Length of Array : " + a.length);
		
		int max = a[0];
			
		for(int i = 0; i<a.length; i++)
		{
			if(a[i] > a[0])
			{
				max = a[i];
			}
		}
		System.out.println("Maximum Number is : " + max);
	}

}
