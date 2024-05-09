package starpattern;

import mainQuestions.ChromeDriver;
import mainQuestions.WebDriver;

public class Triangular_1 {            ///for int values
	 static void TakeArgument(int v)
	{
		
		for(int i=1;i<=v;i++)
		{
			for(int j=1;j<=(v-i);j++) {
				System.out.print(" ");
			}
				
			for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
		
			System.out.println("");
	}}
	 
	 
	 
	 static void TakeArgument(String v)
		{
			
			for(int i=0;i<v.length();i++)
			{
				for(int j=0;j<=i;j++) {
				System.out.print(v.charAt(j));
				
			}
				System.out.println("");
				
		}}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
	 WebDriver driver =  new ChromeDriver();

        // Open the web page
        driver.get("url_of_the_web_page");

		
		TakeArgument(3);
		//TakeArgument("Anagha");
		
			}
		
	
	
		
	}


