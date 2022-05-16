package ListImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableArrayListImpl {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>(Arrays.asList("one", "two", "three"));
        List<String> finalList = Collections.unmodifiableList(strList);

        System.out.println(strList);
        System.out.println(finalList);

        // UnsupportedOperationException
        finalList.add("Something");


    }
}
