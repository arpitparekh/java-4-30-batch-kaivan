package inner_class;

// inner class

public class OuterClass {

    private int a;
    private int b;

    void dfun() {
        System.out.println("Outer class method");
    }

    // inner class

    class InnerClass {

        int k;
        int l;

        void dfun() {
            System.out.println("Inner class method");
        }

    }
    
    public static void main(String[] args) {
        
        OuterClass oc = new OuterClass();
        oc.dfun();
        // make inner class object
        OuterClass.InnerClass ic = new OuterClass().new InnerClass();
        ic.dfun();

        // pimitive datatypes

        int a = 12;
        float f = 34.45f;
        double d = 45.45;
        boolean b = true;
        short s = 34;
        long l = 123456789;
        char c = 'A';
        byte bt = 12;
        
        // Wrapper class

        Integer a1 = 12;
        Float f1 = 34.45f;
        Double d1 = 45.45;
        Boolean b1 = true;
        Short s1 = 34;
        Long l1 = 123456789L;
        Character c1 = 'A';
        Byte bt1 = 12;
        
    }
    
}
