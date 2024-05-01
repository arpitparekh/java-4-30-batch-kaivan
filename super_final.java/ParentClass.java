class ParentClass {

    public ParentClass(int x) {
        System.out.println("This is parent class : " + x);
    }

    // public ParentClass(){
    //     System.out.println("This is Default Constructor");
    // }

    int money = 0;
    private boolean hasCar = false;
    protected boolean hasHome = false;

    int getMoney() {
        return money;
    }

    void initializeProperty(boolean hasCar) {
        this.hasCar = hasCar;
    }

    void printPropertyParent() {
        System.out.println(hasCar);
    }

    void meraDesh() {
        System.out.println("Mera desh mahan");
    }
}