// File: RectangleArea.java
// This program calculates the area of a rectangle based on user input for length and width.
import java.util.Scanner;//imports the Scanner class from Java's java.util package.

public class Rectangle {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter length and width
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate area
        double area = length * width;

        // Display the result
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}
