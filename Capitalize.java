// Q3.Write a java program to capitalize each word in string.


import java.util.Scanner;

public class Capitalize
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Capitalize each word in the input string
        String capitalized = capitalizeEachWord(input);

        // Display the capitalized string
        System.out.println("Capitalized string: " + capitalized);
    }

    // Method to capitalize each word in a string
    public static String capitalizeEachWord(String str) 
	{
        // Split the input string into words using space as the delimiter
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        // Loop through each word and capitalize the first letter
        for (String word : words) 
		{
            // Capitalize the first letter of the word and append the rest
            result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
            result.append(" "); // Add a space after each capitalized word
        }

        // Remove the space and return the capitalized string
        return result.toString().trim();
    }
}
/*
op:
Enter a string: gauri sayare
Capitalized string: Gauri Sayare
*/