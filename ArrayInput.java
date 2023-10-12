/*Create package MyArray to accept 10 values from user and import created package to find

particular element from the array using binary search algorithm*/

package myarray;

import java.util.Scanner;

public class ArrayInput
{
    public static int[] getInputArray() 
	{
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10]; // Create an array to store 10 values

        System.out.println("Enter 10 values:");

        for (int i = 0; i < 10; i++) 
		{
            arr[i] = sc.nextInt(); // Read values from the user
        }

        return arr; // Return the input array
    }
}
