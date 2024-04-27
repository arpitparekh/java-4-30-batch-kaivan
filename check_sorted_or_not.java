import java.util.Arrays;

public class check_sorted_or_not {

    public static void main(String[] args) {
        
        int arr[] = { 7, 3, 6, 7, 8, 4, 9, 1, 5 };


        // i = 1  // j = 5
        // 7 3 6 7 8 4 9 1 5
        // 3 7 6 7 8 4 9 1 5
        // 1 7 6 7 8 4 9 3 5
        // 1 3 7 7 8 6 9 4 5
        // 

        // without Arrays.sort()
        // find minium element from array  or maximum

        int min = arr[0];  // 0
       
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        System.out.println("Minimum:̀" + min);
        
        // no lets sort this array program

        for (int i = 0; i < arr.length; i++) { // 7

            int temp = 0;

            for (int j = i + 1; j < arr.length; j++) { // 3 

                temp = arr[i];

                if (arr[i] > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        

        System.out.println(Arrays.toString(arr));


        // check sorted or not program

        boolean b = true;


        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    b = false;
                    break;

                }
            }
        }
        
        if (b) {
            System.out.println("sorted");
        } else {
            System.out.println("unsorted");
        }

    }
}
