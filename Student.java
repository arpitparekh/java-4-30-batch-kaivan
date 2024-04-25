public class Student {

    static void kaivan2() {
        System.out.println("From Function Student class");
    }

    int function() {

        System.out.println("Ello");

        int a = 23;
        int b = 34;
        return a + b;
    }
    
    void mySum(int a, int b) {
        System.out.println(a + b);
    }

    float myDiv(int a, int b) {
        return a / b;
    }
    
    String sir(String a) {
        return a;
    }
    String rev(String b){
        String S1="";
        for (int i = b.length() - 1; i >= 0; i--) {
            S1 = S1 + b.charAt(i);
        }
        return S1;
    }
    
}
