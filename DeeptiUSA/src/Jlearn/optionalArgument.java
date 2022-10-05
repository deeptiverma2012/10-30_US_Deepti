package Jlearn;

public class optionalArgument {
	
	public static void m1(Integer...abc)// Optional argument is called as array of Integers
	{
		if(abc.length == 0)
		{
			System.out.println("Working as a default method");
		}
		else
		{
			int L = abc.length;
			System.out.println( abc.length);
			System.out.println("Working as a parameterized method");
			
			for(int i=0; i<L; i++)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		optionalArgument.m1();
		optionalArgument.m1(12);
		optionalArgument.m1(12,13,14);
	}

}
