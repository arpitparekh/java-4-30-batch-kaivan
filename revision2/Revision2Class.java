package revision2;

import revision.Parent;

public class Revision2Class {
    // public static void main(String[] args) {

    //     Parent p = new Parent("Yash", 22, 34.56f);
    //     p.display();

    // }
}

class Child3 extends Parent {

    Child3() {
        super("Yash", 22, 34.56f);
        display();
        System.out.println(weight);
    }

    public static void main(String[] args) {
        Parent p = new Parent("Jaimin", 25, 25.56f);
        // p.display();
    }

}

class Child4 {
    Child4() {
        Parent p = new Parent("Jaimin", 25, 25.56f);
        System.out.println(p.age);
    }
}
