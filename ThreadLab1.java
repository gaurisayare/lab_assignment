/*Q.1)Write a JAVA program which will generate the threads: 
- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.*/

// Create a class named FibonacciThread that extends the Thread class
class FibonacciThread extends Thread 
{
    // Override the run() method to define the task for this thread
    public void run() 
	{
        int n = 10; // Define the number of terms in the Fibonacci series
        int prev = 0, next = 1; // Initialize variables to store Fibonacci sequence values
        
        // Print a message indicating the start of Fibonacci series 
        System.out.println("Fibonacci Series:");
        
        // Iterate to generate the Fibonacci series
        for (int i = 0; i < n; i++) 
		{
            System.out.print(prev + " "); // Print the current Fibonacci value
            
            // Calculate the next Fibonacci value and update variables
            int temp = prev + next;
            prev = next;
            next = temp;
        }
    }
}

// Create a class named ReverseThread that extends the Thread class
class ReverseThread extends Thread 
{
    // Override the run() method to define the task for this thread
    public void run() 
	{
        // Print a message indicating the start of printing numbers in reverse order
        System.out.println("\nNumbers in Reverse Order:");
        
        // Iterate to print numbers in reverse order from 10 to 1
        for (int i = 10; i >= 1; i--) 
		{
            System.out.print(i + " "); // Print the current number
        }
    }
}

// Create the main class
public class ThreadLab1 
{
    // Main method where the program execution starts
    public static void main(String[] args) 
	{
        // Create and initialize a new thread for Fibonacci series generation
        FibonacciThread fibonacciThread = new FibonacciThread();
        
        // Create and initialize a new thread for printing numbers in reverse order
        ReverseThread reverseThread = new ReverseThread();
        
        // Start the Fibonacci thread, which will execute its run() method
        fibonacciThread.start();
        
        // Start the Reverse thread, which will execute its run() method
        reverseThread.start();
    }
}

