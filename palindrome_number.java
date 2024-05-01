import java.util.Scanner;

public class palindrome_number {

    public void numberPelindrome(int x) {
        int copy = x;

        // 1456 // 6541

        // 1456 % 10 = 6
        // 1456 / 10 = 145

        // 145 % 10 = 5
        // 145 / 10 = 14

        // 14 % 10 = 4
        //

        int reverse = 0;

        while (x != 0) { // 1234 // 123 // 12 // 1

            int last = x % 10; // 4 // 3 // 2 // 1

            reverse = reverse * 10 + last; // 4 // 43 // 432 // 4321

            x = x / 10; // 123 // 12 // 1 // 0

        }

        if (reverse == copy) {
            System.out.println("Pelindrome che");
        } else {
            System.out.println("Not Plindrome");
        }

    }

    public static void main(String[] args) {

        new palindrome_number().numberPelindrome(new Scanner(System.in).nextInt());
        double pi = Math.random(); // rand()

    }
}
