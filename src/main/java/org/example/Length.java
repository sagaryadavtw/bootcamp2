package org.example;

public class Length {

    private final double value;

    private final Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
       int value =  getValuesInCentimeters();
       return value == length.value;
    }

    public int getValuesInCentimeters() {
        int result;
        if (Unit.METER.equals(unit)) {
            result = (int) (value * 100);
        } else if (Unit.KILOMETER.equals(unit)) {
            result = (int) (value * 100000);
        } else {
            result = (int) value;
        }
        return result;
    }
}
