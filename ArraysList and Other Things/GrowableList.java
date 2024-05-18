import java.util.ArrayList;
import java.util.Iterator;

class GrowableList {
    
    public static void main(String[] args) {
        
        // Collection Framework

        // collection of objects

        int a = 12;  // primitive datatype

        Integer i = 12;  // object  // wrapper class

        ArrayList list = new ArrayList();

        list.add(12);
        list.add("Hello");
        list.add(13);
        list.add(14);
        list.add(5);

        System.out.println(list);

        ArrayList list2 = new ArrayList();

        list2.add(13);
        list2.add("Hello");
        list2.add('h');
        list2.add(12.34);
        list2.add(true);

        System.out.println(list2);

        ////////////////////////////////////////////////////////////////////////////

        ArrayList list3 = new ArrayList();

        list3.addAll(list);

        System.out.println(list3);

        list3.addAll(3, list2);

        System.out.println(list3);

        Iterator itr = list3.iterator();       // print list
        while (itr.hasNext()) {
            System.out.print(itr.next()+"\t");
        }

        list3.remove(3);

        System.out.println(list3);

        list3.add(5, 77);

        System.out.println(list3);

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Canada");
        list4.add("US");
        list4.add("India");
        System.out.println(list4);

        for (int j = 0; j < list4.size(); j++) {
            System.out.println(list4.get(j));
        }

        for (String data : list4) {
            System.out.println(data);
        }

        list4.set(1, "Pakistan");

        System.out.println(list4);

    }

}