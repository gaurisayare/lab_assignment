/*WAJP to generate prime numbers between 1 to 100.
o/p- 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 */

public class PrimeNumbers 
{
   
    public static void main(String[] args) 
    {
        // Loop through numbers from 2 to 100
        for (int num = 2; num <= 100; num++) 
        {
            int count = 0;  // Reset factor count for each new number
            
            // Check for factors of the current number up to its square root
            for (int i = 2; i * i <= num; i++)    
            {
                // If the current number is divisible by i, increment the factor count and stop checking
                if (num % i == 0)
				{
                    count++;
                    break;  // No need to check further factors if one is found
                }
            }
			
            // If no factors were found (count is still 0), the number is prime
            if (count == 0) 
			{
                System.out.print(num + " ");  // Print the prime number
            }
        }
    }
}
