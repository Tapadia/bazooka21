package starpatternprograms;

public class Pattern3
{
	public static void main(String[] args)
	{
		int row = 5,i,j,k;
		
		for(i=1;i<=row;i++)
		{
			for(k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
//			* 
//	      * * 
//	    * * * 
//	  * * * * 
//	* * * * *
		
		
		System.out.println();
		System.out.println();
		
		
		
		for(i=1;i<=row;i++)
		{
			for(k=1;k<=i;k++)
			{
				System.out.print("");
			}
			for(j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
//		*****
//		****
//		***
//		**
//		*
		
		System.out.println();
		System.out.println();
		
		
		for(i=1;i<=row;i++)
		{
			for(k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1;i<=row;i++)
		{
			for(k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
//	     *
//	    **
//	   ***
//	  ****
//	 *****
//	  ****
//	   ***
//	    **
//	     *
	}
}
