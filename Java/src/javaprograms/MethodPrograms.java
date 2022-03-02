package javaprograms;

public class MethodPrograms 
{
	//Non-return Method
	public static void patternMethod()
	{
		for(int i=0; i<=3; i++)
		{
			System.out.println(i);
		}
		
	}
	
	//Return Method
	
	public static int patternMethod1()
	{
		int a = 10, b = 20, c = 30, d;
		d = a+b+c;
		return d;
	}
	
	public static void demo(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
	public static int demo2(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args)
	{
		/* VOID : is called as a data type which is used with methods only.
				  (Not with the variables) 
				  Void returns nothing*/
		
		patternMethod();
		
		System.out.println();
	
		
		System.out.println(patternMethod1());
		
		MethodPrograms.demo(5, 10);
		MethodPrograms.demo2(2, 4);
		
		
	}
}


