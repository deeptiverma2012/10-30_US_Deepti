import java.util.Scanner;

public class Factorial {
	
	public void fact(int num )
	{
		long factorial=1;
		if(num<1)
		{
			System.out.println("Please enter a positive number");
		}
		else if(num<=1)
		{
			System.out.println("Factorial=1");
		}
		else
		{
			for(int counter=num; counter>=2; counter--)
			{
				factorial= factorial*counter;
				
			}
			System.out.println(factorial);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		
		int x = scan.nextInt();
		Factorial obj = new Factorial();
		obj.fact(x);
	

	}

}
