package Jlearn;

public class Fibonacci_Series {
	
	public static void Fibonacci(int a, int b)
	{
		System.out.print(a+" "+b);
		for(int i=0; i<=10; i++)
		{
			int c= a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci_Series.Fibonacci(0, 1);
		
	}

}
