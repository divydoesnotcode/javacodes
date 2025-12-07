import java.util.Scanner;
public class search_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size;
        int count = 1;
        boolean isFound = false;

        System.out.print("Enter how many numbers you want : ");
        size = sc.nextInt();
        sc.nextLine();
        int [] numbers = new int[size];

        for (int i = 0; i<numbers.length;i++){
            System.out.printf("Enter number %d : ",count);
            count++;
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter number to search in the array : ");
        int search = sc.nextInt();

        for (int i = 0; i< numbers.length;i++ ){
            if (search==numbers[i]){
                i+=1;
                System.out.println("Element found at index : "+i);
                isFound = true;
                break;
            }
        }

        if (!isFound){
            System.out.println("Element cannot be found");
        }

    }
}
