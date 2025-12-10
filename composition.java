public class composition {
    static void main() {
        // Composition = Represents a 'part-of' relationships between objects.
        //              For example, an engine is 'part of' a car.
        //              Allows complex objects to be constructed for smaller objects.

        String a = Integer.toString(5);
        int b = Integer.parseInt("6");

        car car = new car("Lexus LFA",2010,"V10");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);
    }
}
class Engine{
    String type;
    Engine(String type){
        this.type = type;
    }
}
class car{
    String model;
    int year;
    Engine engine;
    car(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }
}
