// Method Overriding
public class Animal {
    static void main() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }
    void move(){
        System.out.println("The animal is moving....");
    }
}
class Dog extends Animal{

}
class Cat extends Animal{

}
class Fish extends Animal{
    @Override
    void move() {
        System.out.println("This one is swimming....");
    }
}
