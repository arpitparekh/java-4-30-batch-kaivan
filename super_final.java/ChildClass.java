public class ChildClass extends ParentClass {

    public ChildClass() {
        super(12);
        System.out.println("This is child class");
    }
    
    boolean hasEducation = false;
    String collegeName = "";

    int moneyOfParent() {
        return super.money; // explicitly
    }
    
    void initializeProperty(int money, boolean hasHome, String collegeName, boolean hasEducation) {
        super.money = money;
        super.hasHome = hasHome;
        this.hasEducation = hasEducation;
        this.collegeName = collegeName;
    }
    
    void printProperies() {
        System.out.println(hasEducation);
        System.out.println(collegeName);
        System.out.println(money);
        System.out.println(hasHome);
        super.printPropertyParent();
    }

    @Override
    void meraDesh() {           // method overriding
        super.meraDesh();
        System.out.println("This is child class");
    }

}
