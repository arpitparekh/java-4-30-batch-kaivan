package revision.polymorph;

public class Poly2 {
    void fun() {
        System.out.println("fun() in Poly2");
    }
}

class ChildPoly extends Poly2 {

    @override
    void fun() {  // override
        System.out.println("fun() in ChildPoly");
    }
}

class Master {
    public static void main(String[] args) {
        ChildPoly childPoly = new ChildPoly();  // no cast
        childPoly.fun();

        Poly2 poly2 = new ChildPoly();  // downcast
        poly2.fun();

        Poly2 poly3 = new Poly2();  // no cast
        poly3.fun();

        // upcasting
        // downcast

        ChildPoly childPoly2 = (ChildPoly) poly2;  // upcast
        childPoly2.fun();

    }
}
