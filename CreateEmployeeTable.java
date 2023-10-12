/*You need to create a table named employees in the database to store employee information. 
Write a Java program using JDBC to create the employees table with the following columns:
	id of type INT, which is the primary key and auto-incremented.
	first_name of type VARCHAR(50) to store the employee's first name.
	last_name of type VARCHAR(50) to store the employee's last name.
	age of type INT to store the employee's age.*/


package com.jdbc.demo1;
//Import necessary JDBC classes for database connectivity
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Define a class called CreateEmployeesTable
public class CreateEmployeeTable 
{

 // The main method, where the program starts execution
 public static void main(String[] args) throws ClassNotFoundException, SQLException 
 {
     
	 // Load the JDBC drivers
	 Class.forName("com.mysql.cj.jdbc.Driver");
	// Establish a connection to the database
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/meradb","root", "root");

     // SQL statement to create the employees table
     String createTableSQL = "CREATE TABLE employees1 (" // SQL statement to create a table named "employees"
					             + "id INT AUTO_INCREMENT PRIMARY KEY," // Column "id" of type INT, primary key, and auto-incremented
					             + "first_name VARCHAR(50)," // Column "first_name" of type VARCHAR(50) to store the first name
					             + "last_name VARCHAR(50),"  // Column "last_name" of type VARCHAR(50) to store the last name
					             + "age INT" // Column "age" of type INT to store the age
					             + ")";

     
     
     // Create a statement
     Statement statement = con.createStatement(); // Create a JDBC statement for executing SQL queries

     // Execute the SQL statement to create the table
     statement.executeUpdate(createTableSQL); // Execute the SQL statement to create the "employees" table in the database

     // Close the statement and connection
     statement.close(); // Close the JDBC statement
     con.close(); // Close the database connection

     // Print a message indicating that the table has been created successfully
     System.out.println("Table 'employeess' created successfully.");
 }
}

