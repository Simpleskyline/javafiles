import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask user for radius
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            if (radius < 0) {
                System.out.println("Radius cannot be negative.");
            } else {
                // Area = π * r^2
                double area = Math.PI * Math.pow(radius, 2);
                System.out.printf("The area of the circle is: %.2f\n", area);
            }

        } catch (Exception e) {
            System.out.println("⚠️ Invalid input. Please enter a numeric value.");
        } finally {
            scanner.close();
        }
    }
}
