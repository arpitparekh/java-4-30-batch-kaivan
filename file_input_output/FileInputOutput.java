import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileInputOutput {
    
    public static void main(String[] args) {
        
        // Stream  // sequence of data

        // Byte stream
        // character stream

        
        // character stream   // TEXT IO

        // FileReader // FileWriter // write
        // BufferReader // BufferWritter

        try {

            File file = new File("/home/arpit-parekh/bascom_projects/hello.txt");
            // FileWriter fw = new FileWriter(file);

            // BufferedWriter bw = new BufferedWriter(fw);

            // String str = "Bascom Student 1"; // '1'

            // bw.write(str);


            // System.out.println("File Write Successfully");

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);


            int i;
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
            }
        
            br.close();
            // bw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ////////////////////////////////////////////////////////

        

    
    }

}