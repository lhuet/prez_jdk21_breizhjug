package org.breizhjug.jdk21.patternmatching;

public record Dog(String name, String breed) implements Animal {
    public void ouaf() {
        System.out.println("OUAF OUAF !");
    }
}
