
import java.util.Scanner;

public class Password{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        int score = 0;

        // Check length
        if (password.length() >= 8) score++;
        else System.out.println("❌ Password must be at least 8 characters.");

        // Check for uppercase letter
        if (password.matches(".*[A-Z].*")) score++;
        else System.out.println("❌ Add at least one uppercase letter.");

        // Check for lowercase letter
        if (password.matches(".*[a-z].*")) score++;
        else System.out.println("❌ Add at least one lowercase letter.");

        // Check for digit
        if (password.matches(".*\\d.*")) score++;
        else System.out.println("❌ Add at least one number.");

        // Check for special character
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) score++;
        else System.out.println("❌ Add at least one special character (!@#$...)");

        // Determine strength
        System.out.println("\n🔐 Password Strength: ");
        if (score <= 2) {
            System.out.println("⚠️ Weak");
        } else if (score == 3 || score == 4) {
            System.out.println("✅ Moderate");
        } else {
            System.out.println("💪 Strong");
        }

        scanner.close();
    }
}
// This program checks the strength of a password based on length, character types, and provides feedback.
// It uses regular expressions to validate the presence of uppercase letters, lowercase letters, digits, and special characters.
// The password strength is categorized into weak, moderate, and strong based on the number of criteria
