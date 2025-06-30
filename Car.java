public class Car {

    // Attributes
    String make = "Chevrolet";
    String model = "Camaro";
    int year = 2023;
    String color = "Red";
    double price = 35000.00;

    // Methods
    void drive() {
        System.out.println("The car is driving.");
    }

    void brake() {
        System.out.println("The car is braking.");
    }

    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car();

        // Access attributes
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Color: " + myCar.color);
        System.out.println("Price: $" + myCar.price);

        // Call methods
        myCar.drive();
        myCar.brake();
    }
}
// This code defines a simple Car class with attributes and methods.
// It creates an instance of the Car class and demonstrates accessing its attributes and calling its methods.