package arrayprograms;

public class AscendingandDescendingOrder 
{

	public static void main(String[] args)
	{
		int temp = 0;
		int a[] = { 1, 5, 4, 2, 6, 7, 8 };
		System.out.println("Length of Array : " + a.length);

		System.out.println("Before sorting in ascending order : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[i] > a[j])
				{
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}

		System.out.println();

		System.out.println("After sorting in ascending order : ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[i] < a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println();

		System.out.println("After sorting in descending order : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
