package projects.OOPS;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa){
        this.name = name;
        this.gpa = gpa;
        this.age = age;
    }
    void Study(){
        System.out.println(this.name + " is Studying..");
    }
}
