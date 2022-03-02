package javaprograms;

public class NestedForLoop
{
	public static void main(String[] args)
	{
		int week = 4, days = 7, month = 3;
		
		for (int k=1; k<=month; k++)
		{
				//System.out.println("Month : " +k);
				if(k==1)
				{
					System.out.println("Month : January ");
				}
				else if(k==2)
				{
					System.out.println("Month : February ");
				}
				else if(k==3)
				{
					System.out.println("Month : March ");
				}
				else if(k==4)
				{
					System.out.println("Month : April ");
				}
				else if(k==5)
				{
					System.out.println("Month : May ");
				}
				else if(k==6)
				{
					System.out.println("Month : June ");
				}
				else if(k==7)
				{
					System.out.println("Month : July ");
				}
				else if(k==8)
				{
					System.out.println("Month : August ");
				}
				else if(k==9)
				{
					System.out.println("Month : September ");
				}
				else if(k==10)
				{
					System.out.println("Month : October ");
				}
				else if(k==11)
				{
					System.out.println("Month : November ");
				}
				else if(k==12)
				{
					System.out.println("Month : December ");
				}
				for(int i=1;i<=week;i++)
				{
					System.out.println("Week : " +i);
			
					for(int j=1; j<=days; j++)
					{
						System.out.println("Day : " +j);
				
					}
				}
		}
		
	}	
	


}
