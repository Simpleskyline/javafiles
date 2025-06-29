import java.util.Scanner;
public class Calculator {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get first number
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        // Get operator
        System.out.print("Enter operator (+, -, *): ");
        char operator = input.next().charAt(0);

        // Get second number
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double result;

        // Perform calculation
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operator.");
        }

        input.close();
    }
    
}
