/*Q.3) WAP to implement multithreading for Reversing user input as integer number 
and reverse that number in one thread and create another thread 
to check whether that number is palindrome or not apply proper methods.*/

import java.util.Scanner;

// Define a thread to reverse the input number
class ReverseThread extends Thread 
{
    private int num;

    // Constructor to initialize the ReverseThread with the input number
    public ReverseThread(int num) 
	{
        this.num = num;
    }

    // The run method is executed when the thread starts
    public void run() 
	{
        int reversedNum = 0;
        int originalNum = num;

        // Reverse the number
        while (num != 0) 
		{
            int remainder = num % 10;  // Get the last digit of the number
            reversedNum = reversedNum * 10 + remainder;  // Build the reversed number
            num = num/10;  // Remove the last digit from the number
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversedNum);
    }
}

// Define a thread to check if the input number is a palindrome
class PalindromeThread extends Thread 
{
    private int num;

    // Constructor to initialize the PalindromeThread with the input number
    public PalindromeThread(int num) 
	{
        this.num = num;
    }

    // The run method is executed when the thread starts
    public void run() 
	{
        int reversedNum = 0;
        int originalNum = num;

         // Reverse the number (same code as in ReverseThread)
        while (num != 0) 
		{
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num= num/10;
        }

        // Check if it's a palindrome by comparing with the original number
        if (originalNum == reversedNum) 
		{
            System.out.println("The number is a Palindrome.");
        } 
		else 
		{
            System.out.println("The number is not a Palindrome.");
        }
    }
}

public class ThreadLab3 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userNum = scanner.nextInt();

        // Create threads for reversing and checking palindrome
        ReverseThread reverseThread = new ReverseThread(userNum);
        PalindromeThread palindromeThread = new PalindromeThread(userNum);

        // Start both threads
        reverseThread.start();
        palindromeThread.start();

        try 
		{
            // Wait for both threads to finish
            reverseThread.join();
            palindromeThread.join();
        } 
		catch (InterruptedException e) 
		{
            e.printStackTrace();
        }

    }
}
