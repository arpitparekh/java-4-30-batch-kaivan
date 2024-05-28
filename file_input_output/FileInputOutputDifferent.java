import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputDifferent {
    public static void main(String[] args) {
        
        // Byte Stream

        // FileInputStream
        // FileOutputStream

        File file = new File("/home/arpit-parekh/bascom_projects/hello2.txt");

       try{
            FileOutputStream os = new FileOutputStream(file);
            String str = "Hello World";
            byte[] arr = str.getBytes();
            os.write(arr);
            System.out.println("File Write Successfully");


            FileInputStream is = new FileInputStream(file);
            byte[] arr2 = new byte[1024];
            is.read(arr2);
            String str2 = new String(arr2);
            System.out.println("File Read Successfully");
            System.out.println(str2);
            // close()
            os.close();
            is.close();


       }catch(Exception e){
            System.out.println(e.getMessage());
       }
    }    
}
