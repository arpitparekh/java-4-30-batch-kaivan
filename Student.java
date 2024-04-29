
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

    String rev(String b) {
        String S1 = "";
        for (int i = b.length() - 1; i >= 0; i--) {
            S1 = S1 + b.charAt(i);
        }
        return S1;
    }
    // Don't givee size while declaring an array inside a parameter(while making a function)
    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    void findMin(float arr[]) {

        float min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("minium value of the array is " + min);
    }
    
    String[] toUpper(String arr[]) { // Hello // Hi

        String[] newArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) { // 0 // 1
            newArr[i] = arr[i].toUpperCase();
        }

        return newArr;
    }

    void sumNew(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
                sum += arr[i][j];
            }

        }
        
        System.out.println("Sum of an Array is:"+sum);
    }

}
