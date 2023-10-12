/*WAP to check  whether the person is eligible for getting loan or not. 
Condition to grant loan is he should have salary more than 50000 and he should be citizen of INDIA. Otherwise loan cant be given to customer.*/

import java.util.Scanner;
class LoanEligibility
{
	public static void main(String args[])
	{
		String name;
		int sal;  		//initialization 
		char citizen;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		name= sc.nextLine();                     //nextLine is used to get the input from user for string
		
		System.out.println("Enter Your Salary: ");
		sal= sc.nextInt();
		
		System.out.println("Are you a citizen of India Yes or No ");     
		citizen= sc.next().charAt(0);                           //This will read the character at zeroth position
		
		if(citizen=='y'||citizen=='Y')
		{
			if(sal>=50000)                                                       // as above id condition and this condition is true then you are eligible to get loan
				System.out.println(name+" Congratulations you are eligible to get loan..");    
			else
				System.out.println("For getting loan Your salary should be greater than 50000..");
		}
		else
		{
			System.out.println("For getting loan you have to be a citizen of INDIA..");       //this will be print if all the conditios are false
		}
	}
}