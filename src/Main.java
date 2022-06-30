import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        MyArrayList list = new MyArrayList();
        list.add(5);
        list.add(1,6);
        list.add(5);
        list.add(3,7);


        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(8));
        System.out.println(list.contains(6));




    }
}
