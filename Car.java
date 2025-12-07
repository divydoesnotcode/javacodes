package projects.OOPS;

public class Car {
    String make = "BMW";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You started the engine....");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stopped the engine....");
    }

    void drive(){
        System.out.println("You drive the "+model);
    }
}
