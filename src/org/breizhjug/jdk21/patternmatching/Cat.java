package org.breizhjug.jdk21.patternmatching;

public record Cat(String name) implements Animal {

    public void miaou() {
        System.out.println("Miaou ...");
    }
}
