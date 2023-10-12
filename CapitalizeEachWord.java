// Q3.Write a java program to capitalize each word in string.

import java.util.Scanner;

public class CapitalizeEachWord 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Capitalize each letter in each word of the input string
        String capitalized = capitalizeEachLetter(input);

        // Display the capitalized string
        System.out.println("Capitalized string: " + capitalized);

    }

    // Method to capitalize each letter in each word of a string
    public static String capitalizeEachLetter(String str) 
	{
        // Split the input string into words using space as the delimiter
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        // Loop through each word in the input string
        for (String word : words) 
		{
            // Loop through each character in the word
            for (char c : word.toCharArray()) 
			{
                // Append the uppercase version of the character to the result
                result.append(Character.toUpperCase(c));
            }
            // Add a space after each word
            result.append(" ");
        }

        // Convert the result to a string, trim any extra spaces, and return
        return result.toString().trim();
    }
}
/*
op:
Enter a string: gauri sayare
Capitalized string: GAURI SAYARE
*/