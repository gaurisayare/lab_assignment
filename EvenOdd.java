/*WAP THAT READS A SET OF INTEGERS, AND THEN PRINTS THE SUM OF THE EVEN AND ODD INTEGERS.*/

import java.util.Scanner;
class EvenOdd
{
		public static void main(String args[])
		{
			Scanner sc= new Scanner(System.in);
			int num=0, SumOdd=0, SumEven=0;     //initialization
			char choice;
			
			while(true){
			
			System.out.println("Are you want to continue please write yes or no: ");      //entering number will continue if yes and stops if no
			choice= sc.next().charAt(0);         //as we write charAt(0) it will only read the character at zeroth position
	
	
			if(choice=='y'||choice=='Y')    // we using nested if here
			{
				System.out.println("Continue to enter number");
				num= sc.nextInt();
				
				if(num%2==0)                         //for sum of even number
				{
					SumEven=SumEven+num;
					System.out.println("Sum of even number is: "+SumEven);
				}
			    else                                 //for sum of odd number
				{
					SumOdd=SumOdd+num;
					System.out.println("Sum of odd number is: "+SumOdd);
				}
			}
			
			else if (choice=='n'||choice=='N')
			{
				System.out.println("Ok as u wish Dear");                
				System.out.println("Sum of even number is: "+SumEven); 
				System.out.println("Sum of odd number is: "+SumOdd);
				break;
			}
			
			   /*As your choice is no for continuing no. entering then you will simply get the sum of even and odd number separately till you entered the last number*/
			
			else
			{
				System.out.println("Your choice is Invalid !!!!");
			}
		   }
        }
}