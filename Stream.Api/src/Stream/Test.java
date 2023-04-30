package Stream;

import java.util.ArrayList;
import java.util.List;
 
public class Test {
 
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(22);
        list1.add(27);
        list1.add(16);
        list1.add(34);
        list1.add(57);
        list1.add(78);
        System.out.println("Before list is " + list1);
        List<Integer> listEven = new ArrayList<>();
        for (Integer i : list1) {
            if (i % 2 == 0) {
                listEven.add(i);
            }
        }
        System.out.println("Even List is " + listEven);
    }
}