public class command_line_arguments {

    public static void main(String[] args) {
        
        String arr[] = { args[0], args[1], args[2], args[3], args[4] };

        int n = 0;
        
        for (int i = 0; i < arr.length; i++) {

            int value = Integer.parseInt(arr[i]);

            if (value < 0) {
                n++;
            }
        }
        System.out.println("Negetive numbers are " + n);
    }
}
