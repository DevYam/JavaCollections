package ListImpl;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListImpl {
    /**
     * Random access from arraylist takes O(1) time
     * Adding an element takes O(1) time as initial size of arrayList is 10
     * Insertion or deletion takes O(n) time because it requires array resizing
     * Searching from an arraylist takes O(n) time if arraylist in unsorted and O(log n) if sorted
     */



    public static void main(String[] args) {
        // It is a good practice to use generic interface List as variable because it decouples it from particular implementation

        // This is default no args constructor with initial capacity of 10
        List<String> stringList = new ArrayList<>();
        System.out.println(stringList.isEmpty());

        // ArrayList with initialCapacity
        List<String> strList = new ArrayList<>(20);

        // Array List accepting collections

        Collection<Integer> number = IntStream.range(0,15).boxed().collect(Collectors.toSet());
        System.out.println(number.getClass().getName());

        // Arraylist constructor accepts a collection
        List<Integer> newList1 = new ArrayList<>(number);
        System.out.println(newList1.size());

        System.out.println(newList1.get(7));

        List<Integer> newList2 = new ArrayList<>();
        newList2.add(10);
        newList2.add(20);
        newList2.add(30);
        System.out.println(newList2);

        // Adding item at a particular index; This will not replace the item it will shift other items and resize the array
        newList2.add(1, 15);
        System.out.println(newList2);

        ListIterator<Integer> it = newList2.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();
        ListIterator<Integer> itRev  = newList2.listIterator(newList2.size());
        while (itRev.hasPrevious()){
            System.out.println(itRev.previous());
        }

        List<Integer> listToRev = new ArrayList<>();
        listToRev.add(10);
        listToRev.add(20);
        listToRev.add(10);
        listToRev.add(10);
        listToRev.add(30);
        listToRev.add(40);

        // Collections reverse the original list
        Collections.reverse(listToRev);
        System.out.println(listToRev);

        /**
         * Search in Arraylist
         */

        System.out.println(listToRev.indexOf(10));
        System.out.println(listToRev.lastIndexOf(10));





    }


}
