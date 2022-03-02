package javaprograms;

public class Test 
{
		int a, b = 20, c = 40;

		void add()
		{
			a = b+c;
		}
		void show()
		{
			System.out.println(a);
		}
		
		public static void main(String[] args)
		{
			Test t = new Test();
			t.add();
			t.show();
		}
}

