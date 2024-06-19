package Exercitiu4;

public class Car {


    int numberOfWheels;
    int topSpeed;
    String brand;
    String color;


    int currentSpeed;
    int currentGear;


    public Car(int numberOfWheels, int topSpeed, String brand, String color) {
        this.numberOfWheels = numberOfWheels;
        this.topSpeed = topSpeed;
        this.brand = brand;
        this.color = color;


    }

    public void startCar() {
        currentGear = 1;
        currentSpeed = 1;
    }

    public void accelerate(int extraSpeed) {
        this.currentSpeed += extraSpeed;
    }

    public void gearUp() {

        currentGear++;

    }

    public void gearDown() {
        currentGear--;


    }
}
