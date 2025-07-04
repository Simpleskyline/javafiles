import java.util.Scanner;
// This program checks if a number is even or odd
public class EvenOdd {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Check if the number is even or odd
        // If the number is divisible by 2, it is even; otherwise, it is
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        input.close();
    }
}