package ListImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListImpl {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> cpwArList = new CopyOnWriteArrayList<>(new Integer[] {10, 20, 30, 40});

        // Snapshot is taken when iterator is created
        Iterator<Integer> itr = cpwArList.iterator();

        cpwArList.add(50);

        // Since the snapshot is taken before 50 was added so output here does not contain 50
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println();

        // This is a new iterator created after 50 was added
        Iterator<Integer> itr2 = cpwArList.iterator();

        // Output here contains 50
        while (itr2.hasNext()){
            System.out.print(itr2.next()+ " ");
        }

        System.out.println();

        // Output here contains 50 as well because iterator is created internally here
        for (int i: cpwArList) {
            System.out.print(i+ " ");
        }

    }
}
