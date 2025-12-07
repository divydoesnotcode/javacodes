import java.rmi.MarshalException;

public class Math_functions {
    static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.E+"\n");

        double result;
        result = Math.pow(2,3);
        System.out.print("Power : "+result);
        result = Math.abs(-5);
        System.out.print("Absolute value : "+result);
        result = Math.sqrt(9);
        System.out.print("Square root : "+result);
        result = Math.round(3.14);
        System.out.println("Round Function : "+result);
        result  = Math.ceil(3.14);
        System.out.println("Top value Round: "+result);
        result = Math.floor(3.14);
        System.out.println("Bottom value Round : "+ result);

    }
}
