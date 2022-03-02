package numberprograms;

public class SumOfNaturalNumbers
{
	public static void main(String[] args)
	{
		int n=10, sum=0;
		
		for(int i=0; i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of first 10 natural numbers : " +sum);
	}
}
