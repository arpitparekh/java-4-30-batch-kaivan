import java.util.Scanner;

public class function_in_java {

    static void kaivan() // Void=Return type // Kaivan=Function name // ()Parameter pass
    {
        System.out.println("From Function Same class");
    }

    public static void main(String[] args) {

        kaivan(); // Same class direct call
        // Student.kaivan2(); if function is static
        Student s = new Student(); // Student is a class called by making a object
        s.kaivan2(); //kaivan2 is a function // s is an object made here
        
        System.out.println(s.function());
        s.mySum(12, 13);

        System.out.println(s.myDiv(12, 13));
        System.out.println(s.sir("Kaivan"));
        String user = new Scanner(System.in).nextLine();
        System.out.println(user.equals(s.rev(user))?"yes":"no");
    }

}

