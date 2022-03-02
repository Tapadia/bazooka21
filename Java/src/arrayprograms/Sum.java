package arrayprograms;

public class Sum
{

	public static void main(String[] args) 
	{
		int a[] = {1,5,4,2,6,7,8};
		System.out.println("Length of Array : " + a.length);
		
		//Sum of Array
		int sum = 0;
		for(int i = 0; i<a.length; i++)
		{
			sum+=a[i];
		}
		System.out.println("Sum of Array is : " + sum);	
	}
}
