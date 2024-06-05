// add import
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;


public class KaivanCh9Q2 {
    public static void main(String[] args) {

        File file = new File("/home/arpit-parekh/bascom_projects/clone_project_java/number.txt");
        File file1 = new File("/home/arpit-parekh/bascom_projects/clone_project_java/even.txt");
        File file2 = new File("/home/arpit-parekh/bascom_projects/clone_project_java/odd.txt");

        try {

            FileOutputStream fText = new FileOutputStream(file);
            int number = 324324234;
            byte[] b = String.valueOf(number).getBytes();
            fText.write(b);

            System.out.println("Numbers File Generated");

            fText.close();

            FileInputStream fin = new FileInputStream(file);
            byte arr[] = new byte[fin.available()];

            fin.read(arr);

            fin.close();

            String returnOutput = new String(arr);

            System.out.println(returnOutput);  // 23121212

            String odd = "";
            String even = "";

            for (int i = 0; i < returnOutput.length(); i++) {
                if (Integer.parseInt(String.valueOf(returnOutput.charAt(i))) % 2 == 0) {
                    even += returnOutput.charAt(i);
                } else {
                    odd += returnOutput.charAt(i);
                }
            }

            FileOutputStream fos1 = new FileOutputStream(file1);
            FileOutputStream fos2 = new FileOutputStream(file2);
            
            byte[] b1 = even.getBytes();
            byte[] b2 = odd.getBytes();

            fos1.write(b1);
            fos2.write(b2);

            fos1.close();
            fos2.close();

            System.out.println("Even odd Sperarted Successfully");
          
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }
}
