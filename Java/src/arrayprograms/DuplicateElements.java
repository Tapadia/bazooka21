package arrayprograms;

public class DuplicateElements {

	public static void main(String[] args)
	{
		int count = 0;
		int a[] = {1,5,4,2,6,7,8,1,5,4,2,6,7,8};
		System.out.print("Array Elements : ");
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("Duplicate Elements : ");
		for(int i = 0;i <a.length; i++)
		{
			count = 1;
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
					a[j] = 0;
				}
			}
			if(count>1 && a[i]!= 0)
			{
				System.out.print(a[i] + " ");
			}
		}
		
		
		
		
		
	}

}
