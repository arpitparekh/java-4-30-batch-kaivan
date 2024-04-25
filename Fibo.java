public class Fibo {
    
    // 1 1 2 3 5 8

    public static void main(String[] args) {
        

        int a = 0; // 0 // 1 // 1 // 2 // 3
        int b = 1; // 1 // 1 // 2 // 3 // 5

        int n = 5;

        while (n != 0) {
            
            int c = a + b; // 1 // 2 // 3 // 5 // 8

            System.out.println(b + " ");
            
            a = b;
            b = c;
            n--;
        }

    }

}
