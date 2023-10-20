/*Q1.)
WAP to perform CRUD operation on Product database based on choice given by user using switch case.
Using JDBC*/

package com.jdbc.demo1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DbmsLab {
 

    public static void main(String[] args) throws SQLException {


        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/meradb", "root", "root");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Create (Insert)");
            System.out.println("2. Read (Select)");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1: // Create (Insert)
                	System.out.print("Enter product id: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();

                    insertProduct(connection, id, name, price);
                    break;

                case 2: // Read (Select)
                    selectProducts(connection);
                    break;

                case 3: // Update
                    System.out.print("Enter product ID to update: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter new product name: ");
                    String updatedName = scanner.nextLine();
                    System.out.print("Enter new product price: ");
                    double updatedPrice = scanner.nextDouble();

                    updateProduct(connection, productId, updatedName, updatedPrice);
                    break;

                case 4: // Delete
                    System.out.print("Enter product ID to delete: ");
                    int productToDelete = scanner.nextInt();

                    deleteProduct(connection, productToDelete);
                    break;

                case 5: // Exit
                    System.out.println("Exiting...");
                    connection.close();
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void insertProduct(Connection connection, int id, String name, double price) throws SQLException {
        String insertSQL = "INSERT INTO products (id, name, price) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(insertSQL)) {
        	statement.setInt(1, id);
            statement.setString(2, name);
            statement.setDouble(3, price);
            statement.executeUpdate();
            System.out.println("Product inserted successfully.");
        }
    }

    private static void selectProducts(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM products";
        try (PreparedStatement statement = connection.prepareStatement(selectSQL)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                System.out.println("ID: " + id + ", Name: " +name + ", Price: " + price);
            }
        }
    }

    private static void updateProduct(Connection connection, int id, String name, double price) throws SQLException {
        String updateSQL = "UPDATE products SET name = ?, price = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(updateSQL)) {
            statement.setString(1, name);
            statement.setDouble(2, price);
            statement.setInt(3, id);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Product updated successfully.");
            } else {
                System.out.println("Product not found.");
            }
        }
    }

    private static void deleteProduct(Connection connection, int id) throws SQLException {
        String deleteSQL = "DELETE FROM products WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(deleteSQL)) {
            statement.setInt(1, id);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Product deleted successfully.");
            } else {
                System.out.println("Product not found.");
            }
        }
    }
}
