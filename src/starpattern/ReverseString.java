package starpattern;

import java.util.Scanner;

// Write a Java Program to reverse a string without using String inbuilt function.
public class ReverseString {
	
	static void reverse(String a)			//Without inbuilt function
	{

  char b[]=a.toCharArray();
  for(int i=(b.length-1);i>=0;i--)
  {
	  System.out.print(b[i]);
  }
		
	}
	 static void withinbuiltfunction(String a)
	 {
		 StringBuilder str2=new StringBuilder();
		 str2.append(a);
		 str2=str2.reverse();
		 System.out.println(str2);
		 
		 
	 }
	 static void thirdmethod()
	 {
		 String str;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the string= ");
	      
	        str=sc.nextLine();
	        StringBuilder str2=new StringBuilder();
			 str2.append(str);
			 str2=str2.reverse();
			 System.out.println(str2);
	        

	        
	 }
	 static void fourthmethod()
	 {
		 String str;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the string= ");
	        str=sc.nextLine();
	        String str2[]=str.split(" ");
	        for(int i=str2.length-1;i>=0;i--)
	        {
	        	System.out.print(str2[i]);
	        }
	        
	       
	        
	 }
	

	public static void main(String[] args) {
		
		String a="Anagha is my first love";
		//reverse(a);
		//withinbuiltfunction(a);
		//thirdmethod();
		fourthmethod();

	}

}
