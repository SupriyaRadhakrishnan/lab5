import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userChoice = "";
		int maxFactorial = 0;
		long factorial =1;
		
		for(int i=1;factorial>=1;i++)
		{
			factorial = factorial(i);
			maxFactorial = i-1;
		}

		
do {
   System.out.println("Enter a number from 1 to " + maxFactorial);
   int userResponse = scnr.nextInt();
   while(userResponse <1 || userResponse > maxFactorial)
   {
	   System.out.println("Enter a number from 1 to "+ maxFactorial);
	   userResponse = scnr.nextInt();
   }
    factorial = factorial(userResponse);
System.out.println("Factorial of the the given number is :" + factorial);
System.out.println("Would you like to continue (y/n):");
userChoice = scnr.next();
}while(userChoice.equals("y"));



System.out.println("GoodBye!");

	}
	public static long factorial(int n) {
		  
		  if(n==1) return 1;
		  return n*factorial(n-1);
		}
}
