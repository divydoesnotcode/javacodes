package projects.OOPS;

public class inheritance {
    public class Animal{
        boolean isAlive;

        Animal(){
            isAlive = true;
        }
        void eat(){
            System.out.println("The animal is eating...");
        }
    }
    public class Dog extends Animal{

    }
    public  class Cat extends Animal{

    }

    public static void main(String[] args){

    }
}
