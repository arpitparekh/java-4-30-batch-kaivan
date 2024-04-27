import java.util.ArrayList;
import java.util.Arrays;

public class ragged_array {

    public static void main(String[] args) {
        
        // Ragged array is a collection of array in which each element can content a varied no. of elements 
        // Irr-regular array 
        int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 1 } };

        
        // ArrayList<Integer> list = (ArrayList) Arrays.asList(arr); // convest 
        
        // list.add(12);

        for (int i = 0; i < arr.length; i++) {  // 0  // 1  // 2
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]); // 00  // 01  // 02  //  10  // 11  // 20
            }
            System.out.println();
        }
        

        int arr2[] = { 12, 23, 45, 56, 67, 67 }; //  0..5
        
        for (int t = 0; t < arr2.length; t++) {
            System.out.println("["+t+"] => "+arr2[t]);
        }

        for (int a : arr2) { // advance for loop
            System.out.println(a);
        }
        
        int arr3[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        
        Student obj = new Student();
        obj.sumNew(arr3);


        int arr4[][][] = {
                { { 1, 2 }, { 1, 2 }, { 1, 2 } },
                { { 1, 2 }, { 1, 2 }, { 1, 2 } },
                { { 1, 2 }, { 1, 2 }, { 1, 2 } }
            };
        for (int i = 0; i < arr4.length; i++) {

            for (int j = 0; j < arr4.length; j++) {

                for (int k = 0; k < arr4[i][j].length; k++) {
                    System.out.print(arr4[i][j][k] + " ");
                }

                System.out.println();
            }
        }



//         for(int i=0;i<arr.length; i++){
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//         int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
//         for (int i = 0; i < arr2.length; i++) {
//             for (int j = 0; j < arr2.length; j++) {
//                 System.out.print(arr2[i][j] + " ");
//             }
//             System.out.println();
//         }
    
        
//         public class ragged_array {

//     public static void main(String[] args) {
        
//         // Ragged array is a collection of array in which each element can content a varied no. of elements 
//         // Irr-regular array 
//         int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 1 } };
//         for(int i=0;i<arr2.length; i++){
//             for (int j = 0; j < arr2[i].length; j++) {
//                 System.out.print(arr2[i][j] + " ");
//             }
//             System.out.println();
//         }
//         int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
//         for(int i=0;i<arr2.length; i++){
//             for (int j = 0; j < arr2.length; j++) {
//                 System.out.print(arr2[i][j] + " ");
//             }
//             System.out.println();
//         }
        int arr5[][]={{1,2,3},{4,5,6},{7,8,9}};   //0
        int arr6[][]={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr7 = new int[3][3];

        for (int i = 0; i < 3; i++) { // 0

            for (int j = 0; j < 3; j++) { // 0

                arr7[i][j] = 0;

                for (int k = 0; k < 3; k++) { // 0
                    arr7[i][j] += arr5[i][k] * arr6[k][j];
                }

            }
        }
        
        System.out.println(Arrays.deepToString(arr7));

//     }
    
// }


    }
    
}
