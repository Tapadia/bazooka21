package javaprograms;

public class PrintStartsProgram
{
	public static void main(String[] args)
	{
	
		int n = 5;
		
		// For 1st line and last line
		
//		for(int i=1;i<=5;i++)			// FOR ROWS
//		{
//			for(int j=1; j<=5; j++)	    // FOR COLUMNS
//			{
//				if(j==1 || j==5)
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//			}
//			
//			System.out.println();
//		}
		
		// For center row and column
//		for(int i=1;i<=5;i++)			// FOR ROWS
//		{
//			for(int j=1; j<=5; j++)	    // FOR COLUMNS
//			{
//				if(j==5/2+1 || i==5/2+1)
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//			}
//			
//			System.out.println();
//		}
		
		// For printing x
		
//		for(int i=1;i<=5;i++)			// FOR ROWS
//		{
//			for(int j=1; j<=5; j++)	    // FOR COLUMNS
//			{
//				if(i==j || i+j==5+1)
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//			}
//			
//			System.out.println();
//		}
		
		// For printing box
//		
//		for(int i=1;i<=5;i++)			// FOR ROWS
//		{
//			for(int j=1; j<=5; j++)	    // FOR COLUMNS
//			{
//				if(i==1 || i==5 || j==1 || j==5)
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//			}
//			
//			System.out.println();
//		}
		
		
		
		// For right sided traingle 
				
		for(int i=1; i<=n; i++)			// FOR ROWS
		{
			for(int j=i; j<=n; j++)	    // FOR Space
			{
				System.out.print("  ");
			}
			
			for(int j=1; j<=i; j++)     // For Column
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		for(int i=1; i<=n; i++)			// For ROWS
		{
			for(int j=1; j<=i; j++)	    // For Space
			{
				System.out.print("  ");
			}
			
			for(int j=i; j<=n; j++)     // For Column           
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
}
