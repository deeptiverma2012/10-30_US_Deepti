import java.util.Scanner;

public class switchcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide No. 1:");
		int x = scan.nextInt();
		
		System.out.println("Please provide No. 2:");
		int y = scan.nextInt();
		
		int z;
		
		System.out.println("Please choose the operation:");
		String  op = scan.next();
		
		switch(op)
		{
		case "add" : 
			z = x+y;
			System.out.println("The sum is:"+z);
			break;
		case "sub": 
			z= x-y;
			System.out.println("The subtract is:"+z);
			break;
		case "Mul":
			z= x*y;
			System.out.println("The Multiple is:"+z);
			break;
		default: 
				break;
			
			
		}
		
		
		
		
		
		

	}

}
