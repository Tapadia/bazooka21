package pack2;

public class SubClass extends SuperClass // compile-time error using final keyword
{
	void method()
	{
		System.out.println("Sub Class method");
	}
	
	public static void main(String[] args)
	{
		SubClass s = new SubClass();
		s.method();
	}
}
