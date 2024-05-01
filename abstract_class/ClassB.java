public class ClassB extends ClassA {

    @Override
    void myFunction() {
        
    }

    @Override
    int myFunction2() {
        return 12;
    }
    
    public static void main(String[] args) {
        
        ClassB b = new ClassB();
        b.myFunction();
        b.myFunction2();
        b.print();

    }
        
}
