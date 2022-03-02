package arrayprograms;

public class PrintArrayElements
{
	public static void main(String[] args)
	{
		int a[] = {1,5,4,2,6,7,8};
		System.out.println("Length of Array : " + a.length);
		
		System.out.println();

		// Print Elements in an array --> a[] = {1,5,4,2,6,7,8};
		System.out.println("Elemnts in array : ");
		for(int i = 0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		// Print Elements in an array in reverse order --> a[] = {8,7,6,2,4,5,1};
		System.out.println("Elements in reverse order : ");
		for(int i = a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
		
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
	}
}