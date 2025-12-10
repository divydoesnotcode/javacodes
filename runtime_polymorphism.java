import java.util.Scanner;

public class runtime_polymorphism {
    public static void main(String[] args){
        // Runtime polymorphism = When the method that gets executed is decided
        //                          at runtime based on the actual type of object.

        Scanner scanner = new Scanner(System.in);
        animal animal;

        System.out.println("Would you like a dog or a cat ? (1 = dog, 2 = cat) : ");
        int choice = scanner.nextInt();

        if (choice ==1 ){
            animal = new dawg();
            animal.speak();
        } else if (choice == 2) {
            animal = new billi();
            animal.speak();
        }else {
            System.out.println("Enter correct choice.");
        }

    }
}
abstract class animal{
    abstract void speak();
}
class dawg extends animal{
    @Override
    void speak(){
        System.out.println("Whoof Woof");
    }
}
class billi extends animal{
    @Override
    void speak(){
        System.out.println("Meow meow");
    }
}