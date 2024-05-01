public class SuperClassDemo {
    public static void main(String[] args) {

        ChildClass cs = new ChildClass();

        // cs.money = 1200;
        // cs.collegeName = "LD";
        // cs.hasHome = true;
        // cs.hasEducation= true;

        cs.initializeProperty(1200, true, "Nirma", true); // child class
        cs.initializeProperty(true); // parent
        cs.printProperies();
        cs.meraDesh();
    }

    
    //Polymorphism more than many form

    // method overloding

    void functionOne() {

    }
    
    void functionOne(String y) {

    }

    void functionOne(int x) {

    }

    void functionOne(int a, String b) {

    }
    
    void functionOne(String b,int a) {

    }
}
