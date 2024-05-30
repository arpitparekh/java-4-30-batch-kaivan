import java.util.*;

public class StackDemoClass {
    public static void main(String[] args) {



        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(10.5);
        list1.add(20.5);
        list1.add(10.5);
        list1.add(20.5);
        list1.add(10.5);
        list1.add(20.5);
        list1.add(20.5);  // 7 + 7

        list1.ensureCapacity(20);


        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(10.5);
        list2.add(20.5);

        ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();
        // list3.add(list1);
        // list3.add(list2);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(10);
        list4.add(20);
        list4.add(30);
        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(11);
        list5.add(21);

        list3.add(list4);
        list3.add(list5);
        System.out.println(list3);

        Iterator i2 = list3.iterator();

        while (i2.hasNext()) {
            System.out.println(i2.next());
        }
        
        ///////////////////////////////////////

        LinkedList<String> l1 = new LinkedList<>();
        l1.add("Kaivan");
        l1.add("Shah");
        l1.add("Java");
        l1.add("Developer");

        System.out.println(l1);

        //////////////////////////////////////////

        Iterator i = l1.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        ///////////////////////////////////////////////////////////////

        // vector // Enumeration

        Vector v = new Vector<>();
        v.addElement("Kaivan");
        v.addElement("Shah");
        v.addElement("Java");

        Enumeration e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        //////////////////////////////////////////////////////////

        // LIFO  // stack

        Stack<Integer> stack = new Stack<>();

        stack.push(12);
        stack.push(14);
        stack.push(15);
        stack.push(17);

        stack.pop();
        stack.pop();

        System.out.println(stack.peek());

        System.out.println(stack);

        //////////////////////////////////////////////////////////
        
        // key value

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Physics", 13);
        map.put("Math", 0);
        map.put("Chemistry", 11);
        map.put("Bio", 0);
        map.put("Dance", 1);
        map.put("Dance", 12);

        System.out.println(map);


        System.out.println(map.get("Chemistry"));
        

    }
}
