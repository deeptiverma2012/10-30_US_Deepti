
public class String_Comparision {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Deepti";
		String s1="Deepti";
		
		String s2 = new String("Deepti");
		String s3 = new String("Deepti");
		
		String s4= "Deepti";
		String s5="deepti";
		
		 
		if(s==s1)
		{
			System.out.println("Address is same");
		}
		else {
			System.out.println("Address is not same");
		}
		if(s2==s3)
		{
			System.out.println("Address is same");
		}
		else {
			System.out.println("Address is not same");
		}
		if(s1.equals(s))
		{
			System.out.println("Content is same in both");
		}
		else
		{
			System.out.println("Content is not same in both");
		}
		System.out.println(s4.compareTo(s5));


	}

}
