import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        System.out.println("Your entered number is : "+a);
        sc.nextLine();

        System.out.println("Enter your name: ");
        String name = sc.nextLine(); // includes space
        System.out.println("Hello "+name);

        System.out.println("Enter your name again: ");
        String nameAgain = sc.next(); // does not include space
        System.out.println("Hello "+nameAgain);

        sc.next();

        System.out.println("Enter your GPA");
        double gpa = sc.nextDouble();
        System.out.println("Your GPA : "+ gpa);
        
        sc.close();
    }
}
