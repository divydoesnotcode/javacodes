public class getter_setter {
    public static void main(String[] args){
        // They help protect object data and add rules for accessing or modifying them
        // GETTER = methods that make a field READABLE
        // SETTER = methods that make a field WRITEABLE

        gedi car = new gedi("Charger","Green",10000);

        car.setColor("Blue");

        System.out.println(car.getModel()+" "+car.getColor()+" $"+car.getPrice());
    }
}
class gedi {
    private String model;
    private String color;
    private int price;
    gedi(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    int getPrice(){
        return this.price;
    }

    void setColor(String color){
        this.color = color;
    }
}
