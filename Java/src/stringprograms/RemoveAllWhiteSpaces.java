package stringprograms;

public class RemoveAllWhiteSpaces
{
	public static void main(String[] args)
	{
		String a = "                               Rushi Tapadia";
		
		System.out.println("After trimming : " +a.trim());
		
		String str = a.replaceAll(" ", "@");
		System.out.println("After replacing White Spaces with @ : " +str);
		
		
	}
}
