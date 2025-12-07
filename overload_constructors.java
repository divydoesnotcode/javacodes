package projects.OOPS;

public class overload_constructors {
    String username;
    String email;
    int age;

    overload_constructors(String username){
        this.username = username;
    }
    overload_constructors(String username, String email){
        this.username = username;
        this.email = email;
    }
    overload_constructors(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }

    public static void main(String[] args){
        overload_constructors oc1 = new overload_constructors("Divy");
        overload_constructors oc2 = new overload_constructors("John", "wick@gmail.com");
        overload_constructors oc3 = new overload_constructors("John", "wick@gmail.com",21);

        System.out.println(oc1.username);

        System.out.println(oc2.username);
        System.out.println(oc2.email);

        System.out.println(oc3.username);
        System.out.println(oc3.email);
        System.out.println(oc3.age);


    }
}
