package PastPractice;

class Vehicle {
    void run() {
        System.out.println("PastPractice.Vehicle is running");
    }
}

public class Bike extends Vehicle{
    void run() {
        System.out.println("PastPractice.Bike is running safely");
    }
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}
