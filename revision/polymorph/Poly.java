package revision.polymorph;

public class Poly {

    int a;
    int b;

    // parameter different
    // paramter same // order must be different

    void fun() {
        System.out.println("This is a function of class Poly");
    }

    void fun(int q) {
        System.out.println("This is a function of class Poly with one parameter " + q);
    }
    
    void fun(float j) {
        System.out.println("This is a function of class Poly with one parameter " + j);
    }

    void fun(int a, float f) {
        System.out.println("This is a function of class Poly with two parameters " + a + " " + f);
    }

    void fun(float f, int a) {
        System.out.println("This is a function of class Poly with two parameters " + a + " " + f);
    }

    public static void main(String[] args) { // method overloading
        
        // Poly p = new Poly();
        Poly p; // reference variable
        Poly p1 = null; // null variable
        Poly p3 = new Poly(); // object

        String name = ""; // empty string
        String name1 = null; // null string
        String name2 = "Sachin"; // object


    }
    
}
