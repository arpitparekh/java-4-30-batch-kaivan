public class Question15 {
    public static void main(String[] args) {
        C1 c1 = new C1();
        System.out.println(c1.max(12, 29)); // 21 is the answer

        

    }
}

// visibility modifer = 

class A1 {
    int max(int x, int y) {  // x = 31  y = 22
        if (x > y)
            return x; 
        else
            return y; 
    }
}

class B1 extends A1 {
    int max(int x, int y) { // x = 22 y = 31

        return super.max(y, x) - 10;   // 21
    }
}

class C1 extends B1 {
    int max(int x, int y) { // x = 12  // y = 29
        
        return super.max(x + 10, y + 2);  // 22  // 31


    }
}