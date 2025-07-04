//declares a public class named PrimeCheck
public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;

        //Any number less than or equal to 1 is not a prime number.
        if (num <= 1) isPrime = false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println(num + " is prime.");
        else System.out.println(num + " is not prime.");
    }
}
