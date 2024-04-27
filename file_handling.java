import java.io.*;

public class file_handling {
    
    // java.io

    // Stream

    // sequence of data

    // .txt 

    public static void main(String[] args) {
        
        // File

        try{

            File file = new File("/home/arpit/MyFolder");

            file.mkdir();

            File newFile = new File(file, "hello.txt");
        
            newFile.createNewFile();

        } catch (IOException e) {
            
            System.out.println(e.getMessage());
            
        }

    }

}
