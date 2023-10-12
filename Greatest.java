/*WAJP to find Greatest among three number using Nested if*/ 

import java.util.Scanner;
class Greatest
{
	public static void main(String args[])
	{
		int num1, num2, num3;                   //initialization 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First number: ");
		num1= sc.nextInt();                                //getting input by user
		
		System.out.println("Enter the Second number: ");
		num2= sc.nextInt();
		
		System.out.println("Enter the Third number: ");
		num3= sc.nextInt();
		
		if(num1>=num2)
		{
			if(num1>=num3)
				System.out.println("The greatest number is: "+num1);       //if these two is conditions are true then num1 is greatest.
			else
				System.out.println("The greatest number is: "+num3);      //if these 1st condition is true and 2nd that means num1 is not >= num3 then ultimately num3 is greatest
		}
		else                                                             // if num1 is not >= num2 then this will execute
		{
			if(num2>=num3)
				System.out.println("The greatest number is: "+num2);      //Similarly like above it will also executed
			else
				System.out.println("The greatest number is: "+num3);      
		}
	}
}