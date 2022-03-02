package pack3;

public class ImpClass implements Interface
{
	public void method1()
	{
		System.out.println("Method 1 from Interface");
	}
	public void method2()
	{
		System.out.println("Method 2 from Interface");
	}
	public void method3()
	{
		System.out.println("Method 3 from Interface");
	}
	public void method4()
	{
		System.out.println("Method 4 from Interface");
	}
	public void method5()
	{
		System.out.println("Method 5 from Interface");
	}
	public void method6()
	{
		System.out.println("Method 6 from Interface");
	}
	public void method7()
	{
		int c=1,d=2;
		int a = c+d;
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		ImpClass ic = new ImpClass();
		ic.method1();
		ic.method2();
		ic.method3();
		ic.method4();
		ic.method5();
		ic.method6();
		ic.method7();
	}
	
}
