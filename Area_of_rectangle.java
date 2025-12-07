import java.util.Scanner;
public class Area_of_rectangle {
    public static void main(String[] args){
        double area=0;
        double width =0;
        double height =0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width : ");
        width = sc.nextDouble();

        System.out.print("Enter height : ");
        height = sc.nextDouble();

        area = width*height;

        System.out.print("Area of Rectangle : " + area);

        sc.close();

    }
}
