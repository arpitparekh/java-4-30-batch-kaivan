class class_revision {
    public static void main(String[] args) {

        // oopc
        // polymorphism  // method overloading // mrthod overring
        // abstraction // hide data // abstract class // asbtarct methods  // interface
        // inheritance
        // encapsulation

        Beta b = new Beta();
        b.pleaseUseMe();
        System.out.println(b.g);

    }
}

class Beta extends Alpha {

    @Override
    void pleaseUseMe() { // jabbardasti  // mendatory
        
        System.out.println("Please Use Dustbin");
    }

    @Override
    void callData() {    // not compulsary
        super.callData();
    }
    
}


abstract class Alpha extends Gamma{

    int a = 0;
    float f;
    double d;

    void callData() { // concrete function
    }

    abstract void pleaseUseMe();

}


class Gamma {
    int g = 56;
}

///////////////////////////////////// interface /////////////////


interface MyInterface {   // collection of abstract method
    int ab1();

    void ab2();

    abstract String ab3();
}


class Master {

    public static void main(String[] args) {

        
        new MyInterface() {

            @Override
            public int ab1() {
                return 12;
            }

            @Override
            public void ab2() {
              
            }

            @Override
            public String ab3() {
                return "Hello";
            }
        };

    }
    
}


