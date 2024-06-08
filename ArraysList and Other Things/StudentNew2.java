import java.util.ArrayList;

public class StudentNew2 {

    public StudentNew2(String name, int age) {
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

        ArrayList<StudentNew2> list = new ArrayList<>();

        list.add(new StudentNew2("Maulik", 27));
        list.add(new StudentNew2("Kaivan", 23));
        list.add(new StudentNew2("Bhaumik", 24));
        list.add(new StudentNew2("Harsh", 26));

        System.out.println(list);

        System.out.println(new StudentNew2("Dip", 89));

        StudentNew2 stnew = new StudentNew2("Kaivan", 20);

    }

}