package numberprograms;

public class ArmstrongNumber
{
	public static void main(String[] args)
	{
		int no = 153, length = 0,t1 = no;
		
		while(t1!=0)
		{
			t1 = t1/10;
			length = length + 1;
		}
		// System.out.println(length);
		int rem;
		int t2 = no;
		int arm = 0;
		while(t2!=0)
		{
			int mul = 1;
			rem = t2%10;
			for(int i=1; i<=length; i++)
			{
				mul = mul*rem;
			}
			arm = arm+mul;
			t2 = t2/10;
		}
		
		if(no == arm)
		{
			System.out.println("Is a armstrong number");
		}
		else
		{
			System.out.println("Not a armstrong number");
		}
	}
}
