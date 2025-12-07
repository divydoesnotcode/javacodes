public class Printf_function {
    static void main() {
        String name = "Thomas";
        int age = 35;
        double gpa = 4.5;
        char bloodType = 'o';
        boolean isEmployed = true;

        System.out.printf("Hello %s.\n",name);                    // %s for String
        System.out.printf("%s is %d years old.\n",name,age);      // %d for int
        System.out.printf("He has %.1f GPA.\n",gpa);                    // %f for double
        System.out.printf("His blood type is %c\n",bloodType);    // %c for char
        System.out.printf("He is also %b\n",isEmployed);          // %b for Boolean

        // Now with precision
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.1f\n",price1);
        System.out.printf("%.1f\n",price2);
        System.out.printf("%.1f\n",price3);
    }
}
