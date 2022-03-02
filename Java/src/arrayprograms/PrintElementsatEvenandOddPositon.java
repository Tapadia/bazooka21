package arrayprograms;

public class PrintElementsatEvenandOddPositon
{
	public static void main(String[] args)
	{	
		int a[] = {1,5,4,2,6,7,8};
		System.out.println("Length of Array : " + a.length);
		
		// Print Elements at Even Position --> a[] = {1,2,3,4,5,6,7,8};
		System.out.println("Elements at even position : ");
		for(int i = 0; i < a.length; i=i+2)
		{
			System.out.println(a[i]);
		}
		
		// Print Elements at Odd Position --> a[] = {1,2,3,4,5,6,7,8};
		System.out.println("Elements at Odd position : ");
		for(int i = 1; i < a.length; i=i+2)
		{
			System.out.println(a[i]);
		}
	}
}
