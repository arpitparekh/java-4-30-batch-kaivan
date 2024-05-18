import java.util.ArrayList;

class MyGenericClassDemo{
    public static void main(String[] args) {
        A a = new A();
        a.<String,Boolean>le("Le lai ja",true);
        a.le(121212,2323.23);
        a.le(121212.455,'g');
        a.le(false, "Hello");
        
        B b = new B();
        b.assign("Hello");
        System.out.println(b.get());

        B<Integer> b1 = new B();
        b1.assign(34);
        System.out.println(b1.get());
        
    }
}

class A {

    <T, K> void le(T value, K value2) {
        System.out.print(value + " ");
        System.out.println(value2);
    }

}

class B<T> {
    
    T value;

    void assign(T value) {
        this.value = value;
    }

    T get() {
        return value;   
    }

}

