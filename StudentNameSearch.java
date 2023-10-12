/*WAP to search given student name is available in the list of student name using String array.*/

import java.util.Scanner;

public class StudentNameSearch 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); // Consume the newline character after integer input

        // Create an array to store student names
        String[] studentNames = new String[numStudents];

        // Input student names
        for (int i = 0; i < numStudents; i++) 
		{
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = sc.nextLine();
        }

        // Input student name to search
        System.out.print("Enter student name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;

        // Search for the student name in the array
        for (String name : studentNames) 
		{
            if (name.equalsIgnoreCase(searchName)) 
			{
                found = true;
                break; // Exit loop if the name is found
            }
        }

        // Display search result
        if (found) 
		{
            System.out.println("Student name found in the list.");
        } 
		else 
		{
            System.out.println("Student name not found in the list.");
        }

    }
}


