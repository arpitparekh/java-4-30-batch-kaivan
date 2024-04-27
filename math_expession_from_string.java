public class math_expession_from_string {

    public static void main(String[] args) {

        String str = "34>4"; // "34>4"  // "Hello"  // characters

        int symbolIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {

            } else {
                symbolIndex = i;
            }
        }
        
        System.out.println(symbolIndex);

        String substring1 = str.substring(0, symbolIndex);
        String subString2 = str.substring(symbolIndex + 1, str.length());
        
        char symbol = str.charAt(symbolIndex);
        if (symbol == 62) {
            System.out.println("> is used");
        }

        System.out.println(substring1);
        System.out.println(subString2);

        int a1 = Integer.parseInt(substring1);
        int a2 = Integer.parseInt(subString2);

        System.out.println(a1 > a2);

    }
}
