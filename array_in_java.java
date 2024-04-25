import java.util.Arrays;

public class array_in_java {

    public static void main(String[] args) {
        
        // group of similar type of elements

        int arr[] = { 12, 34, 56, 3, 56, 34, 56 }; // intialization and declaration

        int arr1[] = new int[5];  // in java array can be declared with new keyword

        arr1[0] = 12;
        arr1[1] = 13;
        arr1[2] = 14;
        arr1[3] = 15;
        arr1[4] = 16;

        // Array needs a for loop for printing
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        /////////////////////////////////////////////////

        


    }
    
}
