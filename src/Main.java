import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();
        list.add(5);
        list.add(1,6);
        list.add(5);
        list.add(3,7);
        list.set(1,99);
        list.add(4,99);
        list.set(0,3);
        list.add(4);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(6));
        System.out.println(list.contains(9));
        System.out.println(list.get(4));

        list.remove(3);
        System.out.println(list);

        list.remove(new Integer(3));
        System.out.println(list);
        System.out.println(list.set(2,33));
        System.out.println(list);
        System.out.println(list.indexOf(33));
        System.out.println(list.lastIndexOf(99));
        System.out.println(list.subList(1,2));




















    }
}
