package javaprograms;

public abstract class ConcreteClass extends AbstractClass
{
	public void method3()
	{
		System.out.println("Completed in Concrete class");
	}
	
	public void method4()
	{
		System.out.println("Completed in Concrete class");
	}
	
	public static void main(String[] args)
	{
//		ConcreteClass c = new ConcreteClass();
//		c.method3();
//		c.method2();
		
		// Static Method Calling
		AbstractClass.method1();
		ConcreteClass.method1();
	}
}
