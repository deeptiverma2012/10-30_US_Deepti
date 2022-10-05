package Jlearn;
import java.util.Random;

public class GenerateRandomNames {
	
	public static String generateRandomPassword(int len) 
	{
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
          +"lmnopqrstuvwxyz!@#$%&";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	public static String generateNames(int len)
	{
		String chars ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk";
		Random r = new Random();
		StringBuilder sb = new StringBuilder(len);
		for(int i=0;i<len;i++)
		{
			sb.append(chars.charAt(r.nextInt(chars.length())));
		
					
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
		
	
	

	public static void main(String[] args) {
		//GenerateRandomNames.generateRandomPassword(8);
		
		GenerateRandomNames.generateNames(7);
		
	}
}
