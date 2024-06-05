public class MyClass {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.max(12, 29));
    }
}

class A {
    int max(int x, int y) { // x = 31 // 22
        if (x > y)
            return x;
        else
            return y;
    }
}

class B extends A {
    int max(int x, int y) { // 22 // 31
          return super.max(y, x) - 10; // 21
    }
    
}

class C extends B { 
    int max(int x, int y) {  // x = 12 y =29
        return super.max(x + 10, y + 2);
    }
}