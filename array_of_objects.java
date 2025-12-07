package projects.OOPS;

public class array_of_objects {
     String model;
     String color;

    array_of_objects(String model, String color){
        this.model = model;
        this.color = color;

    }
    void drive(){
        System.out.println("You drive the "+this.model +" "+ this.color);
    }

    public static void main(String[] args){
        array_of_objects car1 = new array_of_objects("BMW","M5 Competition");
        array_of_objects car2 = new array_of_objects("Lexus","LFA");

        array_of_objects[] cars = new array_of_objects[2];
        cars[0]=car1;
        cars[1]=car2;

        for (int i = 0; i< cars.length;i++){
            cars[i].drive();
        }
    }
}
