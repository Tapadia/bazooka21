package javaprograms;

public class FinalConcreteClass extends ConcreteClass
{
	public void method5()
	{
		System.out.println("Complete Method 5");
	}
	
	public static void main(String[] args)
	{
		FinalConcreteClass f = new FinalConcreteClass();
		f.method2();
		f.method2();
		f.method3();
		f.method4();
		f.method5();
		
	}
}
