import java.util.*;

public class KaivanCh3Q9 {
    
    int searchString(String s, String arr[]) { // [a,b,c,d,s] // d  // search

        for (int i = 0; i < arr.length; i++) {
            if (s.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }
    
    String[] sort(String arr[]) { // [a,b,c,d,s] // d // sort
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ten Names:");
        String a[] = new String[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLine();
        }

        System.out.println("Original Array : " + Arrays.toString(a));
        KaivanCh3Q9 obj = new KaivanCh3Q9();

        System.out.println("Enter a name to search:");
        String search = sc.nextLine();

        int index = obj.searchString(search, a);

        if (index != -1) {
            System.out.println("Name found at index " + index);
        } else {
            System.out.println("Name not found");
        }

        String sortedArray[] = obj.sort(a);
        System.out.println("Sorted Array : "+ Arrays.toString(sortedArray));
        sc.close();
    }
}
