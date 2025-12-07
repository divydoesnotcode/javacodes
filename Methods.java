import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = sc.nextLine();

        happyBirthday(name);
        double result = square(3);
        System.out.println(result);
    }
    static void happyBirthday(String name){
        System.out.println("Happy Birthday to you !");
        System.out.println("Happy Birthday to you !");
        System.out.println("Happy Birthday !");
        System.out.println("Happy Birthday !");
        System.out.printf("Happy Birthday to you ! Dear %s\n",name);
    }

    static double square(double number){
        return number*number;
    }
}
