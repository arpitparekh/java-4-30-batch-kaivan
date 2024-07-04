abstract class Person{
    String name;
    String address;
    String phone_number;
    String email;

    abstract void displayDetails();

}

// class Student extends Person {
//     String enrollment;
//     String course;
//     @Override
//     void displayDetails() {
        
       
//     }
    
// }

class Employee extends Person{
    String office;
    String salary;
    String designation;
    @Override
    void displayDetails() {
        
        
    }
}

public class Que10_6 {
    public static void main(String[] args) {
        
    }
}
//Write an abstract class named Person and its two subclasses named Student and
//Employee. A person has a name, address, phone number, and email address.
//A student has enrollment, course. An employee has an office, salary, and designation.
//Define constructors and methods for input and display for both classes.
//Write a main program to give demonstration of all.
//(Jun-2019-OLD)[NLJIET] 07
