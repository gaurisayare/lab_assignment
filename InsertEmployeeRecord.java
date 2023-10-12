/*Q.2 The employees table in the database has the following columns: 
 * id, first_name, last_name, and age. 
 * Write a Java program using JDBC to insert a new employee record into the table. 
 * The employee's first name is "John," last name is "Doe," and age is 30.*/

package com.jdbc.demo1;
//Import necessary JDBC classes for database connectivity
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Define a class called InsertEmployeeRecord
public class InsertEmployeeRecord 
{

 // The main method, where the program starts execution
 public static void main(String[] args) throws ClassNotFoundException, SQLException 
 {
	 // Load the JDBC drivers
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 // Establish a connection to the database
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/meradb","root", "root");
     

     // Employee information
     String firstName = "John"; // First name of the employee
     String lastName = "Doe";  // Last name of the employee
     int age = 30;             // Age of the employee

     // Create a statement
     Statement statement = con.createStatement(); // Create a JDBC statement for executing SQL queries

     // SQL query to insert a new employee record
     String insertQuery = "INSERT INTO employees (first_name, last_name, age) " +
                 "VALUES ('" + firstName + "', '" + lastName + "', " + age + ")"; // Construct an SQL insert query

     // Execute the SQL insert statement
     statement.executeUpdate(insertQuery); // Execute the SQL insert statement to add a new employee record

     System.out.println("New employee record inserted successfully.");
  }
}

