package Jlearn;

import java.nio.charset.Charset;
import java.util.Random;

public class GenerateRandonString {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 byte[] array = new byte[7]; // length is bounded by 7
		  new Random().nextBytes(array);
		    String generatedString = new String(array, Charset.forName("UTF-8"));

		    System.out.println(generatedString);		
		

	}

}
