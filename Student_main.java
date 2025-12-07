package projects.OOPS;

public class Student_main {
    static void main() {

        // Constructors
        Student student1 = new Student("SpongeBob",15,8.9);
        Student student2 = new Student("Patrick",34,7.3);
        Student student3 = new Student("Divy",21,9.09);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.Study();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.Study();


        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.Study();


    }
}
