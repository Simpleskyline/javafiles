/*import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?");
        String name = scanner.nextLine();
       
       scanner.close();
    }
}*/

import java.util.Scanner;

public class Input{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    // Prompt the user for their name
    System.out.print("What is your name? ");
    String name = scanner.nextLine();

    // Print a greeting message
    System.out.println("Hello, " + name + "!");
}
}