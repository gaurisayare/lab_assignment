// Check whether the user input number is prime number or not.

import java.util.Scanner;

public class PrimeNum
{
	public static void main(String[] args)
	{
		int i, number, count=0;                //variable declaration
		Scanner sc = new Scanner(System.in);
		
		//getting input from user
		System.out.println("Enter a number to check if it is prime: ");
		number = sc.nextInt();             
		
		//Check for factors of the number
		for(i=2; i<=number/2; i++)
		{
			if(number%i==0)       
			{
				count++;  //Increment count if factor is found
				break;  .
				
			}
		}
		
		//Determine if the number is prime and display the result
		if(count==0 && number!=1)
		{
			System.out.println(number+ " is a Prime Number.");
		}
		else
		{
			System.out.println(number+ " is Not a Prime Number.");
		}
		
	}
}
