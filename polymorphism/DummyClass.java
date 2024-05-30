public class DummyClass {

    public static void main(String[] args) {

        B b = new B();
        A a = new A();

        b.function();
        a.function();

        // B b1 = new A(); // no chale
        A a2 = new B(); // you can create parent class object with child class reference
        
        a2.function();
 
        A a1 = new B(); // possible            // up casting
        a1.function();  // b nu function
        
        B b1 = (B) a1; // object casting   // down casting
        b1.function();

        // String a = new Student();

    }

}

class A {
    public void function() {
        System.out.println("From A Class");
    }
}

class B extends A{
    public void function() {
        System.out.println("From B Class");
    }

    public int max(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'max'");
    }

}
