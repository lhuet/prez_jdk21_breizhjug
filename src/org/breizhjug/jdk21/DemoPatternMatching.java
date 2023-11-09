package org.breizhjug.jdk21;

import org.breizhjug.jdk21.patternmatching.Animal;
import org.breizhjug.jdk21.patternmatching.Cat;
import org.breizhjug.jdk21.patternmatching.Dog;

public class DemoPatternMatching {

    public static void main(String[] args) {


        // String processor
        record data(String id, int value, String name) {}
        var mydata = new data("1234", 42, "breizhjug");
        System.out.println(STR."Demo : \{mydata.id}");

        // Pattern matching for switch
        Dog medor = new Dog("medor", "beagle");
        cri(medor);

        Cat minou = new Cat("minou", "maine coon");
        cri(minou);

    }

    public static void cri(Animal animal) {

        // Pattern matching for switch
        // 'case x ->' syntax eliminates the need of break statement
        switch (animal) {
            case null -> System.out.println("Oops ...");
            case Dog dog when dog.name().length()>1 -> dog.ouaf();
            case Dog dog -> dog.ouaf();
            case Cat cat -> cat.miaou();
            // No need to have a default case thanks to sealed class
        }

        // Scope of Pattern variables with type inference and unnamed pattern
        if (animal instanceof Dog(var name, _)) {
            System.out.println(STR. "Le chien \{name} aboie !" );
        } else if (animal instanceof Cat(var name, var breed)) {
            System.out.println(STR. "Le \{breed} \{name} miaule !" );
        }

    }

}
