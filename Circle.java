import java.util.Scanner;

public class Circle{
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area
        double area = 0.5*3.14(radius*radius); 

        // Display the result
        System.out.println("The area of the circle is: " + area);

        scanner.close(); // Closes the scanner to free up resources
    }
}