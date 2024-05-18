public class MyException {

    public static void main(String[] args) {

        try {

            throw new ErrorAaviException("bhai aa error me banai che");


        } catch (Exception e) {

            if (e.getClass() == ErrorAaviException.class) {
                System.out.println(e.getMessage() + " Handle karo");
            }

        }

        A a = new A();
        a.bhai();

    }

}

class ErrorAaviException extends Exception {

    ErrorAaviException(String error) {
        super(error);
    }

}


class A{

    void bhai() throws ArithmeticException {
        
        
        throw new ArithmeticException("maro msg");
    }

}
