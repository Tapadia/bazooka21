package arrayprograms;

public class SecondLargetandSecondSmallest
{
	public static void main(String[] args)
	{
		int a[] = {7,3,5,21,24,28,1,4}, temp, size;
		size = a.length;

		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] > a[j])
				{
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		System.out.print("After sorting in ascending order : ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Second Larget Number is : " + a[size-2]);
		
		System.out.println("---------------------------------------------------------");
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] < a[j])
				{
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		System.out.print("After sorting in decending order : ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Second Smallest Number is : " + a[size-2]);

	}
}
