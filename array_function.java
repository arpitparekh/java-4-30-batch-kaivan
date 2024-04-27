import java.util.Arrays;

public class array_function {

    public static void main(String[] args) {
        
        // Arrays
        int arr5[] = { 5, 4, 1, 4, 5 };
        
        float[] f = new float[5];
        
        f[0] = (float)12.34;
        f[1] = (float)11.44;
        f[2] = (float)10.14;
        f[3] = (float)99.04;
        f[4] = (float)66.33;
        
        double[] d = new double[2];
    
        d[0]=12.33;
        d[1]=7.77;
        
        Arrays.sort(d);
        System.out.println(Arrays.toString(f));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.binarySearch(d, 0, 1, 7.77));
        
        String[] arr = { "Hello", "Hi", "Kem Cho", "chal be", "Amigos", "Sayonara" };
        String[] arr1 = { "Hello", "Hi", "Kem Cho", "Hola", "Amigos", "Sayonara" };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.compare(arr, arr1)); // it is widely used function
        String[] arr3 = Arrays.copyOfRange(arr, 0, 4);

        System.out.println(Arrays.toString(arr3));

        String arr4[] = new String[10];

        System.arraycopy(arr, 3, arr4, 1, 3);

        System.out.println(Arrays.toString(arr4));

        Student s= new Student();
        s.printArray(arr5);
        s.findMin(f);

        String[] ar=s.toUpper(arr1);

        System.out.println(Arrays.toString(ar));
    }
    
    
}
