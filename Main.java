public class Main{
    public static void main(String[] args){

        // Primitive Data Type - stored directly in the memory (stack)
        int age = 45;
        double cgpa = 9.09;
        char grade = 'A';
        Boolean isStudent = true;

        System.out.println("I am "+age+" years old.");
        System.out.println("I have " + cgpa + " CGPA.");
        System.out.println("And on top of that I have " + grade + " grade.");
        if (isStudent) {
            System.out.println("This is a student.");
        } else {
            System.out.println("This is not a student.");
        }

        // Reference data type - stored in memory address that points to the heap
        String name = "Divy";
        System.out.println("My name is " + name + ".");

    }
}