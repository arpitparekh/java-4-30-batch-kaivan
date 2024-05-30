import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class KaivanCh9Q1 {

    public static void main(String[] args) {

        File file = new File("/home/arpit-parekh/bascom_projects/clone_project_java/file1.txt");
        File file2 = new File("/home/arpit-parekh/bascom_projects/clone_project_java/file2.txt");

        try {

            FileOutputStream os = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            String str = "Hello World";
            byte[] arr = str.getBytes();
            bos.write(arr);
            System.out.println("File Write Successfully");

            ///  file 1 ni andar hello world avi gayu

            bos.flush();
            bos.close();
            os.flush();
            os.close();

            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte arr3[] = new byte[bis.available()];
            bis.read(arr3);

            bis.close();
            fis.close();

            System.out.println(new String(arr3)); // data pachi lidho file 1 mathi
            System.out.println(Arrays.toString(arr3));

        
            FileOutputStream fos = new FileOutputStream(file2);
            BufferedOutputStream bof = new BufferedOutputStream(fos);
            bof.write(arr3);                                                 // data file 2 ma naikho

            System.out.println("Data Transfered Successfully");
            
            bof.close();
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
