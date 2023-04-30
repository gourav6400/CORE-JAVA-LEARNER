package Personal_Practise;

import java.util.ArrayList;
import java.util.Iterator;

public class Interator {
  public static void main(String[] args) {
  
    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Suzuky");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
  
    // Get the iterator
    Iterator<String> it = cars.iterator();
  
    // Print the first item
    System.out.println(it.next());
    System.out.println(it.next());
    System.out.println(it.next());
    System.out.println(it.next());
  }
}



