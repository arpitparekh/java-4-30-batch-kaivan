import java.util.Date;
import java.util.Random;

public class random_date {
    public static void main(String[] args) {
        
        Random r = new Random();

        for (int i = 0; i <= 50; i++) {
            int value = r.nextInt(20);
            System.out.print(value + " ");
        }
        
        System.out.println();

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime()); // 1900

        // Date date1 = new Date(1996,7,9);

    }
}
