package starpatternprograms;

public class Pattern2
{
	public static void main(String[] args)
	{
		int row = 5 ,i ,j;
		
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
		
		System.out.println();
		System.out.println();
	
		for(i=1;i<=row;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		
		System.out.println();
		System.out.println();
		
		
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=1;i<=row;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
	}
}
