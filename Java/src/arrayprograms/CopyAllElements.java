package arrayprograms;

public class CopyAllElements {

	public static void main(String[] args)
	{
		int a[] = {1,5,4,2,6,7,8};
		System.out.println("Length of Array : " + a.length);
		
		int b[] = new int[a.length];
		for(int i = 0; i<a.length; i++)
		{
			b[i] = a[i];
		}
		System.out.println();
		System.out.println("After copying : ");
		for(int i = 0; i<b.length; i++)
		{
			System.out.print(b[i] + " ");
		}
	}

}
