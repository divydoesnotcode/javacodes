import java.util.Scanner;
public class array_input {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int count = 1;
        int size;

        System.out.print("Enter how many food items you want : ");
        size = sc.nextInt();
        sc.nextLine();

        String[] foods = new String[size];

        for (int i = 0; i<foods.length;i++){
            System.out.printf("Enter food %d : ",count);
            count++;
            foods[i] = sc.nextLine();
        }
        count = 1;
        for (String food : foods){
            System.out.println(count+". "+food);
            count++;
        }

        sc.close();
    }
}
