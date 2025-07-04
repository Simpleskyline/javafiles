import java.util.Scanner;

//declares a public class named PrimeCheck
public class PrimeCheck {
    public static void main(String[] args) {
        
        //Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a number
        System.out.print("Enter a number to check if it is prime: ");
        int num = input.nextInt();

        boolean isPrime = true;

        //Any number less than or equal to 1 is not a prime number.
        if (num <= 1) isPrime = false;

        //Check for factors from 2 to the square root of num
        //If any factor is found, num is not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
           
            //If num is divisible by i, it is not prime
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println(num + " is prime.");
        else System.out.println(num + " is not prime.");
    }
}
