

import mca.StudentData; // Import the StudentData class from the 'mca' package
import java.util.*;      // Import the java.util package

// Class to take input and display student data
class StudentData1 
{
     public static void main(String[] args) 
	 {
          String nm;         // To store student's name
          int roll;          // To store student's roll number
          Scanner sc = new Scanner(System.in); // Create a Scanner object to take input from the user

          // Prompt user for roll number and read input
          System.out.print("Enter Roll no: ");
          roll = sc.nextInt();

          // Prompt user for name and read input
          System.out.print("Enter Name: ");
          nm = sc.next();

          int m1, m2, m3;    // To store marks in three subjects

          // Prompt user for marks in three subjects and read input
          System.out.println("Enter Marks of 3 Subjects out of 100: ");
          m1 = sc.nextInt();
          m2 = sc.nextInt();
          m3 = sc.nextInt();

          // Create a StudentData object using the provided input
          StudentData s = new StudentData(roll, nm, m1, m2, m3);

          // Display the student data using the display method of the StudentData class
          s.display();
     }
}
