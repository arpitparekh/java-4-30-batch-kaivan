import java.util.Scanner;

public class prime_number_2 {

    public static void main(String[] args) {
        
        boolean kaivan = false;

        int n = new Scanner(System.in).nextInt();

        for (int j = 2; j < n; j++) { // 2..54 // 2..22

            if (n % j == 0) {
                kaivan = true;
                break;
            }

        }

        if (!kaivan) {
            System.out.println("Yes Prime che mara bhai");
        } else {
            System.out.println("Na Prime nathi mara bhai");
        }

    }
    
}
