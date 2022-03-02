package javaprograms;

public class FinalKeyword 
{
	final int retirement_age = 60;
	
	void print()
	{
		System.out.println(retirement_age);
	}
	
	public static void main(String[] args)
	{
		FinalKeyword f = new FinalKeyword();
		f.print();
	}
	
	
	
	/*
	 * // If the final keyword is used with the variables, methods and classes then
	 * we cannot do the changes in variables, override the method and inherit the
	 * class because we get the compile time error if we do the changes.
	 * 
	 * What is final, finally and finalize in java ?
	 * 
	 * 
	 * 
	 */
	
	
	
}
