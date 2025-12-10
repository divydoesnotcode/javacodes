public class polymorphism {
    public static void main(String[] args){
        // POLYMORPHISM = 'POLY' = many
        //                  'MORPH' = shape
        //                  objects can identify as other objects.
        //                  objects can be treated as objects of a common superclass
        Car car = new Car();
        Bike bike  = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car,bike,boat};

        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}

abstract class vehicle{
    abstract void go();
}

class Car implements Vehicle{
    @Override
    public void go(){
        System.out.println("You drive the Car");
    }
}

class Bike implements Vehicle{
    @Override
    public void go(){
        System.out.println("You ride the Bike");
    }
}

class Boat implements Vehicle{
    @Override
    public void go(){
        System.out.println("You sail the boat");
    }
}

interface Vehicle{
    void go();
}