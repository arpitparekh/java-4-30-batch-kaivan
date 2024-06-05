public class Circle {

    private double radius; // 2

    public static void main(String args[]) {

        Circle c1 = new Circle(2);
        System.out.println("Area " + c1.getArea());

        B b1 = new B(2, 2);
        System.out.println("Area " + b1.getArea());

        // G g;
        // g.fun();

        String name = "12121gfg";
        int number = Integer.parseInt(name);
        System.out.println(number);

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

class B extends Circle {
    private double length;

    B() {
        super(12.1);
    }

    B(double radius, double length) {
        super(radius);
        this.length = length;
    }

    public double getArea() {
        return (super.getArea() * length);
    }
}


class G {
    void fun() {
        System.out.println("Fun");
    }
}