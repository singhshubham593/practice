import java.util.ArrayList; // import  arrayList package.
import java.util.Collections; // import Collection package.
//import java.util.*;   /// import all package

public class ArrayListExam {
    public static void main(String[] arga) {
        ArrayList<Integer> list = new ArrayList<>(); // Object<Class> Name = new(Keyword) Object<>();

        //add element in list
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(8);
        list.add(1);
        System.out.println(list);

        //get value at any index
        int IndexValue = list.get(3);
        System.out.println(IndexValue);

        //To add element in between to index
        list.add(1, 0);
        System.out.println(list);

        //to change the value of any index
        list.set(5, 9);
        System.out.println(list);

        //delete value at any index element
        list.remove(3);
        System.out.println(list);

        // to get size of any ArrayList
        int size = list.size();
        System.out.println(size);

        //loop in ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // sorting in ArrrayList
        Collections.sort(list);
        System.out.println(list);
    }
}

