//Q.2 Write A java Program to reverse a given String without using reverse() method.

import java.util.Scanner;

public class StringReversal 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the reverseString method to reverse the input string
        String reversed = reverseString(input);

        // Display the reversed string
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }

    // Method to reverse a string
    public static String reverseString(String str) 
	{
        // Convert the input string to a character array
        char[] charArray = str.toCharArray();
        
        // Initialize left and right pointers
        int left = 0;
        int right = charArray.length - 1;

        // Swap characters from the beginning and end of the array towards the center
        while (left < right) 
		{
            // Swap characters at left and right positions using a temporary variable
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the left pointer to the right and the right pointer to the left
            left++;
            right--;
        }

        // Create a new string from the reversed character array
        return new String(charArray);
    }
}
