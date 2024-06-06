package revision.inherit;

public class MyInheritClass {

    static {
        System.out.println("MyInheritClass static block");
    }

    static {
        System.out.println("MyInheritClass static block 2");
    }

    static int a = 12;
    
    final int f = 23;


    public static void main(String[] args) {
        
        A a = new A(12, 13);
        a.display();

        B b = new B();
        b.display();

        B b1 = new B(23, 25);
        b1.display();

        C c = new C(13, 14);
        c.display();

        MyInheritClass mi = new MyInheritClass();
        mi.a = 13;
        MyInheritClass mi2 = new MyInheritClass();
        System.out.println(mi2.a);
    }
}

class A {
    static {
        System.out.println("A static block");
        
    }

    int a;
    int b;

    void init(int a, int b) {  // 23  25
        this.a = a;
        this.b = b;
    }

    A(int a, int b) { // 20 40
        init(a, b);
    }

    A(int a,int b,int c){
        this(b, c);
    }

    // display
    void display() {
        System.out.println("a = " + a + ", b = " + b);
    }

}

class B extends A {
    B() {
        super(10, 20,40);
    }

    B(int a,int b){ // 23  // 25
        super(a,b,45);
    }
}

class C extends B {
    
    C() {
        super(45, 46);
    }

    C(int a, int b) {
        super();
    }
}

// class D extends A {

// }

class P {

}

class Q {

}