import org.example.Length;
import org.example.Unit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Test
    public void shouldReturnTrueIfInputIs1cm(){
        Length length1 = new Length(1, Unit.CENTIMETER);
        Length length2 = new Length(1, Unit.CENTIMETER);
       assertTrue(length1.equals(length2));
    }

    @Test
    public void shouldReturnFalseIfInputIs2cm(){
        Length length1 = new Length(1, Unit.CENTIMETER);
        Length length2 = new Length(2, Unit.CENTIMETER);
        assertFalse(length2.equals(length1));

    }

    @Test
    public void shouldReturnTrueIfCentimeterAndMeterConversionAreCorrect(){
        Length length1 = new Length(100, Unit.CENTIMETER);
        Length length2 = new Length(1, Unit.METER);
        assertTrue(length2.equals(length1));
    }

    @Test
    public void shouldReturnTrueIfCentimeterAndKilometerConversionAreCorrect(){
        Length length1 = new Length(100, Unit.CENTIMETER);
        Length length2 = new Length(0.001, Unit.KILOMETER);
        assertTrue(length2.equals(length1));
    }
}

