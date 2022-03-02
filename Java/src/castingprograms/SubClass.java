package castingprograms;

public class SubClass extends SuperClass
{
	void method3()
	{
		System.out.println("Method 3 from SubClass");
	}
	
	void method4()
	{
		System.out.println("Method 4 from SubClass");
	}
	
	public static void main(String[] args) 
	{
		// Object Calling using same class
		
		System.out.println("Normal object Calling : ");
		System.out.println();
		
		SuperClass s = new SuperClass();
		s.method1();
		s.method2();
		
		SubClass s2 = new SubClass();
		s2.method3();
		s2.method4();
		
		System.out.println();
		
		
		// Using Inheritance
		System.out.println("Using Inheritance : ");
		System.out.println();
		
		SubClass s3 = new SubClass();
		s3.method1();
		s3.method2();
		s3.method3();
		s3.method4();
		
		System.out.println();
		
		// UpCasting
		
		System.out.println("UpCasting : ");
		System.out.println();
		SuperClass s4 = new SubClass();
		s4.method1();
		s4.method2();
	}

}
