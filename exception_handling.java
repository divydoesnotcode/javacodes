import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_handling {
    static void main() {
        // Exception Handling = An event that interrupts the normal flow of a program
        //                      (Dividing by zero, file not found, mismatch input type)
        //                      Surround any dangerous code with a try{} block
        //                      try{}, catch{}, finally{}

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter a number : ");
            int number = sc.nextInt();
            System.out.println(number);
        }catch (InputMismatchException e){
            System.out.println("Enter a number only");
        }
        finally {
            System.out.println("This always executes....");
        }
    }
}
