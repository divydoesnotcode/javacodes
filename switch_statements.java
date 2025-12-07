import java.util.Scanner;
public class switch_statements {
    public static void main(String[] args){
        // Enhanced switch = A replacement to many else if statements
        //
        //            (Java14 Feature)

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Name of a Day in week : ");
        String day = sc.nextLine().toLowerCase();

        switch (day){
            case "monday", "tuesday","wednesday","thursday","friday"-> System.out.println("It is a weekday");
            case "saturday","sunday" -> System.out.println("It is weekend");
            default -> System.out.print(day+" is not a day in the week");
        }
    }
}
