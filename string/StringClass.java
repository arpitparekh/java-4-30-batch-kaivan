import java.util.Arrays;
import java.util.Locale;

class StringClass {
    public static void main(String[] args) {

        // heap

        String name = "Arpit"; // string pool
        String name2 = new String("Maulik"); // saparate object

        System.out.println(name.charAt(0));
        System.out.println(name.codePointAt(0));

        System.out.println(name.compareTo("Arpit"));
        System.out.println(name.compareTo(name2));

        // string is immutable

        String name3 = "Kaivan";
        name3.charAt(2);
        name3.toUpperCase();

        System.out.println(name3);

        System.out.println(name3.length());

        // %d %f %lf

        double d = 12.34;

        System.out.println(name3);

        System.out.println(name3.format("hello %.2f", d));

        System.out.println(name3);

        System.out.println(name3.substring(0, 6));

        // name3 = Kaivan

        System.out.println(name3.indexOf("ivn"));

        System.out.println(Arrays.toString(name3.toCharArray()));

        // Locale locale1 = new Locale("EN", "INDIA");

        Locale locale1 = new Locale("EN", "INDIA");  

        System.out.println(name3.toUpperCase(locale1));

        String goal = "   Goal     g";
        System.out.println(goal.trim());

        // StringBuffer and StringBuilder

        // make string mutable

        StringBuffer str = new StringBuffer("Kaivan");
        System.out.println(str);
        str.append("Shah");
        System.out.println(str);

        StringBuilder str1 = new StringBuilder("Maulik");
        System.out.println(str1);
        str1.append("Shah");
        System.out.println(str1);

        // Login
        // Signup
        // Home
        // Settings

        // Memory Queue // 

        // Thread // Runnable

    }
}
