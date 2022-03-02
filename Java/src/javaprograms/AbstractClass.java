package javaprograms;

public abstract class AbstractClass   // Abstract - non access modifiers
										//used for methods and classes
{

	public static void method1()
	{
		System.out.println("Complete Static Method");
	}
	
	public void method2()
	{
		System.out.println("Complete Non Static Method");
	}
	
	// incomplete method
	public abstract void method3();
	public abstract void method4();
	public abstract void method5();
	
//	public abstract static method4(); //Static methods cannot be made abstract
	
	/*
	 * public static void main(String[] args)
	 * { // AbstractClass a = new
	 * AbstractClass(); Not possible
	 * 
	 * 
	 * }
	 */
	
	
	
}
