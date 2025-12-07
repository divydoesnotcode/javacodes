import java.util.Scanner;
public class Substr {
    public static void main(String[] args){
        // substring() = A method used to extract a portion of the string.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email : ");

        String email = sc.nextLine();

        if (email.contains("@")) {
            String uname = email.substring(0, email.indexOf("@"));
            String domain = email.substring(12, 21);
            System.out.println("Username : "+uname);
            System.out.println("Domain : "+domain);
        } else {
            System.out.println("Enter valid email address.");

        }
    }
}
