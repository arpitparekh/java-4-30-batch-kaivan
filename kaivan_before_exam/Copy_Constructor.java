package kaivan_before_exam;

public class Copy_Constructor {
    public static void main(String[] args) {

        Student1 s = new Student1(25, "Kaivan");
        s.display();
        Student1 s1 = new Student1(s);   // s1 is the copy of s  // deep copy
        s1.display();
        Student1 s2 = s;   // shallow copy
        s2.display();
        Student1 s3 = new Student1();
        
    }
}

class Student1 {
    
    private int age;
    private String name;

    Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Student1() {
        
    }

    Student1(Student1 s) {  // copy constructor
        this.age = s.age;
        this.name = s.name;
    }
    
    void display() {
        System.out.println("Name is " + name);
        System.out.println("Age is "+age);
    }

}
