import java.util.ArrayList;

public class StudentNew {

    public StudentNew(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name = "";
    private int age = 0;

    @Override
    public String toString() {
        return name + " : " + age;
    }

    public static void main(String[] args) {

        ArrayList<StudentNew> list = new ArrayList<>();

        list.add(new StudentNew("Maulik", 27));
        list.add(new StudentNew("Kaivan", 23));
        list.add(new StudentNew("Bhaumik", 24));
        list.add(new StudentNew("Harsh", 26));

        System.out.println(list);

        System.out.println(new StudentNew("Dip", 89));

        StudentNew stnew = new StudentNew("Kaivan", 20);

    }

}

public class Demo {
    
}