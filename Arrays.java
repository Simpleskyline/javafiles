class Car {
    String make;
    String model;

    Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    void display() {
        System.out.println("Make: " + make + ", Model: " + model);
    }
}

public class CarGrid {
    public static void main(String[] args) {
        Car[][] garage = new Car[2][2];

        garage[0][0] = new Car("Toyota", "Corolla");
        garage[0][1] = new Car("Honda", "Civic");
        garage[1][0] = new Car("Ford", "Mustang");
        garage[1][1] = new Car("Chevrolet", "Camaro");

        System.out.println("Garage layout:");
        for (int i = 0; i < garage.length; i++) {
            for (int j = 0; j < garage[i].length; j++) {
                garage[i][j].display();
            }
        }
    }
}
