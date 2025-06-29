import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user for the lengths of the triangle
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = 0.5 * base * height;

        // Display the result
        System.out.println("The area of the rectangle is: " + area);

        // Close the scanner to free up resources
        scanner.close();
}
}
