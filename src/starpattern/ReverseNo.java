package starpattern;

public class ReverseNo {
	
	
	 public static void ReverseNo(int n)
	{
		System.out.println("The Original number: "+n);
		int temp=n;
		 int reversednumber=0;
		 int count=0;
		while(n!=0)
		{
			int digit=n%10;
			reversednumber=reversednumber*10+digit;
			n=n/10;
			count++;
		}
		System.out.println("The Reversed number: "+reversednumber);
     if(temp==reversednumber) {
    	 System.out.println("The Given no. is Palindrome no.");
			
		}
     else
     {
    	 System.out.println("The given no. is not palindrome no.");
     }
     System.out.println("The no.of digits = "+count);
	}
	public static void main(String[] args) {
		ReverseNo(900);
		
		
	}

}
