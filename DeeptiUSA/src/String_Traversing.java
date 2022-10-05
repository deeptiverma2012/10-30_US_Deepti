
public class String_Traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//// To traverse character by character
		String S = "My name is Deepti";
		int x= S.length();
		for(int i=0; i<x;i++)
		{
			System.out.println(S.charAt(i));// To traverse character by character
		}
		
		//For traversing word to word
		
		String[] a = S.split(" ");
		int l= a.length;
		for(int i=0; i<l;i++)
		{
			System.out.println(a[i]);
		}
		
		//For traversing word by word in  reverse order
		String[] b = S.split(" ");
		int l1= b.length;
		System.out.println(b.length);		
				
		for(int j=l1-1; j>=0;j--)
		{
			System.out.println(b[j]);
		}
	}

}
