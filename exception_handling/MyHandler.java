public class MyHandler {


    void goa() {
        
    }

    public static void main(String[] args) {

        try {

            System.out.println("Statement 1");
            System.out.println("Statement 2");
            System.out.println("Statement 3");
            System.out.println("Statement 4");

            System.out.println(12 / 0);

            System.out.println("Statement 5");
            System.out.println("Statement 6");
            System.out.println("Statement 7");
            System.out.println("Statement 8");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Always works");
        }

        System.out.println("Statement 9");
        System.out.println("Statement 10");

        MyHandler handler = null;

        handler.goa();

    }

}
