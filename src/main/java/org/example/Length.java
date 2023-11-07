package org.example;

public class Length {

    private final int value;

    public Length(int value) {
        this.value = value;
    }

    public boolean compareLengths(Length length) {
        return this.value == length.value;
    }
}
