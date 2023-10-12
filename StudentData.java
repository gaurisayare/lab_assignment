/*Write a Package MCA which has one class Student. Accept student detail through parameterized constructor
Write display() method to display details. Create a main class which will 
use package and calculate total marks and percentage*/

package mca;
// Define the Student class
public class StudentData 
{
    public int r_no;    		// Student's roll number
    public String name; 		// Student's name
    public int a, b, c;  		// Marks in three subjects
    int sum = 0;        		// Total marks

    // Constructor to initialize student information and calculate total marks
    public StudentData(int roll, String nm, int m1, int m2, int m3) 
	{
        r_no = roll;
        name = nm;
        a = m1;
        b = m2;
        c = m3;
        sum = a + b + c; // Calculate total marks
    }

    // Method to display student information, subject marks, total marks, and percentage
    public void display() 
	{
		System.out.println("------------------");
        System.out.println("Roll_no : " + r_no);
        System.out.println("Name    : " + name);
        System.out.println("-----MARKS-------");
        System.out.println("Sub 1     : " + a);
        System.out.println("Sub 2     : " + b);
        System.out.println("Sub 3     : " + c);
		System.out.println("------------------");
        System.out.println("Total     : " + sum);
        System.out.println("Percentage: " + (sum /3)); // Calculate percentage using integer division
        System.out.println("-------END--------");
    }
}
