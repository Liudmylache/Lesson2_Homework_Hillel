import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        MyArrayList list = new MyArrayList();
        list.add(5);
        list.add(1,"6");
        list.add(5);
        list.add(3,"7");
        list.set(1,"99");
        list.add(4,"99");



        System.out.println(list);
        System.out.println(list.size());

   //     list.remove("5");
//        list.remove(9);
 //      list.remove(2);
//        list.remove(9);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.indexOf("8"));
        System.out.println(list.subList(1,4));











    }
}
