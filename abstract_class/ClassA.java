public abstract class ClassA {

    // abstraction
    // hiding
    // showing only important things 
    // give implementation to another class

    // abstract class

    // you can not create object of the abstract class

    int a = 12;
    String name = "";


    void print() {                     // normal method
        System.out.println(a);
        System.out.println(name);
    }

    // you can also create abstract propery and abstract function inside  a abstract class

    // function with out any body  // abstract function

    abstract void myFunction();

    abstract int myFunction2();
    
    
    
}
