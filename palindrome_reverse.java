
import java.util.Scanner;

public class palindrome_reverse {
    
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();  // hello
        String s1="";
        for (int i = s.length() - 1; i >= 0; i--) {  // 4..0
            
            s1 = s1 + s.charAt(i);
        }
        System.out.println(s.equals(s1) ? "Palindrome" : "Nathi");
    }
}
