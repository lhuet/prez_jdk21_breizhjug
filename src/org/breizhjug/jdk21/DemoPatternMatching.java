package org.breizhjug.jdk21;

import org.breizhjug.jdk21.patternmatching.Animal;
import org.breizhjug.jdk21.patternmatching.Cat;
import org.breizhjug.jdk21.patternmatching.Dog;

public class DemoPatternMatching {

    public static void main(String[] args) {

        record data(String id, int value, String name) {}

        var mydata = new data("1234", 42, "breizhjug");

        System.out.println(STR."Demo : \{mydata.id}");

        Dog medor = new Dog("medor");
        cri(medor);

        Cat minou = new Cat("minou");
        cri(minou);


    }

    public static void cri(Animal animal) {

        switch (animal) {
            case null -> System.out.println("Oops ...");
            case Dog dog -> dog.ouaf();
            case Cat cat -> cat.miaou();
            // No need to have a default case thanks to sealed class
        }

    }

}
