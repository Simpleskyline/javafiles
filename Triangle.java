import java.util.Scanner;
// This program calculates the area of a triangle based on user input for base and height.

public class Triangle {
    public static void main(String[] args){
        //read user input
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble(); // Reads the base of the triangle from user input

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble(); // Reads the height of the triangle from user input

        // Calculate area
        double area = 0.5 * base * height;

        // Display the result
        System.out.print("The area of the triangle is: "  + area);
    }
}