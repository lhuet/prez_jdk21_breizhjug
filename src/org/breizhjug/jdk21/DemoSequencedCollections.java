package org.breizhjug.jdk21;

import java.util.*;

public class DemoSequencedCollections {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.addFirst("Hello");
        myList.addLast("BreizhJUG !");
        myList.addFirst("Hey !"); // move the previous items
        System.out.println(myList);

        SortedSet<String> mySortedSet = new TreeSet<>(List.of("A", "B", "C"));
        mySortedSet.addLast("D"); // Throw UnsupportedOperationException

        var liste = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        var a_l_envers = liste.reversed();
        a_l_envers.add(1,"e");
        liste.set(3, "z");

    }
}
