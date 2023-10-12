/*Q.2)Write a Java program to create multiple thread in Java. 
Apply thread properties too.(priority, name).*/

// Create a custom class named MyThread that extends the Thread class
class MyThread extends Thread 
{
    // Constructor for the thread class, taking a name and priority as parameters
    public MyThread(String name, int priority) 
	{
        super(name); // Call the constructor of the Thread class and set the thread's name
        setPriority(priority); // Set the thread's priority using the given value
    }
    
    // Override the run() method to define the task for this thread
    public void run() 
	{
        // Print thread name and priority information
        System.out.println("Thread Name: " + getName() + ", Priority: " + getPriority());
        
        // Iterate to perform the thread's task five times
        for (int i = 1; i <= 5; i++)
		{
            System.out.println(getName() + ": " + i); // Print thread name and iteration number
        }
    }
}

// Create the main class
public class ThreadLab2 
{
    // Main method where the program execution starts
    public static void main(String[] args) 
	{
        // Create and initialize three instances of the custom thread class
        MyThread thread1 = new MyThread("Thread 1", Thread.MIN_PRIORITY); // Lowest priority
  
        MyThread thread3 = new MyThread("Thread 3", Thread.MAX_PRIORITY); // Highest priority
        
        // Start each thread, initiating their execution
        thread1.start();
        
        thread3.start();
    }
}