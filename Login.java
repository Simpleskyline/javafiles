// File: Login.java
// This code implements a simple login system with signup and login functionalities.
import java.util.HashMap; 
import java.util.Scanner;

public class Login {
    // HashMap to store usernames and passwords
    // Using HashMap for quick access to user credentials
    private static HashMap<String, String> users = new HashMap<>();
    // Scanner for user input

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Login System ===");
            System.out.println("1. Signup");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            
            switch (choice) {
                case 1:
                    signup();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
    // Method to handle user signup
    // It prompts the user for a username and password, checks if the username already exists,
    private static void signup() {
        System.out.print("Enter a new username: ");
        String username = scanner.nextLine();

        // Check if the username already exists
        // If it does, prompt the user to choose another one
        if (users.containsKey(username)) {
            System.out.println("⚠️ Username already exists. Try another.");
            return;
        }

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        users.put(username, password); // Store the username and password in the HashMap
        System.out.println("✅ Signup successful!");
    }

    private static void login() {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("✅ Login successful! Welcome, " + username + "!");
        } else {
            System.out.println("❌ Incorrect username or password.");
        }
    }
}
// This code implements a simple login system with signup and login functionalities.