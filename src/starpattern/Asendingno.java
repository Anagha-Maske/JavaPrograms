package starpattern;

public class Asendingno {
	
	static void reversearray(int a[])
			{
         int rev[]= new int [a.length];
		
		for(int i=0;i<a.length;i++)
		{
			rev[i]=a[(a.length-1)-i];
			System.out.print(rev[i]+" ");
			
		}
		

			}
	static void Asen(int b[])
	{
		
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=i;j<b.length;j++)
			{
				System.out.println("Before applying if loop b[i])= "+b[i]+" ");
				System.out.println("Before applying if loop b[j])= "+b[j]+" ");
				if(b[j]>b[i])
				{                   
				int temp=b[i];
				
				b[i]=b[j];
				b[j]=temp;
					
				System.out.print("After applying if loop b[i])= "+b[i]+" ");
				System.out.println("After applying if loop b[j])= "+b[j]+" ");
				}
		
			}
			//System.out.print("sorted array"+b[i]+" ");
			for(int x=0;x<b.length;x++)
			{
				System.out.print(b[x]+" ");
			}
			}
		
	}

	public static void main(String[] args) {
		int a[]= {23,45,43,34,46};
		//reversearray(a);
		int []b= {3,5,8,2,9};
		Asen(b);
	}

}
