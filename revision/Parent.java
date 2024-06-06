package revision;

public class Parent { // private // public // protected // default

    // oopc
    // done // inheritance // constructor chaining
    // done // polymorphism
    // abstraction
    // done // encapsulation // access modifiers
    // done // super this final static
    
    // multi threading
    // collection framework
    // file handling
    // exception handling // try catch finally throw // thorws
    // generics
    // recursion

    private String name;
    public int age;
    protected float weight;

    // public >> protected >> default >> private

    // Parent() {
    //     System.out.println("Parent default constructor");
    // }

    public Parent(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    protected void display() {
        System.out.println("name : " + name + " age : " + age + " weight : " + weight);
    }

}

// class Child {
//     public static void main(String[] args) {
//         Parent p = new Parent("Kaivan", 23, 1234.46f);
//         p.display();
//     }
// }

class Child2 extends Parent {

    Child2() {
        super("Kaivan", 23, 1234.46f);
    }

    public static void main(String[] args) {
        
        Child2 child2 = new Child2();
        child2.display();

        Parent p = new Parent("Jaimin", 45, 1.2f);
        p.display();

    }

}
