package ListImpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListGuide {
    /**
     * A Guide to the Java LinkedList Baeldung - https://www.baeldung.com/java-linkedlist
     * List is not synchronized by default
     * Creating a synchronized version of list from collections
     *
     */

    public static void main(String[] args) {
        // This is a thread safe list created using collections
        List<String> list = Collections.synchronizedList(new LinkedList<>());
        list.add("Alex");
        list.add("Andy");
        list.add("Ruben");
        System.out.println(list);

        // This is normal linkedList (Not tread safe)
        List<String> newList = new LinkedList<>();
        newList.add("Alex");
        newList.add("Andy");
        newList.add("Ruben");
        System.out.println(newList);
        System.out.println(newList.get(0));


        LinkedList<Object> ll = new LinkedList<>();
        ll.add("My String");
        String [] arr = {"Name", "New, Name"};

        // addAll method of linkedList expects a collection
        ll.addAll(Arrays.asList(arr));

        // addFirst method of linkedList adds the element to the starting of the list
        ll.addFirst("First Name");

        // Similarly, addLast adds the element to the end of the list
        ll.addLast("LastName");

        // removeFirst and removeLast methods of linkedList also work as expected
        ll.removeFirst();

        // We can provide object to the linked list, remove method and removeFirstOccurrence does the same thing
        ll.remove("Name");

        // Removes form beginning as LinkedList implements List and Deque interface
        ll.remove();

        // We can also remove using the item index of the linkedList
        ll.remove(0);
        Boolean status = ll.removeFirstOccurrence("Name");
        System.out.println(status);
        ll.removeLastOccurrence("Name");
        System.out.println(ll);


        LinkedList<String> ll1= new LinkedList<>();
        ll1.add("My");
        ll1.add("Name");
        ll1.add("is");
        ll1.add("My");
        ll1.add("Name");

        ll1.removeLastOccurrence("My");
        System.out.println(ll1);


        // pop method removes first element from the linkedList
        String item = ll1.pop();
        System.out.println(item);
        System.out.println(ll1);

        // pollFirst removes last element from the list
        ll1.pollLast();
        System.out.println(ll1);

        // pollLast removes first element from the list
        ll1.pollFirst();
        System.out.println(ll1);


        LinkedList<Integer> intll1 = new LinkedList<>();

//      pop on empty list throws NoSuchElementException exception
//      intll1.pop();


//      poll1 on empty list just returns null1
        intll1.poll();
        System.out.println(intll1);
    }
}
