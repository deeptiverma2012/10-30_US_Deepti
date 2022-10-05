package Jlearn;

public class DoubleL3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=6;i++)
		{
			for(int k=6;k>i;k--)
			{
				System.out.print(" ");
			}		
			
			for(int j=6; j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
