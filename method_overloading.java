public class method_overloading {
    public static void main(String[] args){
        // Overload methods = methods that share the same name
        //                      but different parameters.
        String pizza = bakePizza("flatbread", "mozzarella");
        System.out.println(pizza);
    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread,String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread,String cheese, String toppings){
        return cheese + " " + toppings + " " + bread + " pizza";
    }
}
