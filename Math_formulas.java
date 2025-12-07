import java.util.Scanner;
public class Math_formulas {
    static void main() {

        // Hypotenuse c = Math.sqrt(a^2 + b^2)

        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("### Hypotenuse ###");
        System.out.print("Enter the length of side A : ");
        a = sc.nextDouble();
        System.out.print("Enter the length of side B : ");
        b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.print("The Hypotenuse side C is : "+c);

        // Circumference = 2 * Math.PI * radius
        System.out.println("\n ### Circumference ###");
        // Declaring variables to store input values
        double radius;
        double Result;

        // Getting radius from the circle
        System.out.print("Enter radius of circle : ");
        radius = sc.nextDouble();

        // Calculating the circumference
        Result = 2*Math.PI*radius;
        // Output result
        System.out.println("The Circumference of circle is : "+Result);

        // AREA OF CIRCLE
        // Area = Math.PI * Math.pow(radius,2);

        System.out.println(" ### Area of Circle ### ");

        // No need to declare variable we can reuse the variable from circumference
        // Getting radius from the user
        System.out.print("Enter radius of circle : ");
        radius = sc.nextDouble();

        // Calculating the Area
        Result = Math.PI * Math.pow(radius,2);

        // Result output
        System.out.println("The Area of Circle is : "+ Result);

        // VOLUME OF CIRCLE
        // Volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

        System.out.println(" ### Volume of Circle ###");

        // Getting radius from the user
        System.out.print("Enter radius of circle : ");
        radius = sc.nextDouble();

        // Calculating volume
        Result = (4.0/3.0) * Math.PI * Math.pow(radius,3);

        // Result output
        System.out.println("The Volume of Circle is : "+ Result);

        sc.close();
    }
}
