
import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {

        System.out.println("Enter One Number");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 20

        int oddSum = 0;
        int evenSum = 0;

        while (n != 0) {

            if (n % 2 == 0) {
                evenSum = evenSum + n;  // 20  // 18
            } else {
                oddSum = oddSum + n;  // 19  // 17
            }
            n--;
        }

        System.out.println("Sum is " + (evenSum+oddSum));
        System.out.println("EvenSUM is " + evenSum);
        System.out.println("OddSUM is " + oddSum);

        sc.close();
    }
}
