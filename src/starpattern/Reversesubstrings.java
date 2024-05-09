package starpattern;

public class Reversesubstrings {

	
	static void Reverse(String s)
	{
		System.out.println("Origional String= "+ s);
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
	
		}
		System.out.println("reversed normal string= "+rev);
		 
		String a[]=rev.split(" ");
		
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.print(a[j]+" ");
		}
		
		
	}
	public static void main(String[] args) {
		String s="I love Myself";
		Reverse(s);
	
	
	
	}
	
}
