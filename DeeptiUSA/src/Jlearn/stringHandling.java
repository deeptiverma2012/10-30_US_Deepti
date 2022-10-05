package Jlearn;

public class stringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 ="Deepti";
		String s2 = "Deepti";
		String s3 = new String("Deepti");
		String s4 = new String("deepti");
		
		if(s1==s3)
		{
			System.out.println("Address is same");
		}
		else
		{
			System.out.println("Address is not same");
		}
		if(s1.equals(s4))
		{
			System.out.println("Contents are same");
		}
		else
		{
			System.out.println("Contents are not same");
		}
       System.out.println(s1.compareTo(s4));

}
}
